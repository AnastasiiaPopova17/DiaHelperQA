package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest{
    @BeforeClass
    public void preConditions() {
        new HomePage(driver).clickLogin();
    }

    @Test
    public void loginFormTest() {
        new LoginPage(driver)
                .fillEmailFieldForLogin("rafan75039@kernuo.com")
                .fillPasswordField("rJh3c$6$")
                .clickOnLoginBtn()
                .verifySuccessLogin("Enter your current data");
    }
    @Test
    public void signUpFormTest() {
        new LoginPage(driver)
                .fillNameField("Max")
                .fillEmailFieldForSignUp("rafan75039@kernuo.com")
                .clickOnSignUpBtn()
                .verifySuccessTitle("We sent the password to your email address");
    }
    @Test
    public void forgotPasswordTest() {
      Assert.assertTrue(new LoginPage(driver)
               .clickOnForgotPassword()
               .verifyTextFromAlert());

    }
    @Test
    public void diaHelperHeaderLogoTest() {
        Assert.assertTrue(new LoginPage(driver)
                .clickOnLogoHeader()
                .switchToHomePage(0)
                .verifyHomePageOpen("Welcome to DiaHelper App!"));
    }

    @AfterClass
    public void postConditions() {
        new HomePage(driver).navigateToHomePage();
    }

//    @AfterMethod
//    public void afterMethodPostConditions() {
//        new HomePage(driver)
//                .closeCurrentTab()
//                .switchToLoginPage(0);
//    }
}
