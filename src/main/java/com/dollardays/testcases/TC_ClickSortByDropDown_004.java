package com.dollardays.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dollardays.pages.MyLoginPage;

public class TC_ClickSortByDropDown_004   extends MyBaseClass {
	
	
	

	@Test
	
	public void loginTest() {
		
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
		
		{
		
		
		

			
		lp.clickHeaderUser();
			log.info("Clicked header again");
			
			
			
			lp.clickFavorites();
		log.info("Clicked favorites");
		
		
		if (driver.getTitle().equals("Favorites - DollarDays"))				
		{
			
			Assert.assertTrue(true);
			
			log.info("Navigated to Favorites page.Test case passed");
		}
		
		else {
			
			Assert.assertTrue(false);
			
			log.info("Didn't navigate to Favorites page.Test case failed");
		}
		
		
		lp.sortByclickedDropDown();
		log.info("Sort By option clicked");
		
		
		lp.sortBygetOptions();
		log.info("Got sort by options");
	
	
	
	

}
		
		
	}
	
	
}
