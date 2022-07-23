package libraryCT.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    // Private constructor to close access to the obj of this class from outside of class
    private Driver() {
    }

    // Private WebDriver to close access from outside of class
    // Making it static to use inside of static method
    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    // Creating a re-usable utility method which will return same driver instance when we call it
    public static WebDriver getDriver() {

        // It will check if driver is null and if it is we will set up browser inside if statement
        // If you already set up driver, and you're using it again for following line of codes, it will return to same driver
        if (driverPool.get() == null) {

            // We read browserType from configuration.properties with
            // help of ConfigurationReader class' getProperty() method
            String browserType = ConfigurationReader.getProperty("browser");

            switch(browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }
        return driverPool.get();

    }
    // This method will make sure our driver value is always null after using quit() method
    public static void closeDriver(){
        if(driverPool.get() != null){
            driverPool.get().quit(); // this line will terminate the existing driver session. When using this, driver will not be even null
            driverPool.remove();  //driver = null
        }
    }
}
