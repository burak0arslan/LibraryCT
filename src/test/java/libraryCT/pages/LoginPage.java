package libraryCT.pages;

import libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@type='email']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement inputPassword;

    @FindBy(css = "button[type='submit']")
    public WebElement signInBtn;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[2]/div")
    public WebElement wrongEmailPasswordMsg;

    public String getTitle(){
        return Driver.getDriver().getTitle();
    }

    public void login(String userName, String password){
        inputUserName.sendKeys(userName);
        inputPassword.sendKeys(password);
        signInBtn.click();
    }


}
