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
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

public class ApiDemosScrool {
    ApiDemosScroolPage apiDemosScroolPage = new ApiDemosScroolPage();

    public ApiDemosScrool() throws MalformedURLException {
    }

    @Given("kullanici viewse tiklar")
    public void kullanici_viewse_tiklar() throws InterruptedException, MalformedURLException {
        ReusableMethods.clickOnPage("Views");
    }

    @Given("kullanici Switches tiklar")
    public void kullanici_switches_tiklar() throws InterruptedException, MalformedURLException {

       ReusableMethods.clickOnPage("Switches");

    }

    @And("kullanici webview{int} tiklar")
    public void kullaniciWebviewTiklar(int arg0) throws MalformedURLException {
        //uygulamanin asagi bolumlerine scrool yaparak tiklar
        ReusableMethods.scrollWithUiScrollable("WebView");
    }
}
