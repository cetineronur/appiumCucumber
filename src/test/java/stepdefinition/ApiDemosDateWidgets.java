package stepdefinition;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Given;
import pages.ApiDemosDateWidgetsPage;
import utilities.Driver;

public class ApiDemosDateWidgets {

    ApiDemosDateWidgetsPage apiDemosDateWidgets = new ApiDemosDateWidgetsPage();

    @Given("kullanici Date Widget e tiklar")
    public void kullanici_date_widget_e_tiklar() {
        apiDemosDateWidgets.datewidget.click();
    }
    @Given("kullanici inline tiklar")
    public void kullanici_inline_tiklar() {
       apiDemosDateWidgets.inline.click();
    }
    @Given("kullanici dokuza tiklar")
    public void kullanici_dokuza_tiklar() {
        apiDemosDateWidgets.dokuzrakami.click();
    }
    @Given("kullanici saati dokuzkirbes olarak ayarlar")
    public void kullanici_saati_dokuzkirbes_olarak_ayarlar() {
        TouchAction touchAction = new TouchAction(Driver.get());
        touchAction.press(ElementOption.element(apiDemosDateWidgets.onbesrakami)).
                moveTo(ElementOption.element(apiDemosDateWidgets.kirkbesrakami)).release().perform();
    }

}
