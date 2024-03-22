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

    @AndroidFindBy(xpath = "editTextTitre")
    MobileElement passwordField;

    public void clickLogInBtn() {
        click(logInButton);
    }

}
