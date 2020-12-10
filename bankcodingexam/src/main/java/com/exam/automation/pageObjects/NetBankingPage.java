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
public class NetBankingPage extends PagFactory {

    @FindBy(how = How.ID, using = "txtMyClientNumber_field")
    public WebElement clientUserName;
    @FindBy(how = How.ID, using = "txtMyPassword_field")
    public WebElement clientPassword;

    public NetBankingPage(WebDriver driver, Waits waits) {
        super(driver, waits);
    }

}
