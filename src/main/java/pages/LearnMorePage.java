package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LearnMorePage extends BasePage{
    public LearnMorePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[contains(text(),'Key facts about diabetes')]")
    WebElement learnMoreText;

    public boolean isTextDisplayed(String text) {
        String actualRes = getTextBase(learnMoreText);
        return isStringsEqual(actualRes,text);
    }
}
