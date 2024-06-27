package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;


public class ProductsTest extends BaseTest{
    @BeforeClass
    public void preConditions() {
        new HomePage(driver).clickOnProduct();
    }


    @Test
    public void searchProduct() {
       Assert.assertTrue(new ProductsPage(driver)
               .clickOnSearchProduct("milk")
               .verifyDisplayProduct("Milk"));
    }
    @AfterClass
    public void postConditions() {
        new HomePage(driver).navigateToHomePage();
    }
}
