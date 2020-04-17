package pages;

import libs.ConfigClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;
import  org.apache.log4j.Logger;
public class LoginPage extends ParentPage {

    @FindBy(name = "_username")
    private WebElement inputLoginName;

    @FindBy(name = "_password")
    private WebElement inputPasswordName;

    @FindBy(xpath = ".//button[@type='submit']")
    private WebElement inputButtonXpath;

    @FindBy(xpath = "//div[@class = 'login-box-body']")
    private WebElement loginBox;

    //By inputLoginName = By.name("_username");
    //By inputPasswordName = By.name("_password");
    //By inputButtonXpath = By.xpath(".//button[@type='submit']");
    //String url = "http://v3.test.itpmgroup.com";

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }
    /*public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        actionWithWebElements = new ActionWithWebElements(webDriver);
    }*/
    public void openPageLogin() {
        try
        {
            webDriver.get(ConfigClass.getCfgValue("base_url")+ "/login");
            logger.info("Page login was opened");
        } catch (Exception e) {
            logger.error("Can not open URL");
            Assert.fail("Can not open URL");

        }
    }

    public void openPage(){
        try{
            webDriver.get("http://v3.test.itpmgroup.com");
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("Can't work with browser");
        }

    }

    public void inputLogin(String text) {
        logger.info("Setting username");
        actionWithWebElements.enterTextToTextFields(inputLoginName, text);
    }

    public void inputPassword(String text) {
        logger.info("Setting password");
        actionWithWebElements.enterTextToTextFields(inputPasswordName, text);
    }

    public void clickSubmitButton() {
        logger.info("Submitting credentials");
        actionWithWebElements.clickButton(inputButtonXpath);
    }
    public boolean isLoginBoxRefreshed() {
        return actionWithWebElements.isElementDisplayed(loginBox);
    }
    public void loginToPage(String login, String password) {
        inputLogin(login);
        inputPassword(password);
        clickSubmitButton();
    }


}
