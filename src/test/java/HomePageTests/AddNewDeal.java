package HomePageTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class AddNewDeal extends AbstractParentTest {
    @Test
    public void Exit() {
        loginPage.openPageLogin();
        loginPage.inputLogin("student");
        loginPage.inputPassword("909090");
        loginPage.clickSubmitButton();
        homePage.clickOnDeals();
        homePage.clickOnAddButton();
        checkExpectedResult("Login success", homePage.createNewDealButton());
    }
}
