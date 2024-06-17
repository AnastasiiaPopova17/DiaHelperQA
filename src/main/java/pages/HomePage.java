package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='Products']")
    WebElement productsBtn;

    @FindBy(xpath = "//a[(text()='Login')]")
    WebElement loginBtn;

    @FindBy(xpath = "//a[(text()='User')]")
    WebElement userBtn;

    @FindBy(xpath = "//button[contains(text(),'LEARN MORE')]")
    WebElement learnMoreBtn;

    @FindBy(xpath = "//button[text()='START']")
    WebElement startBtn;

    @FindBy(xpath = "//p[contains(text(),'Welcome to DiaHelper App!')]")
    WebElement successHomePageEl;

    public HomePage navigateToHomePage() {
        driver.navigate().to("https://diahelper-cqnwp.ondigitalocean.app/");
        return this;
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
        userBtn.click();
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
