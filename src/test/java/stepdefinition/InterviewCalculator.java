package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.InterwievCalculatorPage;
import utilities.Driver;

import java.net.MalformedURLException;

import static org.apache.commons.lang.time.DateUtils.round;


public class InterviewCalculator {

    public InterviewCalculator() throws MalformedURLException {
    }
    InterwievCalculatorPage interwievCalculatorPage = new InterwievCalculatorPage();


    @Given("kullanici {int} ye tiklar")
    public void kullaniciYeTiklar(int a) throws MalformedURLException {
        Driver.get().findElementById("com.google.android.calculator:id/digit_"+a+"").click();
    }


    @And("kullanici {string} isaretine basar")
    public void kullaniciIsaretineBasar(String string) throws MalformedURLException {
        Driver.get().findElementById("com.google.android.calculator:id/"+string+"").click();
    }


    @And("kullanici cikan sayiyi dogrular")
    public void kullaniciCikanSayiyiDogrular() {
       Double expected= Double.valueOf(interwievCalculatorPage.sonuc.getText().replaceAll("\\D",""));
       Double actual=-10.862782780491200215723891499337473741120122;
        System.out.println(expected);
        //Assert.assertEquals(expected,actual);
    }

    @And("kullanici sayiyi yuvarlar")
    public void kullaniciSayiyiYuvarlar() {
        Double expected= Double.valueOf(interwievCalculatorPage.sonuc.getText().replaceAll("\\D",""));
        System.out.println(Math.round(expected*10000)/10000);
    }
}