package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest{

    @BeforeMethod
    public void preconditions() {
        new HomePage(driver).navigateToHomePage();
    }

    @Test
    public void learnMoreTest() {
        new HomePage(driver)
                .clickOnLearnMoreBtn()
                .isTextDisplayed("Key facts about diabetes");
    }

    @Test
    public void startTest() {
        new HomePage(driver)
                .clickOnStartBtn()
                .isLoginPageOpens("Login");
    }

}
