package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class UserTest extends BaseTest{
    @BeforeClass
    public void preConditions() {
        new HomePage(driver).clickOnRegistrationBtn();
    }

    @AfterClass
    public void postConditions() {
        new HomePage(driver).navigateToHomePage();
    }
}
