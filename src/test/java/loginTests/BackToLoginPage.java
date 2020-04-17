package loginTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class BackToLoginPage extends AbstractParentTest {
    @Test
    public void Exit() {
        loginPage.openPageLogin();
        loginPage.inputLogin("student");
        loginPage.inputPassword("909090");
        loginPage.clickSubmitButton();
        homePage.clickOnRightAvatar();
        homePage.clickOnExit();
        checkExpectedResult("Login success", loginPage.isLoginBoxRefreshed());
    }
}
