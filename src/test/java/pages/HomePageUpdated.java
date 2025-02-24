package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageUpdated {

    WebDriver driver;

    public HomePageUpdated(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    // @FindBy(how = How.LINK_TEXT,using="REGISTER")
    @FindBy(linkText = "REGISTER")
    public WebElement registerBtn;

    public void selectRegisterMenu(){
        registerBtn.click();
    }
}
