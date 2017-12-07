package AppiumSupport;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumController {

    public static OS executionOS = OS.ANDROID;

    public enum OS {
        ANDROID,
        IOS
    }
    public static AppiumController instance = new AppiumController();
    public AppiumDriver driver;

    public void start() throws MalformedURLException {
        if (driver != null) {
            return;
        }
        switch(executionOS){
            case ANDROID:
                File classpathRoot = new File(System.getProperty("user.dir"));
                File appDir = new File(classpathRoot, "/app/Android");
                File app = new File (appDir, "Glyco.apk");
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("deviceName", "Nexus_4_API_22");
                capabilities.setCapability("app", app.getAbsolutePath());
                capabilities.setCapability("appPackage", "com.holmusk.glycoleap");
                capabilities.setCapability("appActivity", "com.holmusk.glycoleap.ui.activity.SplashActivity");
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;
            case IOS:


                classpathRoot = new File(System.getProperty("user.dir"));
                appDir = new File(classpathRoot, "/app/Ios/");
                app = new File(appDir, "Glyco.app");
                capabilities = new DesiredCapabilities();
                capabilities.setCapability("platformName", "ios");
                capabilities.setCapability("deviceName", "iPhone X");
                capabilities.setCapability("platformVersion","11.0");
                capabilities.setCapability("AutomationName","XCUITest");

                capabilities.setCapability("app", app.getAbsolutePath());
                driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;

           // capabilities.setCapability("udid","8DE40AF5-3280-4ACF-B8CD-1507F6C305");
        }

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    public void stop() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
