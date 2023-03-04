package com.store.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='loginusername']")
	private WebElement store_loginUsername;
	
	@FindBy(xpath="//input[@id='loginpassword']")
	private WebElement store_loginPassword;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement store_loginbutton;
	
	public void enterStoreUsername(String username)
	{
		store_loginUsername.sendKeys(username);
	}
	
	public void enterStorePassword(String password)
	{
		store_loginPassword.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		store_loginbutton.click();
	}
	
	
	

}
