package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class BasePage {
    WebDriver driver;

    static Logger logger = LoggerFactory.getLogger(BasePage.class);

    @FindBy(xpath = "//header//img[@class='css-y56pmg']")
    WebElement diaHelperLogoHeader;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isStringsEqual(String actualRes, String expectedRes) {
        if (actualRes.equals(expectedRes)) {
            return true;
        } else {
            System.out.println("actual res: " + actualRes +
                    " expected res " + expectedRes);
            return false;
        }
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

    public BasePage closeCurrentTab() {
            driver.close();
            return this;
        }

    public LoginPage switchToLoginPage(int index) {
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));
        return new LoginPage(driver);
    }
}
