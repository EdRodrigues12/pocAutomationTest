package configuration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

public class DriverFactory {
    private static AppiumDriver<?> appiumDriver;

    public static AppiumDriver<?> createDriverByParameter(String plataformName) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (plataformName.equals("Android")) {
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("appPackage", "com.android.calculator2");
            capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
            capabilities.setCapability("autoGrantPermissions", true);
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("avdArgs", "-no-window");
            appiumDriver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);

        } else {
            Logger.getGlobal().info("========== Plataform name dont exist!! ==========");
        }
        return appiumDriver;
    }

    public static AppiumDriver<?> getDriver() {
        return appiumDriver;
    }

    public static void quitDriver() {
        if (appiumDriver != null)
            appiumDriver.quit();
    }

}
