package HomePageTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class HomePageSlideMenuClose extends AbstractParentTest {
    @Test
    public  void HideLeftMenu(){
        loginPage.openPageLogin();
        loginPage.inputLogin("student");
        loginPage.inputPassword("909090");
        loginPage.clickSubmitButton();
        homePage.clickOnSidebarTonggle();
        checkExpectedResult("Avatar is not present", homePage.checkIsAvatarNoPresent());
    }
}
