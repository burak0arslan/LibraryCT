package libraryCT.pages;

import libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksModulePage {
    public BooksModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm add_book_btn']")
    public WebElement addBook;

    @FindBy(xpath = "//input[@placeholder='Book Name']")
    public WebElement bookName;

    @FindBy(xpath = "//input[@placeholder='ISBN']")
    public WebElement isbn;

    @FindBy(xpath = "//input[@placeholder='Year']")
    public WebElement year;

    @FindBy(xpath = "//input[@placeholder='Author']")
    public WebElement author;

    @FindBy(xpath = "//select[@id='book_group_id']")
    public WebElement bookCategory;

    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement description;

    @FindBy(xpath = "//button[.=\"Save changes\"]")
    public WebElement saveChanges;

    @FindBy(xpath = "//div[@id=\"toast-container\"]")
    public WebElement alertMsg;

}
