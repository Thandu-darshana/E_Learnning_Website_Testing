package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }



        By firstName= By.name("firstName");
        By lastName = By.name("lastName");
        By email = By.xpath("//input[@id='email']");
        By country = By.xpath("//select[@name='country']");
        By userName = By.xpath("//input[@id='userName']");
        By password = By.xpath("//input[@name='password']");
        By confirmPassword = By.xpath("//input[@name='confirmPassword']");
        By submitBtn = By.xpath("//input[@name='submit']");

         public void setFirstName(String firstName){
             driver.findElement(this.firstName).sendKeys(firstName);

         }

        public void setLastName(String lastName) {
            driver.findElement(this.lastName).sendKeys(lastName);
        }

        public void setEmail(String email) {
            driver.findElement(this.email).sendKeys(email);
        }

        public void selectCountry() {
            WebElement country_select =  driver.findElement(this.country);
            Select dropDownCountry = new Select(country_select);
            dropDownCountry.selectByIndex(2);
        }

        public void setUserName(String userName) {
            driver.findElement(this.userName).sendKeys(userName);
        }


        public void setPassword(String password) {
            driver.findElement(this.password).sendKeys(password);
        }

        public void setConfirmPassword(String confirmPassword) {
            driver.findElement(this.confirmPassword).sendKeys(confirmPassword);
        }

        public void Submit() {
            driver.findElement(this.submitBtn).click();
        }
}
