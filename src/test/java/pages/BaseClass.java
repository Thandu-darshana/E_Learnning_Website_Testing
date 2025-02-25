package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    public  WebDriver driver;
    public Properties prop;

    @BeforeMethod
    public void openPage() throws IOException {

        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\config.properties");
        prop = new Properties();
        prop.load(fileInputStream);


        String browser = prop.getProperty("browser");

        switch(browser.toLowerCase()){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Browser not supported: " + browser);
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(prop.getProperty("App_url"));


    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
