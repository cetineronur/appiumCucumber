package stepdefinition;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Dimension;
import pages.ApiDemosScroolPage;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class ApiDemosScrool {
    ApiDemosScroolPage apiDemosScroolPage = new ApiDemosScroolPage();

    @Given("kullanici viewse tiklar")
    public void kullanici_viewse_tiklar() {
        apiDemosScroolPage.views.click();
    }

    @Given("kullanici Switches tiklar")
    public void kullanici_switches_tiklar() throws InterruptedException {
    
        List<MobileElement> list ;
        do {
            list=apiDemosScroolPage.switches;
            Dimension dimension= Driver.get().manage().window().getSize();

            int start_x= (int) (dimension.width*0.5);
            int start_y= (int) (dimension.height*0.8);

            int end_x = (int) (dimension.width*0.5);
            int end_y = (int) (dimension.height*0.2);

            TouchAction touchAction = new TouchAction(Driver.get());
            touchAction.press(PointOption.point(start_x,start_y)).
                    moveTo(PointOption.point(end_x,end_y)).release().perform();
        }while (list.size()==0);

        apiDemosScroolPage.switches.get(0).click();

    }

    @And("kullanici webview{int} tiklar")
    public void kullaniciWebviewTiklar(int arg0) {
        Driver.get().findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");
        apiDemosScroolPage.webview.click();
    }
}
