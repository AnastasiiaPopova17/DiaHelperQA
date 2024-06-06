package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserPage;

public class LoginTest extends BaseTest{
    @BeforeClass
    public void preConditions() {
        new HomePage(driver).clickLogin();
    }

    @Test
    public void diaHelperHeaderTest() {
        new LoginPage(driver)
                .clickOnDiaHelperHeaderLogo();
    }

    @Test
    public void loginFormTest() {
        new LoginPage(driver)
                .fillEmailField("gfdgd@hbch.com")
                .fillPasswordField("Qwer1234!")
                .clickOnLoginBtn();
    }

    @Test
    public void signUpFormTest() {
        new LoginPage(driver)
                .fillNameField("Anna")
                .fillEmailField("gfdgd@hbch.com")
                .clickOnSignUpBtn();
    }

    @Test
    public void forgotPasswordTest() {
        new LoginPage(driver)
                .clickOnForgotPassword();
    }
    @AfterClass
    public void postConditions() {
        new HomePage(driver).navigateToHomePage();
    }
}
