package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.InvalidCredentialsPopUp;
import pageObjects.ListingPage;
import pageObjects.LoginPage;
import tests.TestBase;
import java.net.MalformedURLException;

public class LoginSteps extends TestBase {
    LoginPage loginPage;
    ListingPage listingPage;
    InvalidCredentialsPopUp popup;

    @Given("Application {string} is opened in emulator")
    public void application_is_opened(String appName) throws MalformedURLException, InterruptedException {
        Android_setUp(appName);
        System.out.println("Application opened");

    }

    @When("User Click Log In Button")
    public void  user_click_log_in_button() {
        loginPage = new LoginPage(driver);
        listingPage = new ListingPage(driver);
        loginPage.clickLogInBtn();
    }

    @When("Listing page opened with listing option {string}")
    public void listing_page_opened_with_listing_option(String optionText) {
        listingPage = new ListingPage(driver);
        Assert.assertTrue(listingPage.isOptionEnabled());
        Assert.assertEquals(listingPage.getOptionText(), optionText);
    }

    @When("User fill {string} in username field")
    public void fill_username(String userName) {
        loginPage = new LoginPage(driver);
        loginPage.fillUserName(userName);
    }

    @When("User fill {string} in password field")
    public void fill_password(String password) {
        loginPage = new LoginPage(driver);
        loginPage.fillPassword(password);
    }

    @Then("Invalid Credentials pop up displayed with text {string}")
    public void pop_up_displayed(String text) {
        popup = new InvalidCredentialsPopUp(driver);
        Assert.assertEquals(popup.getPopUpTextMessage(), text);
    }

    @When("User can close pop up")
    public void close_pop_up() {
        popup.closePopUp();
    }

    @Then("Log in screen displayed")
    public void logInScreenDisplayed() {
        loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isLogInButtonEnabled());

    }

    @When("User fill credentials with username {string} and with password {string}")
    public void user_fill_credentials(String username, String password) {
        fill_username(username);
        fill_password(password);
    }
}
