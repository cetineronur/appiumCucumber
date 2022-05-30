package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver() {
    }

    private static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> get() throws MalformedURLException {
        if (driver == null) {
            String platform = ConfigurationReader.getProperty("platform");
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

            switch (platform) {
                case "android":
                    desiredCapabilities.setCapability("platformName", "Android");
                    desiredCapabilities.setCapability("platformVersion", "8.0");
                    desiredCapabilities.setCapability("deviceName", "Pixel_2");
                    desiredCapabilities.setCapability("automationName", "UiAutomator2");
                    //desiredCapabilities.setCapability("orientation","LANDSCAPE");
                   //desiredCapabilities.setCapability("appPackage",ConfigurationReader.getProperty("appPackage"));
                   //desiredCapabilities.setCapability("appActivity",ConfigurationReader.getProperty("appActivity"));
                    desiredCapabilities.setCapability("app", "D:\\mobileTesting\\AppiumCucumber\\General-Store.apk");

                        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
                        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                   // break;
                case "browserstack":
                    DesiredCapabilities caps = new DesiredCapabilities();
                    caps.setCapability("browserstack.user", "kartalonur_mgHvyd");
                    caps.setCapability("browserstack.key", "fXrFzL6ssywwWRPyj9Ht");

                    // Set URL of the application under test
                    caps.setCapability("app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");
                    caps.setCapability("device", "iPhone XS");
                    caps.setCapability("os_version", "12");

                    // Set other BrowserStack capabilities
                    caps.setCapability("project", "First Java Project");
                    caps.setCapability("build", "browserstack-build-1");
                    caps.setCapability("name", "first_test");


                        IOSDriver<IOSElement> iosDriver = new IOSDriver<IOSElement>(
                                new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);
                        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                    break;
                default:
            }
        }
        return driver;
    }
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}