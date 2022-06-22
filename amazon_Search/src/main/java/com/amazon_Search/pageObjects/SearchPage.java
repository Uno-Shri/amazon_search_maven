package com.amazon_Search.pageObjects;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	WebDriver ldriver;
	
	public SearchPage(WebDriver rdriver)
	
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	

	
	@FindBy(id="twotabsearchtextbox")
	@CacheLookup
	WebElement txtPhoneName;
	
	//@FindBy(name="password")
	//@CacheLookup
	//WebElement txtPassword;
	
	
	@FindBy(id="nav-search-submit-button")
	@CacheLookup
	WebElement btnSearch;
	
	@FindBy(id="add-to-cart-button")
	@CacheLookup
	WebElement addCart;
	
	@FindBy(id="sw-gtc")
	@CacheLookup
	WebElement goCart;
	
	@FindBy(name="submit.delete.C3bcca135-dcf4-4c30-a270-f8d16eaf595f")
	@CacheLookup
	WebElement removeCart;
	
	public void setPhoneName(String pname)
	{
		
		txtPhoneName.sendKeys(pname);
	}
	
	//public void setPassword(String pwd)
	//{
	//	txtPassword.sendKeys(pwd);
	//}
	
	public void btnSearch()
	{
		btnSearch.click();
	}

	public void firstresultclick() {
		// TODO Auto-generated method stub
	
		
		
	}

	public void addCart() {
		// TODO Auto-generated method stub
		addCart.click();
	}

	public void proceedCart() {
		// TODO Auto-generated method stub
		goCart.click();
	}
	
	public void removeCart()
	{
		removeCart.click();
	}
	
}
	