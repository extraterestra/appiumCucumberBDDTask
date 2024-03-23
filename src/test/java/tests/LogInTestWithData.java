package tests;

import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.InvalidCredentialsPopUp;
import pageObjects.ListingPage;
import pageObjects.LoginPage;
import utils.JsonReader;

import java.io.IOException;
import java.net.MalformedURLException;

public class LogInTestWithData extends TestBase {

    LoginPage loginPage;
    ListingPage listingPage;
    InvalidCredentialsPopUp invalidCredentialsPopUp;

    @DataProvider(name = "test data")
    public Object[][] passData() throws IOException, ParseException {
        return JsonReader.getJSONdata
        (System.getProperty("user.dir") + "\\data\\CredentialsData.json"
                        , "Credentials Data", 3);
    }

    @Test(dataProvider = "test data")
    public void verify_log_in(String username, String password, String isLoginAllowed) throws MalformedURLException, InterruptedException {
        Android_setUp("appiumChallenge");
        loginPage = new LoginPage(driver);
        listingPage = new ListingPage(driver);
        invalidCredentialsPopUp = new InvalidCredentialsPopUp(driver);
        loginPage.fillCredentials(username, password);
        loginPage.clickLogInBtn();
        if(isLoginAllowed.equals("true"))
           {Assert.assertEquals(listingPage.isElementPresentOnPage(), true);}
        else
           {Assert.assertEquals(invalidCredentialsPopUp.isElementPresentOnPage(), true);}

        tearDown();
    }
}
