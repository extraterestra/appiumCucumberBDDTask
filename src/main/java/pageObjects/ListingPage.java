package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ListingPage extends PageBase{

    public ListingPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Native View']")
    MobileElement nativeView;

    public void clickNativeViewOption() {
        click(nativeView);
    }

    public String getNativeViewOptionText() {
        return getAttribute(nativeView, "getElementText");
    }
}
