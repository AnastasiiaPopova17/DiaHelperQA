package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends BasePage{
    public UserPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@class='css-5010ye']")
    WebElement downArrowElement;

    @FindBy(xpath = "//input[@name='glucoseLevel']")
    WebElement inputGlucoseValue;

    @FindBy(xpath = "//input[@name='age']")
    WebElement inputAge;

    @FindBy(xpath = "//input[@name='weight']" )
    WebElement inputWeight;

    @FindBy(xpath = "//input[@name='height']")
    WebElement inputHeight;

    @FindBy(xpath = "//button[@class='css-5010ye' and text()='Save Data']")
    WebElement saveDataBtn;

    public UserPage clickOnDownArrow() {
        clickBase(downArrowElement);
        return this;
    }

    public UserPage fillGlucoseValue() {
        clickBase(inputGlucoseValue);
        return this;
    }

    public UserPage fillAge() {
        clickBase(inputAge);
        return this;
    }

    public UserPage fillWeight() {
        clickBase(inputWeight);
        return this;
    }

    public UserPage fillHeight() {
        clickBase(inputHeight);
        return this;
    }

    public UserPage clickOnSaveDataBtn() {
        clickBase(saveDataBtn);
        return this;
    }
}
