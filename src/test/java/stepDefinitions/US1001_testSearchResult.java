package stepDefinitions;


import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestotomasonuMainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US1001_testSearchResult {

    TestotomasonuMainPage mainPage = new TestotomasonuMainPage();
    @Given("user could get in main page")
    public void user_could_get_in_main_page() {

        Driver.getDriver().get(ConfigReader.getProperty("toURL"));
    }

    @When("search for phone in search box")
    public void search_for_phone_in_search_box() {

        mainPage.searchBox.sendKeys("phone" + Keys.ENTER);

    }

    @When("search for shoe in search box")
    public void searchForShoeInSearchBox() {
        mainPage.searchBox.sendKeys("shoe" + Keys.ENTER);
    }

    @Then("test that search result found")
    public void test_that_search_result_found() {
        String actualText =  mainPage.searchResultText.getText();
        String expectedText = "0 Products Found";
        Assertions.assertNotEquals(expectedText,actualText);

    }

    @Then("close the page")
    public void close_the_page() {

        Driver.quitDriver();
    }


    @When("search for {string} in search box")
    public void searchForInSearchBox(String searchText) {
        mainPage.searchBox.sendKeys(searchText + Keys.ENTER);

    }

    @Then("test that what is search result")
    public void testThatWhatIsSearchResult() {
        System.out.println(mainPage.searchResultText.getText());
    }

    @Given("user get to the {string}")
    public void userGetToThe(String parameter) {
        Driver.getDriver().get(ConfigReader.getProperty(parameter));
    }

    @Then("click the account login button")
    public void clickTheAccountLoginButton() {
        mainPage.accountButton.click();
    }

    @When("enter {string} as email address")
    public void enterAsEmailAddress(String param1) {
        mainPage.loginPageEmailBox.sendKeys(ConfigReader.getProperty(param1));
    }

    @And("enter {string} as password")
    public void enterAsPassword(String param2) {
        mainPage.getLoginPagePassBox.sendKeys(ConfigReader.getProperty(param2));
    }

    @And("wait for {int} second")
    public void waitForSecond(int num) {
        ReusableMethods.wait(num);
    }

    @And("press the sign in button")
    public void pressTheSignInButton() {
        mainPage.submitButton.click();
    }

    @Then("verify that he could not entered to the system")
    public void verifyThatHeCouldNotEnteredToTheSystem() {
        mainPage.loginPageEmailBox.isDisplayed();
    }
}
