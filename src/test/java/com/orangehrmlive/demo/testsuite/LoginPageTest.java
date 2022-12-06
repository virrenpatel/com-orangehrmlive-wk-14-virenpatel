package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.ForgotPassword;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    ForgotPassword forgotPassword = new ForgotPassword();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        String expectedDashboardText = "Dashboard";
        Assert.assertEquals(loginPage.getDashboardText(),expectedDashboardText,"Dashboard");
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        forgotPassword.clickOnForgotPassword();
        String expectedResetPasswordText = "Reset Password";
        Assert.assertEquals(forgotPassword.getResetPasswordText(),expectedResetPasswordText,"Reset Password");
    }
}
