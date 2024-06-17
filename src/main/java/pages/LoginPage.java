package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='Home']")
    WebElement homeBtn;
    @FindBy(xpath = "//input[@name='email']")
    WebElement inputEmailForLogin;

    @FindBy(xpath = "//input[@name='password']")
    WebElement inputPassword;

    @FindBy(xpath = "//button[text()='Login']")
    WebElement loginBtn;

    @FindBy(xpath = "//input[@name='username']")
    WebElement inputName;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    WebElement inputEmailForSignUp;

    @FindBy(xpath = "//button[text()='Sign Up Form']")
    WebElement signUpFormBtn;

    @FindBy(xpath = "//button[text()='Sign Up']")
    WebElement signUpBtn;

    @FindBy(xpath = "//a[text()='Forgot Password?']")
    WebElement forgotPasswordBtn;

    @FindBy(xpath = "//p[text()='We sent the password to your email address']")
    WebElement successTitle;

    @FindBy(xpath ="//h3[contains(text(),'Enter your current data')]")
    WebElement successLoginEl;

    @FindBy(xpath = "//h2[text()='Login']")
    WebElement loginPageElement;

    @FindBy(xpath = "//p[contains(text(),'email is required')]")
    WebElement requiredTitleEmail;

    @FindBy(xpath = "//p[text()='Field password is required']")
    WebElement requiredTitlePassword;

    @FindBy(xpath = "//p[text()='Invalid email or password']")
    WebElement invalidPassword;

    @FindBy(xpath = "//p[contains(text(),'name is required')]")
    WebElement requiredTitleName;

    @FindBy(xpath = "//p[text()='Wrong type of name']")
    WebElement wrongTypeNameEl;

    @FindBy(xpath = "")
    WebElement logoutBtn;

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

    public LoginPage login() {
        fillEmailFieldForLogin("fidej37299@morxin.com");
        fillPasswordField("hFeiM6#Z");
        clickOnLoginBtn();
        return this;
    }

    public LoginPage fillNameField(String name) {
        typeText(inputName, name);
        return this;
    }

    public LoginPage clickOnSignUpFormBtn() {
        clickBase(signUpFormBtn);
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
        typeText(inputEmailForSignUp,email);
        pause(3000);
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

    public boolean isLoginPageOpens(String text) {
        String actualRes = getTextBase(loginPageElement);
        return isStringsEqual(actualRes, text);
    }

    public boolean verifyTitleRequiredEmail(String str) {
        String actualRes = getTextBase(requiredTitleEmail);
        return isStringsEqual(actualRes,str);
    }

    public boolean verifyTitleInvalidPassword(String str) {
        String actualRes = getTextBase(invalidPassword);
        return isStringsEqual(actualRes,str);
    }

    public boolean verifyTitleRequiredName(String str) {
        String actualRes = getTextBase(requiredTitleName);
        return isStringsEqual(actualRes,str);
    }

    public boolean verifyTitleWrongTypeOfName(String str) {
        String actualRes = getTextBase(wrongTypeNameEl);
        return isStringsEqual(actualRes,str);
    }

    public boolean verifyTitleRequiredPassword(String str) {
        String actualRes = getTextBase(requiredTitlePassword);
        return isStringsEqual(actualRes,str);
    }


//    public boolean isAlertAppears() {
//        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(50))
//                .until(ExpectedConditions.alertIsPresent());
//        if (alert==null) {
//            return false;
//        }else {
//            driver.switchTo().alert().accept();
//            return true;
//        }
//    }

    public String getTextAlert() {
        Alert alert = driver.switchTo().alert();
        return alert.getText().trim();
    }

    public void clickOkAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }


    public HomePage clickHomeBtn() {
        clickBase(homeBtn);
        return new HomePage(driver);
    }

    public HomePage clickLogoutBtn() {
        clickBase(logoutBtn);
        return new HomePage(driver);
    }
}
