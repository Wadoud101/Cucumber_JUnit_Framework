package stepDefinitions;


import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestotomasonuMainPage;
import utilities.ConfigReader;
import utilities.Driver;

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
}
