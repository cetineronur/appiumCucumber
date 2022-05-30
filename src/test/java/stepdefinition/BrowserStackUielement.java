package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.BrowserStackUIelementIosPage;
import utilities.ReusableMethods;

import java.net.MalformedURLException;

public class BrowserStackUielement {
    public BrowserStackUielement() throws MalformedURLException {
    }
    BrowserStackUIelementIosPage browserStackUIelementIosPage = new BrowserStackUIelementIosPage();

    @Given("kullanici Texte tiklar")
    public void kullanici_texte_tiklar() {
       browserStackUIelementIosPage.textButton.click();
        ReusableMethods.waitFor(1);
    }

    @Given("kullanici message yazar")
    public void kullanici_message_yazar() {
      browserStackUIelementIosPage.textInput.sendKeys("Hallo");
    }

    @And("kullanici returna tusuna basar")
    public void kullaniciReturnaTusunaBasar() {
        browserStackUIelementIosPage.Return.click();
        ReusableMethods.waitFor(1);
        browserStackUIelementIosPage.Return.click();
    }

    @Given("cikan textin dogrulamasini yapar")
    public void cikan_textin_dogrulamasini_yapar() {
       String expendet="Hallo";
       String actual=browserStackUIelementIosPage.TextOutput.getText();
        Assert.assertEquals(expendet,actual);
    }


}
