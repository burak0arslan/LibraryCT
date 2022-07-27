package libraryCT.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import libraryCT.pages.BasePage;
import libraryCT.pages.LoginPage;
import libraryCT.utilities.ConfigurationReader;
import libraryCT.utilities.Driver;
import org.junit.Assert;

public class US1AC1LibrarianLogin extends BasePage {

    LoginPage loginPage = new LoginPage();

    @Given("librarian is on the login page")
    public void librarian_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    @Then("verify that the title is {string}")
    public void verify_that_the_title_is(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        expectedTitle = "Login - Library";
        Assert.assertEquals("Tittle Verification Failed!", expectedTitle, actualTitle);
    }
    @When("librarian enters valid email address and password")
    public void librarian_enters_valid_email_address_and_password() {
        loginPage.login2(ConfigurationReader.getProperty("librarian"), ConfigurationReader.getProperty("librarianPassword"));

    }
    @When("librarian click sign in button")
    public void librarian_click_sign_in_button() {
        loginPage.signInBtn.click();
    }
    @Then("verify that there are 3 models on the page")
    public void verify_that_there_are_models_on_the_page() {
        Assert.assertTrue(dashboardTitle.isDisplayed());
        Assert.assertTrue(users.isDisplayed());
        Assert.assertTrue(books.isDisplayed());
    }
}
