package libraryCT.stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import libraryCT.pages.LoginPage;
import libraryCT.pages.UsersModulePage;
import libraryCT.utilities.BrowserUtilities;
import libraryCT.utilities.ConfigurationReader;
import libraryCT.utilities.Driver;
import org.junit.Assert;

public class US2AC1_AC4 {
    LoginPage login = new LoginPage();
    Faker faker = new Faker();
    UsersModulePage userTab = new UsersModulePage();

    @Given("librarian is on the homePage_2")
    public void librarian_is_on_the_home_page_2() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        login.login(ConfigurationReader.getProperty("librarian"), ConfigurationReader.getProperty("librarianPassword"));

    }

    @When("librarian click User module")
    public void librarian_click_user_module() {
        userTab.usersTab.click();

    }

    @When("librarian click {string} button")
    public void librarian_click_button(String string) {
        userTab.addUser.click();
    }

    @When("librarian enter full name, password, email and address")
    public void librarian_enter_full_name_password_email_and_address() {
        userTab.fullName.sendKeys("G25_TestUser");
        userTab.password.sendKeys(faker.internet().password());
        userTab.email.sendKeys(faker.internet().emailAddress());
        userTab.address.sendKeys(faker.address().fullAddress());
    }

    @When("librarian click save changes")
    public void librarian_click_save_changes() {
        userTab.saveChanges.click();
    }

    @Then("verify a new user is created")
    public void verify_a_new_user_is_created() {
        String actualName = userTab.firstRowname.getText();
        BrowserUtilities.waitFor(3);
        Assert.assertEquals("User creation not verified!", "G25_TestUser", actualName);
    }
}
