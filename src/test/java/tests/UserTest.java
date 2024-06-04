package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserPage;

public class UserTest extends BaseTest{
    @BeforeClass
    public void preConditions() {
        new HomePage(driver).clickOnUserBtn();
    }

    @Test
    public void fillFormTest() {
        new UserPage(driver)
                .fillFirstName()
                .fillSecondName()
                .fillEmail()
                .fillPassword()
                .confirmPassword();
    }

    @Test
    public void diaHelperHeaderTest() {
        new UserPage(driver)
                .clickOnDiaHelperHeaderLogo();
    }


    @AfterClass
    public void postConditions() {
        new HomePage(driver).navigateToHomePage();
    }
}
