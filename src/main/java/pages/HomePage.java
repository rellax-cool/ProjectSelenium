package pages;

import libs.ConfigClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class HomePage extends ParentPage {
    @FindBy(xpath = ".//*[@class='pull-left image']")
    private WebElement avatar;

    @FindBy(xpath = ".//li[@id='dictionary']//ul[@class='treeview-menu menu-open']//li[@id='prov_cus']")
    private WebElement submenuProviders;

    @FindBy(xpath = "//*[@id='installation']")
    private WebElement instalation;

    @FindBy(xpath = "//section[@class='content-header']")
    private WebElement instalHeader;

    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    private WebElement rightAvavatar;

    @FindBy(xpath = "//div[@class='pull-right']//a[@class='btn btn-default btn-flat']")
    private WebElement exit;

    @FindBy(xpath = "//li[@id='deal']")
    private WebElement deals;

    @FindBy(xpath = "//a[@class='btn btn-info btn-sm']")
    private WebElement add;

    @FindBy(xpath = "//button[@name='add']")
    private WebElement create;

    @FindBy(xpath = "//ol[@class='breadcrumb']//i[@class='fa fa-dashboard']")
    private WebElement breadcrumbHome;

    @FindBy(xpath = "//a[@class='sidebar-toggle']")
    private WebElement tonggle;

 @FindBy(xpath = "//section[@class='content-header']//h1")
private WebElement homepage;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isAvatarDisplayed() {
        return actionWithWebElements.isElementDisplayed(avatar);

    }

    public void checkIsAvatarPresent() {
        Assert.assertTrue("Avatar is not displayed", isAvatarDisplayed());
    }

    public boolean checkIsAvatarNoPresent() {
        Assert.assertFalse("Avatar is  displayed", isAvatarDisplayed());
        return true;
    }

    public void clickOnSubmenuProviders() {
        logger.info("Clicking on sub menu Providers");
        actionWithWebElements.clickButton(submenuProviders);
    }

    public void clickOnRightAvatar() {
        logger.info("Clicking on Avatar to exit");
        actionWithWebElements.clickButton(rightAvavatar);
    }

    public void clickOnInstalation() {
        logger.info("Click on insalation");
        actionWithWebElements.clickButton(instalation);
    }

    public void clickOnExit() {
        logger.info("Click on Exit");
        actionWithWebElements.clickButton(exit);
    }

    public boolean isHeaderInstallationDisplayed() {
        logger.info("Header is displayed");
        return actionWithWebElements.isElementDisplayed(instalHeader);
    }

    public void clickOnDeals() {
        logger.info("Click on Deals");
        actionWithWebElements.clickButton(deals);
    }

    public void clickOnAddButton() {
        logger.info("Click on add button");
        actionWithWebElements.clickButton(add);
    }

    public boolean createNewDealButton() {
        logger.info("New deal button");
        return actionWithWebElements.isElementDisplayed(create);
    }
        public void clickOnReport () {
            logger.info("Clicking on report");
        }

    public void clickOnHomeBreadcrumb() {
        logger.info("Click on Home breadcrumb");
        actionWithWebElements.clickButton(breadcrumbHome);
    }
    public void clickOnSidebarTonggle() {
        logger.info("Click on button-tonglet");
        actionWithWebElements.clickButton(tonggle);
    }
    public void checkHomePageTitle() {
        Assert.assertEquals(webDriver.getTitle(), homepage);
    }
    public String getMainPageUrl() {
        return HomePageUrl;
    }
    public boolean checkHpmePageIsDisplayed() {
        logger.info("Home Page");
        return actionWithWebElements.isElementDisplayed(homepage);
    }
}
