package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ApiDemosPage  {
    public ApiDemosPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public WebElement preference;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='3. Preference dependencies']")
    public WebElement prefence3;

    @AndroidFindBy(id = "android:id/checkbox")
    public WebElement checkbox;

    @AndroidFindBy(xpath = "(//*[@class=\"android.widget.RelativeLayout\"])[2]")
    public WebElement wifiSettings;

    @AndroidFindBy(id = "android:id/edit")
    public WebElement edit;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement okButton;



}
