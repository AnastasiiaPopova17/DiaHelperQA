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
    public void diaHelperHeaderTest() {
        new ProductsPage(driver)
                .clickOnDiaHelperHeaderLogo();
    }
    @Test
    public void searchBtn() {
        Assert.assertTrue(new ProductsPage(driver)
                .clickOnSearchProduct("milk")
                .verifyListOfProducts());
    }
    @AfterClass
    public void postConditions() {
        new HomePage(driver).navigateToHomePage();
    }
}
