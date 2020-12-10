package com.exam.automation.pageObjects;

import com.exam.automation.common.Waits;
import com.exam.automation.core.PagFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by gollamudi.sirisha on 10/12/2020.
 */
public class SendingMoneyOverSeasPage extends PagFactory {

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Sending money overseas?')]")
    public WebElement sendingMoneyOverSeasEle;
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'International Money Transfers')]")
    public WebElement internationalMoneyTransfer;

    public SendingMoneyOverSeasPage(WebDriver driver, Waits waits) {
        super(driver, waits);
    }

}