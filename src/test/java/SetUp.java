import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;


public class SetUp {

    public static AppiumDriver<WebElement> driver;
    //public static AndroidDriver driver;
    public static DesiredCapabilities cap;

    //to setup your app and open it without install
    public static void Android_LaunchApp() throws MalformedURLException {
        cap = new DesiredCapabilities();
        //cap.setCapability("automationName", "Appium");
        cap.setCapability("platformName","Android");
        cap.setCapability("deviceName", "MiA1");
        cap.setCapability("platformVersion", "9");
        cap.setCapability("udid","2543e0560504");

        cap.setCapability("appPackage","com.madarsoft.thekr");
        cap.setCapability("appActivity","com.madarsoft.thekr.activities.SplashScreen");

        //cap.setCapability("app", "C:\\Users\\AhmedRaafat\\Desktop\\Zakker.apk");
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        Assert.assertNotNull(driver);
    }


    //to close your app
    public static void CloseApp(){
        driver.quit();
    }
}
