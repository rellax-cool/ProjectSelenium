package HomePageTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class InstallationMenu extends AbstractParentTest {
   @Test
    public void instalMenu(){
        loginPage.openPageLogin();
        loginPage.inputLogin("student");
        loginPage.inputPassword("909090");
        loginPage.clickSubmitButton();
        homePage.clickOnInstalation();
       checkExpectedResult( "Menu Installation is not opened",homePage.isHeaderInstallationDisplayed());
    }
}
