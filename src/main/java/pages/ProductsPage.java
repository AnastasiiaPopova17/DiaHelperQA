package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@class='css-5010ye']")
    WebElement searchBtn;

    @FindBy(xpath = "//input[@name='product']")
    WebElement inputProduct;

    public ProductsPage clickOnSearchProduct(String product) {
        typeText(inputProduct,product);
        clickBase(searchBtn);
        return this;
    }

//    public boolean verifyListOfProducts() {
//
//    }
}
