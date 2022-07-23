package libraryCT.pages;

import libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersModulePage {

    public UsersModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "a[class=\'btn btn-lg btn-outline btn-primary btn-sm\']")
    public WebElement addUser;

    @FindBy(xpath = "//input[@placeholder='Full Name']")
    public WebElement fullName;

    @FindBy(xpath = "//input[@type=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement email;

    @FindBy(xpath = "//select[@id='user_group_id']")
    public WebElement userGroupDropdown;

    @FindBy(xpath = "/html/body/main/section[2]/div[2]/div/div/div/div/form/div[1]/div/div[3]/div[2]/div/select")
    public WebElement statusDropdown;

    @FindBy(xpath = "//input[@name=\"start_date\"]")
    public WebElement startDate;

    @FindBy(xpath = "//input[@name=\"end_date\"]")
    public WebElement endDate;

    @FindBy(xpath = "//textarea[@id=\"address\"]")
    public WebElement address;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement saveChanges;

    @FindBy(xpath = "//button[@type=\"cancel\"]")
    public WebElement close;

    @FindBy(xpath = "//div[@id=\"toast-container\"]")
    public WebElement alert;



    public String getTitle(){
        return Driver.getDriver().getTitle();
    }
}
