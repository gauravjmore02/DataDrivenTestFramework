package com.store.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Categories {

	public Categories(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='ASUS Full HD']")
	private WebElement asusFullHD_Link;
	@FindBy(xpath="//a[text()='Dell i7 8gb']")
	private WebElement Delli7_link;
	@FindBy(xpath="//a[text()='Samsung galaxy s6']")
	private WebElement samsangGaluxys6_link;
	
	public void clickOnAsusFullHDMonitor()
	{
		asusFullHD_Link.click();
		
	}
	
	public void clickOnDelli7Laptop()
	{
		Delli7_link.click();
		
	}
	
	public void clickOnSamsangGaluxys6Phone()
	{
		samsangGaluxys6_link.click();
		
	}
}
