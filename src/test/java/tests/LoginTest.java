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
    @AfterClass
    public void postConditions() {
        new HomePage(driver).navigateToHomePage();
    }
    boolean flag = false;

//    @AfterMethod
//    public void methodPostCondition() {
//        if (flag) {
//            new LoginPage(driver).clickLogoutBtn();
//            flag = false;
//        }
//        new HomePage(driver).navigateToHomePage();
//        }



    @Test
    public void positiveLoginFormTest() {
        new LoginPage(driver)
                .fillEmailFieldForLogin("fidej37299@morxin.com")
                .fillPasswordField("hFeiM6#Z")
                .clickOnLoginBtn()
                .verifySuccessLogin("Enter your current data");
//        flag = true;
    }

    @Test
    public void negativeLoginTestWithoutEmail() {
        new LoginPage(driver)
                .fillEmailFieldForLogin("")
                .fillPasswordField("rJh3c$6$")
                .clickOnLoginBtn()
                .verifyTitleRequiredEmail("Field email is required");
    }

    @Test
    public void negativeLoginTestWithoutPassword() {
        new LoginPage(driver)
                .fillEmailFieldForLogin("fidej37299@morxin.com")
                .fillPasswordField("")
                .clickOnLoginBtn()
                .verifyTitleRequiredPassword("Field password is required");
    }

    @Test
    public void negativeTestLoginWithWrongPassword() {
        new LoginPage(driver)
                .fillEmailFieldForLogin("fidej37299@morxin.com")
                .fillPasswordField("hjdf")
                .clickOnLoginBtn()
                .verifyTitleInvalidPassword("Invalid email or password");
    }
    @Test
    public void positiveSignUpFormTest() {
        new LoginPage(driver)
                .clickOnSignUpFormBtn()
                .fillNameField("Max")
                .fillEmailFieldForSignUp("rafan80965@kernuo.com")
                .clickOnSignUpBtn()
                .verifySuccessTitle("We sent the password to your email address");
    }
    @Test
    public void negativeSignUpWithoutName() {
        new LoginPage(driver)
                .clickOnSignUpFormBtn()
                .fillNameField("")
                .fillEmailFieldForSignUp("fhgsdg@hbh")
                .clickOnSignUpBtn()
                .verifyTitleRequiredName("Field name is required");
    }

    @Test
    public void negativeSignUpWithWrongTypeOfName() {
        new LoginPage(driver)
                .clickOnSignUpFormBtn()
                .fillNameField("111")
                .fillEmailFieldForSignUp("bdcb@jnvjf")
                .clickOnSignUpBtn()
                .verifyTitleWrongTypeOfName("Wrong type of name");
    }

    @Test
    public void negativeSignUpWithoutEmail() {
        new LoginPage(driver)
                .clickOnSignUpFormBtn()
                .fillNameField("Ben")
                .fillEmailFieldForSignUp("")
                .clickOnSignUpBtn()
                .verifyTitleRequiredEmail("Field email is required");
    }
//    @Test
//    public void forgotPasswordTest() {
//      new LoginPage(driver)
//              .fillEmailFieldForLogin("koxafo5396@exeneli.com")
//               .clickOnForgotPassword()
//               .clickOkAlert();
//      Assert.assertEquals(new LoginPage(driver).getTextAlert(),"Password reset, email sent!");
//
//    }
    @Test
    public void diaHelperHeaderLogoTest() {
        Assert.assertTrue(new LoginPage(driver)
                .clickOnLogoHeader()
                .switchToHomePage(0)
                .verifyHomePageOpen("Welcome to DiaHelper App!"));
    }


//    @AfterMethod
//    public void afterMethodPostConditions() {
//        new HomePage(driver)
//                .closeCurrentTab()
//                .switchToLoginPage(0);
//    }
}
