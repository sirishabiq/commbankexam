package com.exam.automation.common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by SirishaK on 10/12/2020.
 */
public class ActionHelper {

    private WebDriver driver;
    private Waits waits;

    public ActionHelper(WebDriver driver,Waits waits) {
        this.driver = driver;
        this.waits = waits;
    }

    public void scrollByVisibleElement(WebElement ele) {
        getJavaScriptExecutorObj().executeScript("arguments[0].scrollIntoView();", ele);
    }

    public JavascriptExecutor getJavaScriptExecutorObj(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }
    public void clickElement(WebElement ele){
        ele.click();
    }

    public boolean isElementDisplayed(WebElement ele){
        try {
            if(ele.isDisplayed()){
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    public void sendTxt(WebElement ele,String str){
        ele.sendKeys(str);
    }
}
