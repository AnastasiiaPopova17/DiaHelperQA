package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserPage;

public class UserTest extends BaseTest{
    @BeforeClass
    public void preConditions() {
        new HomePage(driver)
                .clickLogin()
                .login();
    }

    @Test
    public void fillFormTest() {
        Assert.
                assertTrue(new UserPage(driver)
                .clickOnDownArrow()
                .fillGlucoseValue("45")
                .fillAge("14")
                .fillWeight("45")
                .fillHeight("150")
                .clickOnSaveDataBtn()
                .isFormFilled("Your max calories: 0 kKal"));
    }

    @AfterClass
    public void postConditions() {
        new HomePage(driver).navigateToHomePage();
    }
}
