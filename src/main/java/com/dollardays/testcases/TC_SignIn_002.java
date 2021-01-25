package com.dollardays.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dollardays.pages.MyLoginPage;

public class TC_SignIn_002 extends MyBaseClass {
	
	
	@Test
	
	public void loginTest() throws InterruptedException {
		
		driver.get(baseURL);
		

		if (driver.getCurrentUrl().equals("https://www.dollardays.com/"))
			
		{
			
			Assert.assertTrue(true);
			
			log.info("URL has opened.Test case passed.");
		}
		
		else {
			
			Assert.assertTrue(false);
			
			log.info("URL didn't open.Test case failed.");
		
		
		}
		
		
		
		
		MyLoginPage lp= new MyLoginPage(driver);
		
		
		lp.clickuserHeader();
		log.info("Header clicked");
		
		
		lp.clickSignin();
		log.info("Signin clicked");
		
		
		lp.setUsername(username);
		log.info("Entered username");
		
		
		lp.setPassword(password);
		log.info("Entered password");
		
		lp.clickBtn();
		
		if (driver.getTitle().equals("DollarDays | Bulk Goods for Nonprofits, Businesses & Schools | Wholesale Products"))
			
		{
			
			Assert.assertTrue(true);
			
			log.info("Test case passed");
		}
		
		else {
			
			Assert.assertTrue(false);
			
			log.info("Test case failed");
		}
		
		
		
		
	}
	

}
	
	
	
	
	
	

