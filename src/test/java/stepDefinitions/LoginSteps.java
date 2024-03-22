package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.ListingPage;
import pageObjects.LoginPage;
import tests.TestBase;
import java.net.MalformedURLException;

public class LoginSteps extends TestBase {
    LoginPage loginPage;
    ListingPage listingPage;

    @Given("Application is opened in emulator")
    public void application_is_opened() throws MalformedURLException {
        Android_setUp();
    }

    @When("User Click Log In Button")
    public void user_click_log_in_button() {
        loginPage = new LoginPage(driver);
        listingPage = new ListingPage(driver);
        loginPage.clickLogInBtn();
    }

    @When("Listing page opened with listing option {string}")
    public void listing_page_opened_with_listing_option(String option) throws MalformedURLException {
        Assert.assertEquals(listingPage.getNativeViewOptionText(), option);
    }
}
