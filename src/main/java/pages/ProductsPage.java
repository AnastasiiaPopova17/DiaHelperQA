package pages;

import config.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ProductsPage extends BasePage{
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@class='css-442la9']")
    WebElement searchBtn;

    @FindBy(xpath = "//input[@name='product']")
    WebElement inputProduct;

    @FindBy(xpath = "//h3[contains(text(),'Milk')]")
    List <WebElement> productList;


    public ProductsPage clickOnSearchProduct(String product) {
        typeText(inputProduct,product);
        pause(2000);
        clickBase(searchBtn);
        return this;
    }

    public boolean verifyDisplayProduct(String pr) {
        List<WebElement> products = new ArrayList<>(productList);
        for (WebElement product : products) {
            if(pr.equals(product.getText())) {
                return true;
            }
        }
        return false;
    }
}
