package libs;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ActionWithWebElements {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    WebDriverWait webDriverWait_10, webDriverWait_15;

    public ActionWithWebElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverWait_10 = new WebDriverWait(webDriver,10);
        webDriverWait_15 = new WebDriverWait(webDriver,15);
    }


    public void enterTextToTextFields(WebElement element, String text) {
        try {
            element.clear();
            element.sendKeys(text);
            logger.info("It is inputed");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Something wrong");
        }
    }

    public void clickButton(WebElement element) {
        try {
            element.click();
            logger.info("Click");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Something wrong");
        }
    }


    public boolean isElementDisplayed(WebElement element) {
        try {

           // webDriverWait_15.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Something wrong");
            return false;
        }
    }


    public boolean isElementEnabled(WebElement element) {
        try {
            return element.isEnabled();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Failed");
            return false;
        }
    }


    public void setCheckbox(WebElement element, boolean state) {
        try {
            if (element.isSelected() == state) {

            }
            else {
                element.click();
            }
            logger.info("Checkbox is " + state);

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Something wrong");
        }
    }

    private void selectElementByDD(WebElement element, String itemName) {
        Select dropDownValue = new Select(element);
        try {
            dropDownValue.selectByVisibleText(itemName);
            logger.info("");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Something wrong");
        }
    }
}
