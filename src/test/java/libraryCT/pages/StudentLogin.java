package libraryCT.pages;

import libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentLogin {

    public StudentLogin() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (id = "inputEmail")
    public WebElement student25;

    @FindBy (id = "inputPassword")
    public WebElement student25Password;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy (xpath = ".//span[text()='Books']")
    public WebElement booksModule;

    @FindBy (xpath = ".//span[text()='Borrowing Books']")
    public WebElement borrowingBooksModule;

    public void studentLogin (String userName, String password){
        student25.sendKeys(userName);
        student25Password.sendKeys(password);
    }


}
