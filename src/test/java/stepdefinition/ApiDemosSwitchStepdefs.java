package stepdefinition;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ApiDemosSwitchPage;
import utilities.Driver;

public class ApiDemosSwitchStepdefs {

    ApiDemosSwitchPage apiDemosSwitchPage = new ApiDemosSwitchPage();

    @Given("kullanici Switchi tiklar")
    public void kullanici_switchi_tiklar() {
        apiDemosSwitchPage.switchtext.click();
    }

    @Given("kullanici ilk Switch butonunu acar")
    public void kullanici_ilk_switch_butonunu_acar() {
        TouchAction touchAction = new TouchAction(Driver.get());
        if(apiDemosSwitchPage.firstSwitch.getAttribute("text").equals("OFF")){
            touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(apiDemosSwitchPage.firstSwitch))).perform();
           //apiDemosSwitchPage.firstSwitch.click();
        }
    }

    @Then("kullanici ilk Switch butonunun acik oldugunu onaylar")
    public void kullanici_ilk_switch_butonunun_acik_oldugunu_onaylar() {
        Assert.assertEquals("ON",apiDemosSwitchPage.firstSwitch.getText());
    }
}
