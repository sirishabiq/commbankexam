package com.exam.regressionTests;

import com.exam.automation.core.BaseWebDriver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

/**
 * Created by SirishaK on 10/12/2020.
 */
public class TestExam extends BaseWebDriver {


    //This test case verifies whether the user is taken to Travel Money Over seas page has sub topics or not
    @Test
    public void testTravelMoneyOverSeasSubTopics() {
        objInit.functionalHelper.createChildNodeInReport("Travel Money OverSeas Sub topics", "The user should be able to verify whether a user can be able to move to TRravel money over seas section or not");
        try {
            objInit.actionHelper.scrollByVisibleElement(objInit.homePage.internationalSection);
            objInit.actionHelper.clickElement(objInit.homePage.internationalSection);
            waits.explicitWaitVisibilityOf(objInit.sendingMoneyOverSeasPage.internationalMoneyTransfer);
            if(objInit.actionHelper.isElementDisplayed(objInit.sendingMoneyOverSeasPage.sendingMoneyOverSeasEle)&&objInit.actionHelper.isElementDisplayed(objInit.sendingMoneyOverSeasPage.internationalMoneyTransfer)){
                childTest.pass("The Sub heading have been displayed");
            }else{
                childTest.fail("The Sub heading have Not been displayed");
                fail("The Sub heading have Not been displayed");
            }
        } catch (NoSuchElementException | NullPointerException e) {
            childTest.fail("The Sub heading have Not been displayed");
            fail("The Sub heading have Not been displayed");
        }
    }

    //This test case verifies whether the user can able to see the login form for into net bank login successfully
    @Parameters({"userName", "password"})
    @Test
    public void testNetBankLogin(String username,String password) {

        objInit.functionalHelper.createChildNodeInReport("NetBank Login form verification", "This test case verifies whether the user can able to see login form for net banking successfully or not");
        try {
            objInit.actionHelper.scrollByVisibleElement(objInit.homePage.commBankHeaderLogon);
            objInit.functionalHelper.verifyLoginToNetBankPage(username,password);
        } catch (NoSuchElementException | NullPointerException e) {
            childTest.fail("The user has not successfully seen the  due to : "+e.getMessage());
            fail("The user has not successfully logged in due to : "+e.getMessage());
        }
    }
}
