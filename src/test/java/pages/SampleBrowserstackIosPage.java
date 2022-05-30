package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.net.MalformedURLException;

public class SampleBrowserstackIosPage {

    public SampleBrowserstackIosPage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }

    @AndroidFindBy(accessibility = "Text Button")
    public IOSElement textButton;

    @AndroidFindBy(accessibility = "Text Input")
    public IOSElement textInput;

    @AndroidFindBy(accessibility = "Return")
    public IOSElement return1;

    @AndroidFindBy(accessibility = "Text Output")
    public IOSElement output;

    @AndroidFindBy(xpath = "(//XCUIElementTypeButton[@name='UI Elements'])[1]")
    public IOSElement uielemnttext;

}
