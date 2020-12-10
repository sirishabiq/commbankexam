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
public class HomePage extends PagFactory {

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'International')]")
    public WebElement internationalSection;
    @FindBy(how = How.CLASS_NAME, using = "commbank-header-login")
    public WebElement commBankHeaderLogon;
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'NetBank log on')]")
    public WebElement netBankLogon;

    public HomePage(WebDriver driver, Waits waits) {
        super(driver,waits);
    }

}
