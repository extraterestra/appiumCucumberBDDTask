package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class InvalidCredentialsPopUp extends PageBase {

    public InvalidCredentialsPopUp(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "//*[@resource-id='android:id/title_template' and @class='android.widget.LinearLayout' and @index='0']")
    MobileElement popUp;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView")
    MobileElement popUpMessage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
    MobileElement popUpOkBtn;

    public String getPopUpTextMessage() {
        return getElementText(popUpMessage);
    }

    public void closePopUp() {
        click(popUpOkBtn);
    }

    public Boolean isElementPresentOnPage() {
        return isElementPresent(popUp,
                "//*[@resource-id='android:id/title_template' and @class='android.widget.LinearLayout' and @index='0']");
    }
}
