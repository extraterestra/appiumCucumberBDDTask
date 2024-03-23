package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends PageBase{

    public LoginPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='LOG IN']")
    MobileElement logInButton;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"username\"]\n")
    MobileElement usernameField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"password\"]\n")
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

}
