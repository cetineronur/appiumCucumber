package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.net.MalformedURLException;

public class ApiDemosPupopPage {

    public ApiDemosPupopPage() throws MalformedURLException {
            PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Popup Menu']")
    public WebElement popup;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='MAKE A POPUP!']")
    public WebElement popupButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add']")
    public WebElement add;
}
