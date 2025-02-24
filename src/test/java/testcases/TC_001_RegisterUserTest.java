package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.HomePage;
import pages.RegisterPage;
import pages.RegisterSuccessPage;

import java.time.Duration;

public class TC_001_RegisterUserTest {

    WebDriver driver;

    @BeforeMethod
    public void openPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/newtours/index.php");


    }
    @Test
    public void TC_001(){
        HomePage homePage = new HomePage(driver);
        homePage.selectRegisterMenu();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.setFirstName("Tharindu");
        registerPage.setLastName("Rathnasuuriya");
        registerPage.setEmail("thari@gmail.com");
        registerPage.selectCountry();
        registerPage.setUserName("Thandu");
        registerPage.setPassword("Test123");
        registerPage.setConfirmPassword("Test123");
        registerPage.Submit();

        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(driver);
        String actualText = registerSuccessPage.registerSuccessText();
        Assert.assertTrue(actualText.contains("Dear"));


    }

    @AfterMethod
    public void closeBrowser(){
        // driver.quit();
    }
}
