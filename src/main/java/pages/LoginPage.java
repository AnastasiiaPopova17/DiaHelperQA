package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='email']")
    WebElement inputEmailForLogin;

    @FindBy(xpath = "//input[@name='password']")
    WebElement inputPassword;

    @FindBy(xpath = "//button[text()='Login']")
    WebElement loginBtn;

    @FindBy(xpath = "//input[@name='username']")
    WebElement inputName;

    @FindBy(xpath = "//div[@id='root']/div/main/div/form[2]/div[2]/div/input")
    WebElement inputEmailForSignUp;

    @FindBy(xpath = "//button[text()='Sign Up']")
    WebElement signUpBtn;

    @FindBy(xpath = "//a[text()='Forgot Password?']")
    WebElement forgotPasswordBtn;

    @FindBy(xpath = "//p[@class='css-123tk8s']")
    WebElement successTitle;

    @FindBy(xpath ="//h3[contains(text(),'Enter your current data')]")
    WebElement successLoginEl;

    private Alert getAlert() {
        return driver.switchTo().alert();
    }

    public LoginPage fillEmailFieldForLogin(String email) {
        typeText(inputEmailForLogin, email);
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

    public LoginPage fillEmailFieldForSignUp(String email) {
        typeText(inputEmailForSignUp, email);
        return this;
    }

    public boolean verifySuccessTitle(String str) {
        String actualRes = getTextBase(successTitle);
        return isStringsEqual(actualRes,str);
    }

    public boolean verifySuccessLogin(String str) {
        String actaulRes = getTextBase(successLoginEl);
        return isStringsEqual(actaulRes,str);
    }

    public LoginPage clickOnLogoHeader() {
        clickBase(diaHelperLogoHeader);
        return this;
    }

    public HomePage switchToHomePage(int index) {
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));
        return new HomePage(driver);
    }

    public LoginPage clickAccept(Alert alert) {
        alert.accept();
        return this;
    }

    private String getMessageAlert(Alert alert) {
        return alert.getText().trim();
    }

    public boolean verifyTextFromAlert() {
        Alert alert = getAlert();
        pause(5000);
        String expectedRes = "Password reset, email sent!";
        String actualRes = getMessageAlert(alert);
        clickAccept(alert);
        return expectedRes.equals(actualRes);
    }


}
