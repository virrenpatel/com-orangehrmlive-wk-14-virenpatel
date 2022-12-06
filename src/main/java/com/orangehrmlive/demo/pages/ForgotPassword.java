package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPassword extends Utility {


    By forgotPassword = By.xpath("//p[@class = 'oxd-text oxd-text--p orangehrm-login-forgot-header']");
    By resetPasswordText = By.xpath("//h6[@class = 'oxd-text oxd-text--h6 orangehrm-forgot-password-title']");


    public void clickOnForgotPassword(){
        clickOnElement(forgotPassword);
    }
    public String getResetPasswordText(){
        return getTextFromElement(resetPasswordText);
    }

}
