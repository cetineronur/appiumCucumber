package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.net.MalformedURLException;

public class TrendyolPage {

    public TrendyolPage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }

    @AndroidFindBy(id="trendyol.com:id/textViewTitle")
    public AndroidElement firstcheck;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Germany']")
    public AndroidElement germany;

    @AndroidFindBy(xpath = "(//android.widget.ImageView)[3]")
    public AndroidElement kostenlos;

    @AndroidFindBy(xpath = "(//android.widget.ImageView)[13]")
    public AndroidElement firstProdukt;

    @AndroidFindBy(xpath = "(//android.widget.ImageView)[21]")
    public AndroidElement secondProdukt;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='IN DEN WARENKORB']")
    public AndroidElement warenkornButton;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[8]")
    public AndroidElement groSe;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='ZUR KASSE']")
    public AndroidElement zurKasse;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='NONE OF THE ABOVE']")
    public AndroidElement noneOfTheAbbove;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
    public AndroidElement emailTextBox;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
    public AndroidElement passwordTextBox;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='ANMELDEN']")
    public AndroidElement anmelden;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SPEICHERN']")
    public AndroidElement speichern;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Neu!']")
    public AndroidElement obenMessage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='weiter mit Google']")
    public AndroidElement mithGoogleButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='cetineronur44@gmail.com']")
    public AndroidElement chooceAnAccount;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='PayPal']")
    public AndroidElement paypalRadoiButton;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[7]")
    public AndroidElement summe1;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[13]")
    public AndroidElement summe2;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[17]")
    public AndroidElement totalSumme;

    @AndroidFindBy(accessibility = "Startseite")
    public AndroidElement startseite;

}
