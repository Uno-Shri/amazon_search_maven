package com.amazon_Search.testCases;

	import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
	import org.apache.log4j.PropertyConfigurator;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
    import org.testng.annotations.BeforeClass;

import com.amazon_Search.utilities.ReadConfig;


	public class BaseClass {
		
		//-------READING VALUES FROM CONFIG FILES------//
		ReadConfig readconfig=new ReadConfig();
		public String baseURL=readconfig.getApplicationURL();
		public String phonename=readconfig.getPhonename();
		public static WebDriver driver;
		 
		
		@BeforeClass
		public void setup()	
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.get(baseURL);
			driver.manage().window().maximize();

		}
		
		@AfterClass
		public void tearDown()
		
		{
			driver.quit();
		}

	}
	
	

