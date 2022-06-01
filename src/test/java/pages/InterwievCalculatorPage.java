package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.net.MalformedURLException;

public class InterwievCalculatorPage {

    public InterwievCalculatorPage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
    public AndroidElement iki;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_3")
    public AndroidElement uc;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_9")
    public AndroidElement dokuz;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_5")
    public AndroidElement bes;

    @AndroidFindBy(id = "com.google.android.calculator:id/eq")
    public AndroidElement equal;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_sqrt")
    public AndroidElement sqrt;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_mul")
    public AndroidElement carp;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_sub")
    public AndroidElement eksi;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_add")
    public AndroidElement plus;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    public AndroidElement sonuc;

}
