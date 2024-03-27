package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    public static AppiumDriver driver;

    public void Android_setUp(String appName) throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "7.0");
        cap.setCapability("deviceName", "Android Emulator v.7.0");
        cap.setCapability("app",
                (System.getProperty("user.dir") + "\\apps\\"+ appName + ".apk"));
        cap.setCapability("automationName", "UiAutomator2");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);

    }

    public static void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }

}
