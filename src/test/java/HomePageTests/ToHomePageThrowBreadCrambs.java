package HomePageTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class ToHomePageThrowBreadCrambs extends AbstractParentTest {
    @Test
public void HomeBreadCrumb(){
        loginPage.openPageLogin();
        loginPage.inputLogin("student");
        loginPage.inputPassword("909090");
        loginPage.clickSubmitButton();
        homePage.clickOnDeals();
        homePage.clickOnAddButton();
        homePage.clickOnHomeBreadcrumb();
       checkExpectedResult("It is Home Page",homePage.checkHpmePageIsDisplayed());
   }
}
