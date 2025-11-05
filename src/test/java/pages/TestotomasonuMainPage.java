package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TestotomasonuMainPage {

    public TestotomasonuMainPage() {
        // This line initializes all the @FindBy elements below
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='global-search']")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@*='prod-img']")
    public List<WebElement> searchResult;

    @FindBy(xpath = "//*[@class='product-count-text']")
    public WebElement searchResultText;

    @FindBy(xpath = "//div[@class=' heading-sm mb-4']")
    public WebElement firstSearchResult;

    @FindBy(xpath = "//span[.='Account']")
    public WebElement accountButton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement loginPageEmailBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement getLoginPagePassBox;

    @FindBy(id = "submitlogin")
    public WebElement submitButton;

    @FindBy(xpath = "//span[.='logout']")
    public WebElement logOutButton;


}
