package SelenideDemo;


import org.junit.jupiter.api.Test;
import SelenideDemo.pages.HomePage;
import SelenideDemo.pages.LogInPage;

import static com.codeborne.selenide.Selenide.open;
import static SelenideDemo.pages.Page.BASE_URL;

class LoginTest {

    // classes
    HomePage homePage;
    LogInPage loginPage;

    @Test
    public void loginWithValidCredentials() {


        homePage = open(BASE_URL, HomePage.class);
        homePage.acceptCookies();
        // click on login btn
        loginPage = homePage.clickOnLoginBtn();
        // insert credentials
        loginPage.fillInValidCred();
        // click on Log in btn
        loginPage.clickOnLoginBtnHP();
        // check that user is logged in
        homePage.userIconPresent();
    }
}
