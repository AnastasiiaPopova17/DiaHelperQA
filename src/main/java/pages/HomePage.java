package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "")
    WebElement dishBtn;

    @FindBy(xpath = "//a[@class='css-mqpg4z' and contains(text(),'Products')]")
    WebElement productsBtn;

    @FindBy(xpath = "//a[@class='css-mqpg4z' and contains(text(),'Login')]")
    WebElement loginBtn;

    @FindBy(xpath = "//a[@class='css-mqpg4z' and contains(text(),'User')]")
    WebElement UserBtn;

    @FindBy(xpath = "//button[contains(text(),'LEARN MORE')]")
    WebElement learnMoreBtn;

    @FindBy(xpath = "//button[contains(text(),'START')]")
    WebElement startBtn;

    @FindBy(xpath = "//p[contains(text(),'Welcome to DiaHelper App!')]")
    WebElement successHomePageEl;

    public HomePage navigateToHomePage() {
        driver.navigate().to("http://localhost:5173");
        return this;
    }

    public DishPage clickOnDishes() {
        dishBtn.click();
        return new DishPage(driver);
    }

    public ProductsPage clickOnProduct() {
        productsBtn.click();
        return new ProductsPage(driver);
    }

    public LoginPage clickLogin() {
        loginBtn.click();
        return new LoginPage(driver);
    }

    public UserPage clickOnUserBtn() {
        UserBtn.click();
        return new UserPage(driver);
    }

    public LearnMorePage clickOnLearnMoreBtn() {
        learnMoreBtn.click();
        return new LearnMorePage(driver);
    }

    public LoginPage clickOnStartBtn() {
        startBtn.click();
        return new LoginPage(driver);
    }

    public boolean verifyHomePageOpen(String str) {
        String actualRes = getTextBase(successHomePageEl);
        return isStringsEqual(actualRes,str);
    }


}
