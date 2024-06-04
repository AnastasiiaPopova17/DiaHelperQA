package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends BasePage{
    public UserPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = )
    WebElement inputFirstName;

    @FindBy(xpath = )
    WebElement inputSecondName;

    @FindBy(xpath = )
    WebElement inputEmail;

    @FindBy(xpath = )
    WebElement inputPassword;

    @FindBy(xpath = )
    WebElement inputConfirmPassword;

    public UserPage fillFirstName() {
        clickBase(inputFirstName);
    }

    public UserPage fillSecondName() {
        clickBase(inputSecondName);
    }

    public UserPage fillEmail() {
        clickBase(inputEmail);
    }

    public UserPage fillPassword() {
        clickBase(inputPassword);
    }

    public UserPage confirmPassword() {
        clickBase(inputConfirmPassword);
    }
}
