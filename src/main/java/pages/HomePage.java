package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "")
    WebElement dishBtn;

    @FindBy(xpath = "")
    WebElement productBtn;

    @FindBy(xpath = "")
    WebElement loginBtn;

    @FindBy(xpath = "")
    WebElement registrationBtn;

    public HomePage navigateToHomePage() {
        driver.navigate().to("");
        return this;
    }

    public DishPage clickOnDishes() {
        dishBtn.click();
        return new DishPage(driver);
    }

    public ProductsPage clickOnProduct() {
        productBtn.click();
        return new ProductsPage(driver);
    }

    public LoginPage clickLogin() {
        loginBtn.click();
        return new LoginPage(driver);
    }

    public UserPage clickOnRegistrationBtn() {
        registrationBtn.click();
        return new UserPage(driver);
    }
}
