package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class TC_001_RegisterUserTestUpdated extends BaseClass {


    @Test
    public void TC_001() {
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
        Assert.assertTrue(actualText.contains("Dear"), "Registration Attempt failed");


    }

}
