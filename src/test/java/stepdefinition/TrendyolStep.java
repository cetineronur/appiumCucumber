package stepdefinition;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import pages.TrendyolPage;
import utilities.Driver;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.AndroidDriver;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.util.List;

public class TrendyolStep {

    TrendyolPage trendyolPage = new TrendyolPage();

    public TrendyolStep() throws MalformedURLException {
    }

    @Given("kullanici germany e tiklar")
    public void kullanici_germany_e_tiklar() {
        trendyolPage.firstcheck.click();
       trendyolPage.germany.click();
    }

    @Given("kullanici en ustteki banda tiklar")
    public void kullanici_en_ustteki_banda_tiklar() throws InterruptedException {
        Thread.sleep(4000);
       trendyolPage.kostenlos.click();
    }

    @Given("kullanici cikan messaga tiklar")
    public void kullanici_cikan_messaga_tiklar() throws InterruptedException {
        Thread.sleep(2000);
        trendyolPage.obenMessage.click();
    }

    @Given("kullanici ilk urune tiklar")
    public void kullanici_ilk_urune_tiklar() {
        trendyolPage.firstProdukt.click();
    }

    @Given("kullanici in den warenkorba tiklar")
    public void kullanici_in_den_warenkorba_tiklar() throws InterruptedException {
        trendyolPage.warenkornButton.click();
    }

    @Given("kullanici beden secer")
    public void kullanici_beden_secer() throws InterruptedException {
        trendyolPage.groSe.click();
        Thread.sleep(1000);
    }

    @Given("kullanici zur kasseya tiklar")
    public void kullanici_zur_kasseya_tiklar() {
        trendyolPage.zurKasse.click();
    }

    @Given("kullanici none of th above u tiklar")
    public void kullanici_none_of_th_above_u_tiklar() throws InterruptedException {
        Thread.sleep(2000);
        trendyolPage.noneOfTheAbbove.click();
    }

    @Given("kullanici wieter mit google tiklar")
    public void kullanici_wieter_mit_google_tiklar() {
       trendyolPage.mithGoogleButton.click();
    }

    @Given("kullanici email adresi tiklar")
    public void kullanici_email_adresi_tiklar() throws InterruptedException {
        trendyolPage.chooceAnAccount.click();
        Thread.sleep(4000);
    }

    @Given("kullanici paypal tiklar")
    public void kullanici_paypal_tiklar() throws InterruptedException {
       trendyolPage.paypalRadoiButton.click();
       Thread.sleep(2000);
    }

    @And("kullanici geri ekrana gelir")
    public void kullaniciGeriEkranaGelir() throws InterruptedException, MalformedURLException {
        trendyolPage.startseite.click();
        //Driver.get().pressKey(new KeyEvent().withKey(AndroidKey.BACK));
      // Thread.sleep(14000);
        Driver.get().navigate().back();
    }

    @And("kullanici ikinci urune tiklar")
    public void kullaniciIkinciUruneTiklar() throws InterruptedException {
        Thread.sleep(1000);
        trendyolPage.secondProdukt.click();
    }

    @And("kulklanici summeyi dogrular")
    public void kulklaniciSummeyiDogrular() throws InterruptedException {
        ReusableMethods.waitFor(2);
        Double summe1,summe2,totalsumme,toplam;
        summe1= Double.valueOf(trendyolPage.summe1.getText().replaceAll("\\D",""));
        summe2= Double.valueOf(trendyolPage.summe2.getText().replaceAll("\\D",""));
        totalsumme= Double.valueOf(trendyolPage.totalSumme.getText().replaceAll("\\D",""));
        toplam= (summe1+summe2);
        Assert.assertEquals(toplam,totalsumme);
    }
}
