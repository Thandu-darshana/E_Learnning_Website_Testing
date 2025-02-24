package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class TC_001_RegisterUserTestUpdated {

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
        HomePageUpdated homePage = new HomePageUpdated(driver);
        homePage.selectRegisterMenu();

        RegisterPageUpdated registerPage = new RegisterPageUpdated(driver);
        registerPage.setFirstName("Tharindu");
        registerPage.setLastName("Rathnasuuriya");
        registerPage.setEmail("thari@gmail.com");
        registerPage.selectCountry();
        registerPage.setUserName("Thandu");
        registerPage.setPassword("Test123");
        registerPage.setConfirmPassword("Test123");
        registerPage.Submit();

        RegisterSuccessPageUpdated registerSuccessPage = new RegisterSuccessPageUpdated(driver);
        String actualText = registerSuccessPage.registerSuccessText();
        Assert.assertTrue(actualText.contains("Dear"),"Registration Attempt failed");


    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
