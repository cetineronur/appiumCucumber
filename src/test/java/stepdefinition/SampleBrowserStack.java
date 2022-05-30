package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.SampleBrowserstackPage;

import java.net.MalformedURLException;

public class SampleBrowserStack {

    SampleBrowserstackPage sampleBrowserstackPage = new SampleBrowserstackPage();

    public SampleBrowserStack() throws MalformedURLException {
    }

    @Given("kullanici search kisminda {string} arar")
    public void kullanici_search_kisminda_arar(String text) throws InterruptedException {
        sampleBrowserstackPage.search.click();
        sampleBrowserstackPage.search1.sendKeys(text,Keys.ENTER);
        Thread.sleep(2000);
    }
    @Given("kullanici ilk cikan arama secenegine tiklar")
    public void kullanici_ilk_cikan_arama_secenegine_tiklar() throws InterruptedException {
        sampleBrowserstackPage.firstwahl.click();
        Thread.sleep(2000);
    }
    @Given("kullanici gelen sayfada {string} yazisini dogrular")
    public void kullanici_gelen_sayfada_yazisini_dogrular(String string) {
        Assert.assertTrue(sampleBrowserstackPage.appiumText.isDisplayed());
    }

}
