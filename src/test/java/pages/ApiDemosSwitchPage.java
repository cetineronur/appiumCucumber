package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.net.MalformedURLException;

public class ApiDemosSwitchPage {

    public ApiDemosSwitchPage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='9. Switch']")
    public WebElement switchtext;

    @AndroidFindBy(xpath = "(//android.widget.Switch)[1]")
    public WebElement firstSwitch;
}
