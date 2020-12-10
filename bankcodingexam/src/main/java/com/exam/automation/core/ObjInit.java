package com.exam.automation.core;

import com.exam.automation.common.ActionHelper;
import com.exam.automation.common.FunctionalHelper;
import com.exam.automation.common.Waits;
import com.exam.automation.pageObjects.HomePage;
import com.exam.automation.pageObjects.NetBankingPage;
import com.exam.automation.pageObjects.SendingMoneyOverSeasPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by SirishaK on 10/12/2020.
 */
public class ObjInit {

    // PageObjects
    public ActionHelper actionHelper;
    public FunctionalHelper functionalHelper;
    public HomePage homePage;
    public SendingMoneyOverSeasPage sendingMoneyOverSeasPage;
    public NetBankingPage netBankingPage;
    /**
     * Constructor
     */
    public ObjInit(WebDriver driver, Waits waits) throws Exception {
        actionHelper = new ActionHelper(driver,waits);
        functionalHelper = new FunctionalHelper(driver,waits);
        homePage = new HomePage(driver,waits);
        sendingMoneyOverSeasPage = new SendingMoneyOverSeasPage(driver,waits);
        netBankingPage = new NetBankingPage(driver,waits);

    }
}
