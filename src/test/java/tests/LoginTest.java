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
    @AfterClass
    public void postConditions() {
        new HomePage(driver).navigateToHomePage();
    }
}
