package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends PageBase {

    public LoginPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(accessibility = "login")
    MobileElement logInButton;

    @AndroidFindBy(accessibility = "username")
    MobileElement usernameField;

    @AndroidFindBy(accessibility = "password")
    MobileElement passwordField;

    public void clickLogInBtn() {
        click(logInButton);
    }

    public void fillUserName(String userName) {
        clear(usernameField);
        sendText(usernameField, userName);
    }

    public void fillPassword(String password) {
        clear(passwordField);
        sendText(passwordField, password);
    }

    public Boolean isLogInButtonEnabled() {
        return isElementEnabled(logInButton);
    }

    public void fillCredentials(String usernane, String password) {
        fillUserName(usernane);
        fillPassword(password);
    }
}
