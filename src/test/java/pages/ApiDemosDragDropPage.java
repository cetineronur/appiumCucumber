package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ApiDemosDragDropPage {
    public ApiDemosDragDropPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
    public WebElement views;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Drag and Drop']")
    public WebElement dragDrop;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_1")
    public WebElement dot1;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_1")
    public WebElement dot2;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_1")
    public WebElement dot3;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_result_text")
    public WebElement text;
}
