package pages;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "")
    WebElement inputEmail;

    @FindBy(xpath = "//input[@name='password']")
    WebElement inputPassword;

    @FindBy(xpath = "//button[text()='Login']")
    WebElement loginBtn;

    @FindBy(xpath = "//input[@name='userName']")
    WebElement inputName;

    @FindBy(xpath = "")
    WebElement signUpBtn;

    @FindBy(xpath = "//a[text()='Forgot Password?']")
    WebElement forgotPasswordBtn;

    public LoginPage fillEmailField(String email) {
        typeText(inputEmail, email);
        return this;
    }

    public LoginPage fillPasswordField(String password) {
        typeText(inputPassword, password);
        return this;
    }

    public LoginPage clickOnLoginBtn() {
        clickBase(loginBtn);
        return this;
    }

    public LoginPage fillNameField(String name) {
        typeText(inputName, name);
        return this;
    }

    public LoginPage clickOnSignUpBtn() {
        clickBase(signUpBtn);
        return this;
    }

    public LoginPage clickOnForgotPassword() {
        clickBase(forgotPasswordBtn);
        return this;
    }
}
