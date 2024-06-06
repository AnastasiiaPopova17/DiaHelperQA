package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {
    WebDriver driver;

    static Logger logger = LoggerFactory.getLogger(BasePage.class);

    @FindBy(xpath = "//header//img[@class='css-y56pmg']")
    WebElement diaHelperLogoHeader;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickBase(WebElement element) {
        element.click();
    }

    public void typeText(WebElement element, String text) {
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public String getTextBase(WebElement element) {
        return element.getText().trim();
    }

    public void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickOnDiaHelperHeaderLogo() {
        diaHelperLogoHeader.click();
    }
}
