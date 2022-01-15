package stepdefination.Editor;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EditorPage;
import utilities.Driver;

import java.security.Key;

public class datatableStepDefination {

    EditorPage editorPage=new EditorPage();
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        Driver.getDriver().findElement(By.cssSelector("div#example_wrapper button[type=\"button\"].dt-button.buttons-create > span")).click();

    }
    @Then("editor firstname kutusuna {string} bilgileri girer")
    public void editor_firstname_kutusuna_bilgileri_girer(String firstName) {
        Driver.getDriver().findElement(By.id("DTE_Field_first_name")).sendKeys(firstName);
    }
    @Then("editor lastname kutusuna {string} bilgileri girer")
    public void editor_lastname_kutusuna_bilgileri_girer(String lastName) {
        Driver.getDriver().findElement(By.id("DTE_Field_last_name")).sendKeys(lastName);


    }
    @Then("editor position kutusuna {string} bilgileri girer")
    public void editor_position_kutusuna_bilgileri_girer(String position) {
        Driver.getDriver().findElement(By.id("DTE_Field_position")).sendKeys(position);
    }
    @Then("editor office kutusuna {string} bilgileri girer")
    public void editor_office_kutusuna_bilgileri_girer(String office) {
        Driver.getDriver().findElement(By.id("DTE_Field_office")).sendKeys(office);
    }
    @Then("editor extension kutusuna {string} bilgileri girer")
    public void editor_extension_kutusuna_bilgileri_girer(String extension) {
        Driver.getDriver().findElement(By.id("DTE_Field_extn")).sendKeys(extension);
    }
    @Then("editor startdate kutusuna {string} bilgileri girer")
    public void editor_startdate_kutusuna_bilgileri_girer(String startDate) {
        Driver.getDriver().findElement(By.id("DTE_Field_start_date")).sendKeys(startDate);
    }
    @Then("editor salary kutusuna {string} bilgileri girer")
    public void editor_salary_kutusuna_bilgileri_girer(String salary) {
        Driver.getDriver().findElement(By.id("DTE_Field_salary")).sendKeys(salary);
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        Driver.getDriver().findElement(By.className("btn")).click();
    }


    @And("ilgili kutulara {string} {string} {string} {string} {string} {string} {string} bilgilerini girer")
    public void ilgiliKutularaBilgileriniGirer(String firstName, String lastName, String position, String office, String extension, String startDate, String salary) {
        Driver.getDriver().findElement(By.id("DTE_Field_first_name"));
        Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());
        actions
                .sendKeys(firstName).sendKeys(Keys.TAB)
                .sendKeys(lastName).sendKeys(Keys.TAB)
                .sendKeys(position).sendKeys(Keys.TAB)
                .sendKeys(office).sendKeys(Keys.TAB)
                .sendKeys(extension).sendKeys(Keys.TAB)
                .sendKeys(startDate).sendKeys(Keys.TAB)
                .sendKeys(salary).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)


                .perform();
    }

    @Then("{string} ve {string} girerek kaydin tamamlandigini test eder")
    public void veGirerekKaydinTamamlandiginiTestEder(String firstname , String lastname) throws InterruptedException {

        Thread.sleep(3000);
        editorPage.searchKutusu.sendKeys(firstname+" " +lastname);
        Assert.assertTrue(editorPage.isimAramaIlkSatir.getText().contains(firstname));



    }
}
