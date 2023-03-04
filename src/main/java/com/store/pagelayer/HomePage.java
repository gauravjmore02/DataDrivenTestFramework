package com.store.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='login2']")
	private WebElement store_login;
	
	
	@FindBy(xpath="//a[@id='cartur']")
	private WebElement store_cart;
	
	@FindBy(xpath="(//a[@id='itemc'])[1]")
	private WebElement storeHomeCategry_Phones;
	
	@FindBy(xpath="(//a[@id='itemc'])[2]")
	private WebElement  storeHomeCategry_laptops;
	
	@FindBy(xpath="(//a[@id='itemc'])[3]")
	private WebElement  storeHomeCategry_monitors;
	
	public void clickOnLoginLink()
	{
		store_login.click();
	}
	
	public void clickOnCartLink()
	{
		store_cart.click();
	}
	
	public void clickOnPhoneLink()
	{
		storeHomeCategry_Phones.click();
	}
	
	public void clickOnLaptopsLink()
	{
		storeHomeCategry_laptops.click();
	}
	
	public void clickOnMoniterLink()
	{
		storeHomeCategry_monitors.click();
	}
	
	
	
}
