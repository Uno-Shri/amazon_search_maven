package com.amazon_Search.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon_Search.pageObjects.SearchPage;

public class TC_SearchTest_001 extends BaseClass {
  @Test
  public void searchTest() throws InterruptedException {
	  
	  driver.get(baseURL);
	  driver.manage().window().maximize();
	  System.out.println("Url opened - by sys out");
	  //logger.info("URL is opened");

	  SearchPage lp =new SearchPage(driver);
	 // Thread.sleep(8000);
	  lp.setPhoneName(phonename);
	  System.out.println("phone name is given - by sys out");
	 // logger.info("Entered phone name");
	 
	  
	  lp.btnSearch();
	  
      driver.findElement(By.partialLinkText("Samsung Galaxy S21 (5G) 128GB Unlocked - Phantom Grey (Renewed)")).click();

      lp.addCart();
      
     String price= driver.findElement(By.xpath("//span[@class='a-price sw-subtotal-amount']//span[@class='a-price-whole']")).getText();
     //String price= driver.findElement(By.xpath("//span[@class='a-price aok-align-center']//span[@class='a-offscreen']")).getText();
     
     
     System.out.printf("The phone price at initial screen is %s \t\n", price);
     
     lp.proceedCart();
      
     String price2= driver.findElement(By.xpath("//span[@id='sc-subtotal-amount-buybox']//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'][normalize-space()='$697.99']")).getText();
     System.out.printf("The phone price inside of  cart screen is %s \t\n",  price2);
     
 	 Assert.assertEquals(price, price2);
 	 System.out.println("Assert test passed,  price remains same till cart checkout");
  
 
  }
  
	  }
  

