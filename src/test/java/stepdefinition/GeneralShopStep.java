package stepdefinition;


import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GeneralStorePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class GeneralShopStep {


    GeneralStorePage generalStorePage = new GeneralStorePage();

    public GeneralShopStep() throws MalformedURLException {
    }

    @Given("kullanici {string} ulkesini secer")
    public void kullaniciUlkesiniSecer(String country) throws MalformedURLException, InterruptedException {
        generalStorePage.country.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.clickOnPage("Argentina");

    }
    @Given("kullanici adini yazar")
    public void kullanici_adini_yazar() {
        generalStorePage.yourName.sendKeys("Onur");
    }

    @Given("kullanici klavyeyi gizler")
    public void kullanici_klavyeyi_gizler() throws MalformedURLException {
        Driver.get().hideKeyboard();
    }

    @Given("kullanici Lets Shop tusuna basar")
    public void kullanici_lets_shop_tusuna_basar() {
        generalStorePage.letsShop.click();
    }

    @Given("kullanici ilk urunu sepete ekler")
    public void kullanici_ilk_urunu_sepete_ekler() {
        generalStorePage.firstProduct.click();
    }

    @And("kullanici {string} urununu sepete ekler")
    public void kullaniciUrununuSepeteEkler(String string) throws MalformedURLException, InterruptedException {
        Driver.get().findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+string+"\"))");
        ReusableMethods.waitFor(2);
        Driver.get().findElementByXPath("(//android.widget.TextView[@text='ADD TO CART'])[2]").click();
        ReusableMethods.waitFor(1);
    }

    @Given("kullanici sepete gider")
    public void kullanici_sepete_gider() {
        generalStorePage.card.click();
    }
    @Given("kullanici fiyati dogrular")
    public void kullanici_fiyati_dogrular() {
        Double jordan6,airjordan,total,expected;
        ReusableMethods.waitFor(2);
        jordan6 = Double.valueOf(generalStorePage.jordan6.getText().substring(1));
        airjordan = Double.valueOf(generalStorePage.airjordan.getText().substring(1));
        expected=jordan6+airjordan;
        total= Double.valueOf(generalStorePage.total.getText().substring(1));
        Assert.assertEquals(expected,total);
    }

    @And("kullanici visit to website tusuna basar")
    public void kullaniciVisitToWebsiteTusunaBasar() {
        generalStorePage.visit.click();
        ReusableMethods.waitFor(4);
    }


    @And("kullanici Web App e gecer ve {string} aratir")
    public void kullaniciWebAppEGecerVeAratir(String string) throws MalformedURLException {
        ReusableMethods.waitFor(4);
        Set<String> contextNames = Driver.get().getContextHandles();
        for (String contextName : contextNames) {
            System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
            if(contextName.equals("WEBVIEW_chrome")){
                ReusableMethods.waitFor(10);
                Driver.get().context(contextName);
            }
        }
        //Driver.get().findElementByXPath("//input[@name='q']").click();
        ReusableMethods.waitFor(2);
        Driver.get().findElementByXPath("//div[@role='combobox']").sendKeys("string", Keys.ENTER);
        ReusableMethods.waitFor(4);
        //Driver.get().context("NATIVE_APP");
    }

    @And("kullanici tekrar Native App e gecer")
    public void kullaniciTekrarNativeAppEGecer() throws MalformedURLException {
        Driver.get().pressKey(new KeyEvent().withKey(AndroidKey.BACK));

    }
}

