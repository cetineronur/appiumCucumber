package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.net.MalformedURLException;

public class ApiDemosExpandablePage {
    public ApiDemosExpandablePage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()), this);
    }
    @AndroidFindBy(xpath = "//*[@text='Arnold']")
    public WebElement arnold;

    @AndroidFindBy(xpath = "//*[@text='Sample action']")
    public WebElement sampleAction;

}
