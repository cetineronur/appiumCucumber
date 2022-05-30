package utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class ReusableMethods {

    public static void clickOnPage(String pageName) throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        List<AndroidElement> pages = Driver.get().findElementsByClassName("android.widget.TextView");
        for (MobileElement page: pages) {
            if (page.getText().equals(pageName)){
                page.click();
                break;
            }else{
                scrollWithUiScrollable(pageName);
                break;
            }
        }
    }

    //ikinci alternatif bir method
    public static void clickOnPage1(String pageName) throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        List<AndroidElement> pages = Driver.get().findElementsByXPath("//*[@text='"+pageName+"']");
        if (pages.size()>0){
            pages.get(0).click();
        }else scrollWithUiScrollable(pageName);
    }

    public static void scrollWithUiScrollable(String elementText) throws MalformedURLException {
        AndroidDriver driver = (AndroidDriver) Driver.get();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+elementText+"\"))");
        driver.findElementByXPath("//*[@text='"+elementText+"']").click();
    }

    public static void longPressOnElement(WebElement mobileElement) throws MalformedURLException {
        TouchAction touchAction = new TouchAction(Driver.get());
        touchAction.longPress(ElementOption.element(mobileElement)).release().perform();
    }

    public static void clickOnPageIOS(String text) throws MalformedURLException {
        List<AndroidElement> pages = Driver.get().findElementsByXPath("//XCUIElementTypeStaticText[@name='"+text+"']");
        if (pages.get(0).isDisplayed()){
            pages.get(0).click();
        }else{
            scrollAndClickOnIOS(text);
        }
    }

    public static void scrollAndClickOnIOS(String text) throws MalformedURLException {
        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        scrollObject.put("value",text);
        Driver.get().executeScript("mobile: scroll", scrollObject);

        Driver.get().findElementByXPath("//XCUIElementTypeStaticText[@name='"+text+"']").click();
    }

    public static void toastMessageValidate(String message) throws MalformedURLException {
        Assert.assertTrue(Driver.get().findElementByXPath("//android.widget.Toast").getAttribute("name").contains(message));
    }

    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
