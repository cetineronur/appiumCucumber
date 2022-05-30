package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.net.MalformedURLException;

public class ApiDemosDateWidgetsPage {
    public ApiDemosDateWidgetsPage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Widgets']")
    public AndroidElement datewidget;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='2. Inline']")
    public AndroidElement inline;

    @AndroidFindBy(xpath = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='9']")
    public AndroidElement dokuzrakami;

    @AndroidFindBy(xpath = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"15\"]")
    public AndroidElement onbesrakami;

    @AndroidFindBy(xpath = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"45\"]")
    public AndroidElement kirkbesrakami;

}
