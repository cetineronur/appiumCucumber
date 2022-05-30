package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.SampleBrowserstackIosPage;

import java.net.MalformedURLException;

public class SampleBrowserstackIos {

    SampleBrowserstackIosPage sampleBrowserstackIosPage = new SampleBrowserstackIosPage();

    public SampleBrowserstackIos() throws MalformedURLException {
    }

    @Given("kullanici texte tiklar")
    public void kullanici_texte_tiklar() {
    sampleBrowserstackIosPage.textButton.click();
    }

    @Given("kullanici texti girer")
    public void kullanici_texti_girer() {
        sampleBrowserstackIosPage.textInput.sendKeys("nasilsin");
    }

    @Given("kullanici return tusuna basar")
    public void kullanici_return_tusuna_basar() {
       sampleBrowserstackIosPage.return1.click();
    }

    @Given("kullanici yazdigi testi dogrular")
    public void kullanici_yazdigi_testi_dogrular() {
       String expected="nasilsin";
       String actual=sampleBrowserstackIosPage.output.getText();
        Assert.assertEquals(expected,actual);
    }

    @And("kullanici UI elemnete tiklar")
    public void kullaniciUIElemneteTiklar() {
        sampleBrowserstackIosPage.uielemnttext.click();
    }
}
