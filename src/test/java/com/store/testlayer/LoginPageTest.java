package com.store.testlayer;

import org.testng.annotations.Test;

import com.store.pagelayer.HomePage;
import com.store.pagelayer.LoginPage;
import com.store.testBase.TestBase;

public class LoginPageTest extends TestBase {

	@Test
	public void storeUserLoginUsingValidCredential() 
	{
		HomePage home_obj=new HomePage(driver);
		LoginPage login_obj=new LoginPage(driver);
		home_obj.clickOnLoginLink();
		login_obj.enterStoreUsername("sctqaautomation@grr.la");
		login_obj.enterStorePassword("Spring@123");
		login_obj.clickOnLoginButton();
	}

}
