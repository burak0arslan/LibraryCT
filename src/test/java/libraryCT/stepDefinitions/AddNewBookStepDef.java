package libraryCT.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import libraryCT.pages.AddNewUserPage;
import libraryCT.pages.LoginPage;
import libraryCT.utilities.BrowserUtilities;
import libraryCT.utilities.ConfigurationReader;
import libraryCT.utilities.Driver;


public class AddNewBookStepDef {

    AddNewUserPage addNewUserPage = new AddNewUserPage();
    LoginPage loginPage = new LoginPage();

    @Given("librarian is on the homePage")
    public void librarian_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage.login(ConfigurationReader.getProperty("librarian"), ConfigurationReader.getProperty("librarianPassword"));
        BrowserUtilities.waitFor(1);
    }

    @When("librarian clicks Books module")
    public void librarian_clicks_books_module() {
        addNewUserPage.booksModuleClick();
        BrowserUtilities.waitFor(1);
    }

    @When("librarian clicks {string} button")
    public void librarian_clicks_button(String string) {
        addNewUserPage.bookBtnClick();
        BrowserUtilities.waitFor(1);
    }

    @When("librarian enter BookName, ISBN, Year, Author and Description")
    public void librarian_enter_book_name_isbn_year_author_and_description() {
        addNewUserPage.inputBookName();
        addNewUserPage.inputISBN();
        addNewUserPage.inputYear();
        addNewUserPage.inputAuthor();
        addNewUserPage.inputDescription();
        BrowserUtilities.waitFor(1);
    }

    @When("librarian clicks save changes button")
    public void librarian_clicks_save_changes_button() {
        addNewUserPage.clickSaveChangesBtn();
        BrowserUtilities.waitFor(1);
    }

    @Then("verify anew book is added")
    public void verify_anew_book_is_added() {
        addNewUserPage.confirmationMsgIsDisplayed();
    }
}

