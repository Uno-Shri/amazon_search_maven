package com.amazon_Search.testCases;

	import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
	import org.apache.log4j.PropertyConfigurator;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
    import org.testng.annotations.BeforeClass;


	public class BaseClass {
		
		public String baseURL = "https://www.amazon.ca/";
		public String phonename = "Samsung Galaxy S21 5G | Factory Unlocked Android Cell Phone | US Version 5G Smartphone | Pro-Grade";
		
		public static WebDriver driver;
		 
		public static Logger logger;
		
		@BeforeClass
		public void setup()
		
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.get(baseURL);
			
			//PropertyConfigurator.configure("Log4j.properties");
		}
		
		@AfterClass
		public void tearDown()
		
		{
			//driver.quit();
		}

	}
	
	

