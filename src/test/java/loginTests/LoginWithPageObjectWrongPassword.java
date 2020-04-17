package loginTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class LoginWithPageObjectWrongPassword extends AbstractParentTest {

    @Test
    public  void wrongPassword(){
            loginPage.openPage();
            loginPage.inputLogin("Student");
            loginPage.inputPassword("909990");
            loginPage.clickSubmitButton();
            checkExpectedResult("Login success", loginPage.isLoginBoxRefreshed());
    }
}
