package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.net.MalformedURLException;

public class BrowserStackUIelementIosPage {
    public BrowserStackUIelementIosPage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }

    @iOSXCUITFindBy(accessibility = "Text Button")
    public IOSElement textButton;

    @iOSXCUITFindBy(accessibility = "Text Input")
    public IOSElement textInput;

    @iOSXCUITFindBy(accessibility = "Return")
    public IOSElement Return;

    @iOSXCUITFindBy(accessibility = "Text Output")
    public IOSElement TextOutput;
}
