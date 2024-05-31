package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class DishTest extends BaseTest{
    @BeforeClass
    //click on dishes
    public void preConditions() {
        new HomePage(driver).clickOnDishes();
    }

    @AfterClass
    public void postConditions() {
        new HomePage(driver).navigateToHomePage();
    }
}
