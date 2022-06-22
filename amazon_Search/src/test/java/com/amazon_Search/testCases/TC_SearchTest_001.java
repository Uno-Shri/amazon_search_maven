package com.amazon_Search.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon_Search.pageObjects.SearchPage;

public class TC_SearchTest_001 extends BaseClass {
  @Test
  public void searchTest() throws InterruptedException {

	 //-------------INPUTS PHONE NAME------------//  

	   SearchPage lp =new SearchPage(driver);
	  
	   lp.setPhoneName(phonename);
	   System.out.println("phone name is given now");
	   
	  //-----------CLick ON Search-----------//
	   
	   lp.btnSearch();
	   
	   
	   
	  // CLICK ON FIRST RESULT-------------------//
      
	   System.out.println("lp.btn serch executed");
       
	  driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Samsung Galaxy S21 5G | Factory Unlocked Android C')]")).click();
      
	  
       System.out.println("Price is noted from the result page");
       String price= driver.findElement(By.xpath("//span[@class='a-price a-text-price a-size-medium']//span[@aria-hidden='true'][normalize-space()='$479.83']")).getText();
     
       

       //-----Adds the First Result in CART-------//
      lp.addCart();
      System.out.println("added to cart");
      
      
      
      //----------GET THE PRICE and Store in String ----------// 
      System.out.printf("The phone price at initial screen is %s \t\n", price);
     
     
      
     //-------CLICKS GO TO CART for CHECKOUT and Store Price Tag at Checkout---//
     lp.proceedCart();  
     
     System.out.println("proceeded to cart");
     String price2=   driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
     System.out.println("second price value is noted");
     
     System.out.printf("The phone price inside of cart screen is %s \t\n",  price2);
     
     
     //-----------VERIFIES BOTH PRICES----------//
 	 Assert.assertEquals(price, price2);
 	 System.out.println("Assert test passed,  price remains same till cart checkout");
  
 
  
 	 
  
  //----------REMOVES from CART----------//
  
  lp.removeCart();
  System.out.println("removed from cart");
  
	  
}
}
  

