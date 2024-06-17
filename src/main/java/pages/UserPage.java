package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends BasePage{
    public UserPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".fa-chevron-down")
    WebElement downArrowElement;

    @FindBy(xpath = "//input[@name='glucoseLevel']")
    WebElement inputGlucoseValue;

    @FindBy(xpath = "//input[@name='age']")
    WebElement inputAge;

    @FindBy(xpath = "//input[@name='weight']" )
    WebElement inputWeight;

    @FindBy(xpath = "//input[@name='height']")
    WebElement inputHeight;

    @FindBy(xpath = "//button[text()='Update Data']")
    WebElement saveDataBtn;

    @FindBy(xpath = "//p[text()='Your max calories: ']")
    WebElement filledFormVerifyElement;

    public UserPage clickOnDownArrow() {
        clickBase(downArrowElement);
        return this;
    }

    public UserPage fillGlucoseValue(String value) {
        typeText(inputGlucoseValue,value);
        return this;
    }

    public UserPage fillAge(String age) {
        typeText(inputAge,age);
        return this;
    }

    public UserPage fillWeight(String weight) {
        typeText(inputWeight,weight);
        return this;
    }

    public UserPage fillHeight(String height) {
        typeText(inputHeight,height);
        return this;
    }

    public UserPage clickOnSaveDataBtn() {
        clickBase(saveDataBtn);
        return this;
    }

    public boolean isFormFilled(String text) {
        String actualRes = getTextBase(filledFormVerifyElement);
        if (actualRes.equals(text)){
            return false;
        }
        return true;
    }
}
