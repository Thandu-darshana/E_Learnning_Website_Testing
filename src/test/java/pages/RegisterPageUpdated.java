package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageUpdated {

    WebDriver driver;

    public RegisterPageUpdated(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


        @FindBy(name = "firstName")
        WebElement firstName;

        @FindBy(name = "lastName")
        WebElement lastName;

        @FindBy(xpath = "//input[@id='email']")
        WebElement email;

        @FindBy(xpath = "//select[@name='country']")
        WebElement country;

        @FindBy(xpath = "//input[@id='userName']")
        WebElement userName;

        @FindBy(xpath = "//input[@name='password']")
        WebElement password;

        @FindBy(xpath = "//input[@name='confirmPassword']")
        WebElement confirmPassword;

        @FindBy(xpath = "//input[@name='submit']")
        WebElement submitBtn;



         public void setFirstName(String firstName){
             this.firstName.sendKeys(firstName);

         }

        public void setLastName(String lastName) {

            this.lastName.sendKeys(lastName);
        }

        public void setEmail(String email) {

            this.email.sendKeys(email);
        }

        public void selectCountry() {
            Select dropDownCountry = new Select(country);
            dropDownCountry.selectByIndex(2);
        }

        public void setUserName(String userName) {

             this.userName.sendKeys(userName);
        }


        public void setPassword(String password) {
            this.password.sendKeys(password);
        }

        public void setConfirmPassword(String confirmPassword) {
            this.confirmPassword.sendKeys(confirmPassword);
        }

        public void Submit() {

             this.submitBtn.click();
        }
}
