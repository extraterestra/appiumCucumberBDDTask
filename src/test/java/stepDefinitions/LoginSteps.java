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

    @Given("Application is opened in emulator")
    public void application_is_opened() throws MalformedURLException, InterruptedException {
        Android_setUp();
        System.out.println("Emulator opened");

    }

    @When("User Click Log In Button")
    public void user_click_log_in_button() {
        loginPage = new LoginPage(driver);
        listingPage = new ListingPage(driver);
        loginPage.clickLogInBtn();
    }

    @When("Listing page opened with listing option {string}")
    public void listing_page_opened_with_listing_option(String option) {
        Assert.assertEquals(listingPage.getNativeViewOptionText(), option);
    }

    @When("User fill {string} in username field")
    public void userFillInvalidUserInUsernameField(String userName) {
        loginPage = new LoginPage(driver);
        loginPage.fillUserName(userName);
    }

    @When("User fill {string} in password field")
    public void userFillInvalidPasswordInPasswordField(String password) {
        loginPage = new LoginPage(driver);
        loginPage.fillPassword(password);
    }

    @Then("Invalid Credentials pop up displayed with text {string}")
    public void invalidCredentialsPopUpDisplayed(String text) {
        popup = new InvalidCredentialsPopUp(driver);
        Assert.assertEquals(popup.getPopUpTextMessage(), text);
    }

    @When("User can close pop up")
    public void userCanClosePopUp() {
        popup.closePopUp();
    }

    @Then("Log in screen displayed")
    public void logInScreenDisplayed() {
        loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isLogInButtonEnabled());

    }
}
