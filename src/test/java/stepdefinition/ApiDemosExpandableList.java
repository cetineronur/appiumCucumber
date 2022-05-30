package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.ApiDemosExpandablePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.MalformedURLException;

public class ApiDemosExpandableList {

    ApiDemosExpandablePage apiDemosExpandablePage = new ApiDemosExpandablePage();

    public ApiDemosExpandableList() throws MalformedURLException {
    }

    @Given("kullanici {string} tiklar")
    public void kullanici_tiklar(String pageName) throws InterruptedException, MalformedURLException {
        ReusableMethods.clickOnPage(pageName);
    }

    @And("kullanici Arnold a uzun basar")
    public void kullaniciArnoldAUzunBasar() throws MalformedURLException {
        ReusableMethods.longPressOnElement(apiDemosExpandablePage.arnold);
    }

    @And("kullanici acilan menuden Sample Action menuyu dogrular")
    public void kullaniciAcilanMenudenSampleActionMenuyuDogrular() throws InterruptedException {
        Assert.assertTrue(apiDemosExpandablePage.sampleAction.isDisplayed());
        Thread.sleep(1000);
        apiDemosExpandablePage.sampleAction.click();
    }


    @And("kullanici cikan {string} dogrular")
    public void kullaniciCikanDogrular(String arg0) throws MalformedURLException {
        ReusableMethods.toastMessageValidate("Arnold");
    }
}
