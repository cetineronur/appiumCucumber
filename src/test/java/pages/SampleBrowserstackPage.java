package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.net.MalformedURLException;

public class SampleBrowserstackPage {
    public SampleBrowserstackPage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }
    @AndroidFindBy(xpath = "(//android.widget.ImageView)[1]")
    public AndroidElement search;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Search…']")
    public AndroidElement search1;

    @AndroidFindBy(className = "android.widget.LinearLayout")
    public AndroidElement firstwahl;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Appium']")
    public AndroidElement appiumText;


}
