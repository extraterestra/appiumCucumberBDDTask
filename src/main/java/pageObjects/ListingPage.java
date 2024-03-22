package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ListingPage extends PageBase{

    public ListingPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "7d137913-d8ea-4faa-870d-a112278c53b6")
    MobileElement nativeView;

    public void clickNativeViewOption() {
        click(nativeView);
    }

    public String getNativeViewOptionText() {
        return getAttribute(nativeView, "getElementText");
    }
}
