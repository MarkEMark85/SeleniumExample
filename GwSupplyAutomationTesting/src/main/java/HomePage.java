import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BaseTest   {
    WebDriver driver;

    private By home = By.linkText("Home");
    private By contactUs = By.linkText("Contact Us");

    public void navigateToPage(){
        driver = getDriver();
        driver.get("http://www.gwsupply.com/");
    }

    public ContactPage ClickContactButton(){
        driver = getDriver();
        driver.findElement(contactUs).click();
        return new ContactPage();
    }

    public HomePage ClickHomeButton(){
        driver = getDriver();
        driver.findElement(home).click();
        return new HomePage();
    }


}
