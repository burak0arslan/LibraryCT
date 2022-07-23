package libraryCT.pages;

import libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.=\'Dashboard\']")
    public WebElement dashboardTitle;

    @FindBy(xpath = "//a[@href=\"#users\"]")
    public WebElement users;

    @FindBy(xpath = "//span[.=\"Books\"]")
    public WebElement books;

    @FindBy(xpath = "//span[.=\"Borrowing Books\"]")
    public WebElement borrowingBooks;

    @FindBy(xpath = "//a[@class=\"nav-link dropdown-toggle\"]")
    public WebElement logOutDropdown;



}
