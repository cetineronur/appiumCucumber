package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.accessibility.Accessible;
import java.net.MalformedURLException;
import java.util.List;

public class ApiDemosScroolPage {

    public ApiDemosScroolPage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
    public WebElement views;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Switches']")
    public List<MobileElement> switches;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WebView']")
    public WebElement webview;
}
