package stepdefinition;

import io.cucumber.java.en.Given;
import utilities.ReusableMethods;

import java.net.MalformedURLException;

public class ApiDemosPopup {

    @Given("kullanici toast messageda Add oldugunu dogrular")
    public void kullanici_toast_messageda_add_oldugunu_dogrular() throws MalformedURLException {
        ReusableMethods.toastMessageValidate("Add");
    }
}
