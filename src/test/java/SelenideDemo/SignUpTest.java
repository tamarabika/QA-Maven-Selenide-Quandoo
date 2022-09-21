package SelenideDemo;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import SelenideDemo.pages.HomePage;
import SelenideDemo.pages.SignUpPage;

import static com.codeborne.selenide.Selenide.open;
import static SelenideDemo.pages.Page.BASE_URL;

/**
 * Class SignUpTest contains tests for the SignUp functionality
 */
public class SignUpTest {

    // classes
    HomePage homePage;
    SignUpPage signUpPage;

    @Test
    /**
     * Negative test which ensures that there is no ability to sign up without ticking Terms checkbox.
     */
    public void signUpWithoutTermsAndPrivacy() {
        //open page
        homePage = open(BASE_URL, HomePage.class);
        homePage.acceptCookies();
        signUpPage = homePage.clickOnSignUpBtn();
        //insert data to all fields
        signUpPage.fillInSignUpFields();
        //click on Create Account
        signUpPage.clickOnCreateAccountBtn();
        // check that Create Account button exists
        signUpPage.createAccountBtnEl().should(Condition.visible);
    }
}

