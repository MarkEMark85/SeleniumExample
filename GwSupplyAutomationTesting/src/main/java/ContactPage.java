import org.openqa.selenium.By;

public class ContactPage extends BaseTest {

private By firstNameField = By.id("field1");
private By lastNameField = By.id("field2");
private By emailAddressField = By.id("field3");
private By phoneNumberField = By.id("field5");
private By subjectField = By.id("field6");
private By messageTextArea = By.id("field4");
private By submitButton = By.linkText("Submit");


public void fillInFirstName(String fName){
    driver.findElement(firstNameField).sendKeys(fName);
}

public void fillInlastName(String lName){
    driver.findElement(lastNameField).sendKeys(lName);
}

    public void fillInPhoneNumber(String number){
        driver.findElement(phoneNumberField).sendKeys(number);
    }

    public void fillInEmail(String email){
        driver.findElement(emailAddressField).sendKeys(email);
    }

    public void fillInSubject(String subject){
        driver.findElement(subjectField).sendKeys(subject);
    }

    public void fillInMessage(String message){
        driver.findElement(messageTextArea).sendKeys(message);
    }

    public void clickSubmit(){
        driver.findElement(submitButton).click();
    }

}