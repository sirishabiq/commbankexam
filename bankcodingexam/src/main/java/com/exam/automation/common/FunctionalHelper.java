package com.exam.automation.common;

import com.aventstack.extentreports.ExtentTest;
import com.exam.automation.core.BaseWebDriver;
import org.openqa.selenium.WebDriver;

/**
 * Created by SirishaK on 10/12/2020.
 */
public class FunctionalHelper extends BaseWebDriver {

    private WebDriver driver;
    private Waits waits;

    public FunctionalHelper(WebDriver driver,Waits waits) {
        this.driver = driver;
        this.waits = waits;
    }

    public void createChildNodeInReport(String testCaseName,String testCaseDesc){
        ExtentTest child = parentTest.createNode(testCaseName,testCaseDesc);
        childTest= child;
    }

    //to verify if an user can see the net banking login page elements or not
    public boolean verifyLoginToNetBankPage(String userName,String password) {

        objInit.actionHelper.clickElement(waits.explicitWaitVisibilityOf(objInit.homePage.commBankHeaderLogon));
        childTest.info("The Comm bank header is shown to the user");
        objInit.actionHelper.clickElement(waits.explicitWaitVisibilityOf(objInit.homePage.netBankLogon));
        childTest.info("The Net bank Logon option is shown to the user");
        if(objInit.actionHelper.isElementDisplayed(waits.explicitWaitVisibilityOf(objInit.netBankingPage.clientUserName))&&
                objInit.actionHelper.isElementDisplayed(waits.explicitWaitVisibilityOf(objInit.netBankingPage.clientPassword))){
            childTest.info("The net bank login form is shown to the user and ready to take the credentials form the client ");
        objInit.actionHelper.sendTxt(objInit.netBankingPage.clientUserName,userName);
        objInit.actionHelper.sendTxt(objInit.netBankingPage.clientPassword,password);
            return false;
        }
        return false;
    }
}
