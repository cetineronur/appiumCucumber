package pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.net.MalformedURLException;
import java.util.List;

public class GeneralStorePage {
    public GeneralStorePage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }


    @AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    public AndroidElement country;

    @AndroidFindBy(className = "android.widget.TextView")
    public AndroidElement country1;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
    public AndroidElement yourName;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    public AndroidElement letsShop;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='ADD TO CART'])[1]")
    public AndroidElement firstProduct;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
    public AndroidElement card;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='$165.0']")
    public AndroidElement jordan6;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='$160.97']")
    public AndroidElement airjordan;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='$ 325.97']")
    public AndroidElement total;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnProceed")
    public AndroidElement visit;

}
