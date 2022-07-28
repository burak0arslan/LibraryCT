package libraryCT.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import libraryCT.pages.StudentLogin;
import libraryCT.utilities.ConfigurationReader;
import libraryCT.utilities.Driver;
import org.junit.Assert;

public class StudentLoginFunctionality {
    StudentLogin studentLogin = new StudentLogin();
    @Given("student is on the login Page")
    public void student_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        System.out.println("Login page");
    }
    @Then("verify that the URL is {string}")
    public void verify_that_the_url_is(String string) {
        Assert.assertEquals(ConfigurationReader.getProperty("env"), Driver.getDriver().getCurrentUrl());
        System.out.println("URL confirmed");
    }
    @When("student enters valid email address and password")
    public void student_enters_valid_email_address_and_password() {
        studentLogin.studentLogin(ConfigurationReader.getProperty("student25"), ConfigurationReader.getProperty("password"));
        System.out.println("Email and Password confirmed");
    }
    @When("student click sign in button")
    public void student_click_sign_in_button() {
        studentLogin.signInButton.click();
        System.out.println("Sign in button click successful");
    }
    @Then("verify that there are 2 models on the page")
    public void verify_that_there_are_models_on_the_page() {
        Assert.assertTrue("Books", studentLogin.booksModule.isDisplayed());
        Assert.assertTrue("Borrowing Books", studentLogin.borrowingBooksModule.isDisplayed());

    }
}
