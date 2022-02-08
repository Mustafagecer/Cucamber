package stepdefination;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GMIBankHomePage;
import pages.GMIEmployeeDefaultPage;
import utilities.ConfigReader;
import utilities.Driver;

public class GMIBankStepDefination {
    GMIBankHomePage gmiBankHomePage=new GMIBankHomePage();
    GMIEmployeeDefaultPage gmiEmployeeDefaultPage=new GMIEmployeeDefaultPage();

    @Given("kullanici GMIBank sayfasina gider")
    public void kullanici_gmi_bank_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("gmi_login_url"));

    }
    @Given("User clicks on Manage Customer under My Operation")
    public void user_clicks_on_manage_customer_under_my_operation() {
        gmiBankHomePage.loginApplication(ConfigReader.getProperty("employee_username"),ConfigReader.getProperty("employee_password"));
        gmiEmployeeDefaultPage.myOperationDropDown.click();
        gmiEmployeeDefaultPage.manageCustomer.click();
    }
    @Given("User clicks on Create a new Customer")
    public void user_clicks_on_create_a_new_customer() {
        gmiEmployeeDefaultPage.createNewCustomerButton.click();


    }
    @Given("User enters all requires fields and click Save")
    public void user_enters_all_requires_fields_and_click_save() {
        Faker faker = new Faker();
        gmiEmployeeDefaultPage.ssnBox1.sendKeys(faker.idNumber().ssnValid());
        gmiEmployeeDefaultPage.firstname.sendKeys(faker.name().firstName());
        gmiEmployeeDefaultPage.lastname.sendKeys(faker.name().lastName());
        gmiEmployeeDefaultPage.middleInitial.sendKeys(faker.name().nameWithMiddle());
        gmiEmployeeDefaultPage.email.sendKeys(faker.internet().emailAddress());
        gmiEmployeeDefaultPage.mobilePhoneNumber.sendKeys("111-111-1111");
        gmiEmployeeDefaultPage.phoneNumber.sendKeys("111-111-1111");
        gmiEmployeeDefaultPage.zipCode.sendKeys(faker.address().zipCode());
        gmiEmployeeDefaultPage.address.sendKeys(faker.address().fullAddress());
        gmiEmployeeDefaultPage.city.sendKeys(faker.address().city());
        gmiEmployeeDefaultPage.ssn2.sendKeys(faker.idNumber().ssnValid());
        gmiEmployeeDefaultPage.countryDropdown.sendKeys("Poland"+ Keys.ENTER);
        gmiEmployeeDefaultPage.state.sendKeys(faker.address().state());
        gmiEmployeeDefaultPage.userDrop.sendKeys("tom"+Keys.ENTER);
        gmiEmployeeDefaultPage.zelleEnrolledCheckbox.click();
        gmiEmployeeDefaultPage.saveButton.click();

    }
    @Then("verify customer is created")
    public void verify_customer_is_created() {

        Assert.assertFalse("The new costumer is not ceated",gmiEmployeeDefaultPage.ssnBox1.isEnabled());
    }


}
