package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    public static AppiumDriver driver;

    public static void androidSetUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformVersion", "11");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("platfromName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        //caps.setCapability("noReset", false);
        //caps.setCapability("fullReset", true);
        caps.setCapability("app", System.getProperty("user.dir") + "/apps/hepsiburada.apk");

        //driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    public static void tearDown(){

        if(driver != null){
            driver.quit();
        }
    }
}