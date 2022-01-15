package stepdefination;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CHQAPage;
import utilities.ConfigReader;
import utilities.Driver;

public class CHQAStepDefinations {

    CHQAPage chqaPage=new CHQAPage();
    @Then("CH login linkine tiklar")
    public void ch_login_linkine_tiklar() {
        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));

    }
    @Then("CH username kutusuna {string} yazar")
    public void ch_username_kutusuna_yazar(String wrongUserName) {
        chqaPage.loginLinki.click();
        chqaPage.usernameKutusu.sendKeys(wrongUserName);

    }
    @Then("CH password kutusuna {string} yazar")
    public void ch_password_kutusuna_yazar(String wrongUserPassword) {

        chqaPage.passwordKutusu.sendKeys(wrongUserPassword);
    }
    @Then("CH login butonuna basar")
    public void ch_login_butonuna_basar() {
        chqaPage.loginButonu.click();

    }
    @Then("giris yapilmadigini test eder")
    public void giris_yapilmadigini_test_eder() {
        Assert.assertTrue(chqaPage.girisYapilamadiYazisiElementi.isDisplayed());

    }
}
