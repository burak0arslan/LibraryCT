package libraryCT.stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import libraryCT.pages.LoginPage;
import libraryCT.utilities.BrowserUtilities;
import libraryCT.utilities.ConfigurationReader;
import libraryCT.utilities.Driver;
import org.junit.Assert;

public class US1AC3NegativeLogin {

    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();

    @Given("user is on the loginPage")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user enters invalid email or password")
    public void user_enters_invalid_email_or_password() {
        loginPage.inputUserName.sendKeys(faker.internet().emailAddress());
        loginPage.inputPassword.sendKeys(faker.internet().password());
        BrowserUtilities.waitFor(2);
    }
    @When("student clicks sign in button")
    public void student_clicks_sign_in_button() {
        loginPage.signInBtn.click();
        BrowserUtilities.waitFor(2);
    }
    @Then("verify the error message {string}")
    public void verify_the_error_message(String msg) {
        Assert.assertTrue(msg,loginPage.wrongEmailPasswordMsg.isDisplayed());
    }

}
