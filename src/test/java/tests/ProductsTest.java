package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import pages.UserPage;

public class ProductsTest extends BaseTest{
    @BeforeClass
    public void preConditions() {
        new HomePage(driver).clickOnProduct();
    }

    @Test
    public void diaHelperHeaderTest() {
        new ProductsPage(driver)
                .clickOnDiaHelperHeaderLogo();
    }
    @AfterClass
    public void postConditions() {
        new HomePage(driver).navigateToHomePage();
    }
}
