import org.testng.annotations.Test;

public class FillOutContactTest {

    @Test
    public void navigateToContactPage(){
        HomePage homePage = new HomePage();
        homePage.navigateToPage();
        ContactPage contactPage = homePage.ClickContactButton();
        contactPage.fillInFirstName("Barney");
        contactPage.fillInlastName("Flintstone");
        contactPage.fillInPhoneNumber("1234567890");
        contactPage.fillInEmail("aaa.bbb@aaa.bbb");
        contactPage.fillInSubject("Testing Purposes");
        contactPage.fillInMessage("This concludes the test");


    }
  
}
