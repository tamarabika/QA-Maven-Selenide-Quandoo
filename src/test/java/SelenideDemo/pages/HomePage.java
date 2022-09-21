package SelenideDemo.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HomePage extends Page {

    HomePage homePage;


    // locators
    private static By signUpBtn = By.xpath("//*[@data-qa='header-register-btn']");
    private static By userIcon = By.xpath("//*[@data-qa='header-navigation-button']");
    private static By loginBtn = By.xpath("//*[@data-qa='header-login-btn']");


    // methods
    public SignUpPage clickOnSignUpBtn() {
        $(signUpBtn).click();
        return page(SignUpPage.class);
    }

    public LogInPage clickOnLoginBtn() {
        $(loginBtn).click();
        return page(LogInPage.class);
    }

    public void userIconPresent() {
        $(userIcon).isDisplayed();
    }
}





