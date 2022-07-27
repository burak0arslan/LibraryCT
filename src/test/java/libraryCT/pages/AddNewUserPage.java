package libraryCT.pages;

import com.github.javafaker.Faker;
import libraryCT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddNewUserPage {

    Faker faker = new Faker();

    public void booksModuleClick() {
        WebElement booksModule = Driver.getDriver().findElement(By.xpath("//*[@id=\"menu_item\"]/li[3]/a/span[1]"));
        booksModule.click();
    }

    public void bookBtnClick() {
        WebElement  bookBtn = Driver.getDriver().findElement(By.xpath("//*[@id=\"books\"]/div[1]/div[1]/span/a"));
        bookBtn.click();
    }

    public void inputBookName() {
        WebElement bookName = Driver.getDriver().findElement(By.xpath("//*[@id=\"add_book_form\"]/div[1]/div/div[1]/div[1]/div/input"));
        bookName.sendKeys(faker.book().title());
    }

    public void inputISBN() {
        WebElement isbnNumber = Driver.getDriver().findElement(By.xpath("//*[@id=\"add_book_form\"]/div[1]/div/div[1]/div[2]/div/input"));
        isbnNumber.sendKeys(faker.number().digits(5));
    }

    public void inputYear() {
        WebElement year = Driver.getDriver().findElement(By.xpath("//*[@id=\"add_book_form\"]/div[1]/div/div[1]/div[3]/div/input"));
        year.sendKeys(faker.number().numberBetween(1720, 2022) + "");
    }

    public void inputAuthor() {
        WebElement author = Driver.getDriver().findElement(By.xpath("//*[@id=\"add_book_form\"]/div[1]/div/div[2]/div[1]/div/input"));
        author.sendKeys(faker.book().author());
    }

    public void inputDescription() {
        WebElement description = Driver.getDriver().findElement(By.xpath("//*[@id=\"description\"]"));
        description.sendKeys(faker.book().publisher());
    }

    public void clickSaveChangesBtn() {
        WebElement saveChangesBtn = Driver.getDriver().findElement(By.xpath("//*[@id=\"add_book_form\"]/div[2]/button[2]"));
        saveChangesBtn.click();
    }

    public boolean confirmationMsgIsDisplayed() {
        WebElement confirmationMsg = Driver.getDriver().findElement(By.xpath("/html/body/script[24]"));
        return confirmationMsg.isDisplayed();
    }

//    @FindBy(xpath = "//*[@id=\"menu_item\"]/li[3]/a/span[1]")
//    private WebElement booksModule;
//
//    @FindBy(xpath = "//*[@id=\"books\"]/div[1]/div[1]/span/a")
//    private WebElement bookBtn;
//
//    @FindBy(xpath = "//*[@id=\"add_book_form\"]/div[1]/div/div[1]/div[1]/div/input")
//    private WebElement bookName;
//
//    @FindBy(xpath = "//*[@id=\"add_book_form\"]/div[1]/div/div[1]/div[2]/div/input")
//    private WebElement isbnNumber;
//
//    @FindBy(xpath = "//*[@id=\"add_book_form\"]/div[1]/div/div[1]/div[3]/div/input")
//    private WebElement year;
//
//    @FindBy(xpath = "//*[@id=\"add_book_form\"]/div[1]/div/div[2]/div[1]/div/input")
//    private WebElement author;
//
//    @FindBy(xpath = "//*[@id=\"description\"]")
//    private WebElement description;
//
//    @FindBy(xpath = "//*[@id=\"add_book_form\"]/div[2]/button[2]")
//    private WebElement saveChangesBtn;
//
//    @FindBy(xpath = "/html/body/script[24]")
//    private WebElement confirmationMsg;



}



