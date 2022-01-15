package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class amazonStepDefination {
    AmazonPage amazonPage=new AmazonPage();

    @When("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));


    }
    @When("nutella icin arama yapar")
    public void nutella_icin_arama_yapar() {

        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);


    }
    @Then("sonucun nutella icerdigini test eder")
    public void sonucun_nutella_icerdigini_test_eder() {

        Assert.assertTrue("Sonuc yazisi nutella icermiyor",amazonPage.sonucYazisiElementi.getText().contains("nutella"));

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() throws InterruptedException {
        Thread.sleep(5000);
        Driver.closeDriver();
    }

    @And("java icin arama yapar")
    public void javaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("java"+ Keys.ENTER);
    }

    @Then("sonucun java icerdigini test eder")
    public void sonucunJavaIcerdiginiTestEder() {
        Assert.assertTrue("Sonuc yazisi java icermiyor",amazonPage.sonucYazisiElementi.getText().contains("java"));


    }
    @When("Ipad icin arama yapar")
    public void ipad_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Ipad"+ Keys.ENTER);
    }
    @Then("sonucun Ipad icerdigini test eder")
    public void sonucun_ipad_icerdigini_test_eder() {
        Assert.assertTrue("Sonuc yazisi Ipad icermiyor", amazonPage.sonucYazisiElementi.getText().contains("Ipad"));
    }

    @And("{string} icin arama yapar")
    public void icinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime+ Keys.ENTER);
    }

    @Then("sonucun {string} icerdigini test eder")
    public void sonucunIcerdiginiTestEder(String sonucunIcindearananKelime) {
        Assert.assertTrue(sonucunIcindearananKelime, amazonPage.sonucYazisiElementi.getText().contains(sonucunIcindearananKelime));

    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("sonuc sayisini yazdirir")
    public void sonucSayisiniYazdirir() {
        System.out.println(amazonPage.sonucYazisiElementi.getText());
    }
}
