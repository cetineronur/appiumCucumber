package stepdefinition;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ApiDemosDragDropPage;
import utilities.Driver;

import java.net.MalformedURLException;

public class ApiDemosDragDrop {

   ApiDemosDragDropPage apiDemosDragDrop = new ApiDemosDragDropPage();

    public ApiDemosDragDrop() throws MalformedURLException {
    }

    @Given("Kullanici Views e tiklar")
    public void kullanici_views_e_tiklar() {

        apiDemosDragDrop.views.click();
    }
    @Given("kullanici Drag und Drop a tiklar")
    public void kullanici_drag_und_drop_a_tiklar() {
        apiDemosDragDrop.dragDrop.click();
    }
    @Given("kullanici birinci topu ucuncu topun uzerine birakir")
    public void kullanici_birinci_topu_ucuncu_topun_uzerine_birakir() throws MalformedURLException {
        TouchAction touchAction = new TouchAction(Driver.get());
        touchAction.longPress(ElementOption.element(apiDemosDragDrop.dot1)).
                moveTo(ElementOption.element(apiDemosDragDrop.dot3)).release().perform();
    }
    @Then("kullanici cikan yaziyi dogrular")
    public void kullanici_cikan_yaziyi_dogrular() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(apiDemosDragDrop.text.isDisplayed());
    }

}
