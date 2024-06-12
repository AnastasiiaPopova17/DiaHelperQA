package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest{

    @Test
    public void learnMoreTest() {
        new HomePage(driver)
                .clickOnLearnMoreBtn();
    }

    @Test
    public void startTest() {
        new HomePage(driver)
                .clickOnStartBtn();
    }

}
