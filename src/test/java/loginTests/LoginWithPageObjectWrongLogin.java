package loginTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class LoginWithPageObjectWrongLogin extends AbstractParentTest {
    @Test
    public void invalidUser() {
        loginPage.openPage();
        loginPage.inputLogin("Sttuddent");
        loginPage.inputPassword("909090");
        loginPage.clickSubmitButton();
        checkExpectedResult("Login success", loginPage.isLoginBoxRefreshed());
    }
}