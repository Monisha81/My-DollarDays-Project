package com.dollardays.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyLoginPage {
	
	
	WebDriver driver;
	
	public MyLoginPage(WebDriver driver) {
	

	this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
		}
	
	@FindBy(className="header-user")
	@CacheLookup
	WebElement userHeader;
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/ul/li[2]/a")
	@CacheLookup
	WebElement userSignin;
	
	@FindBy(id="inputLoginUsername")
	@CacheLookup
	WebElement userName;
	
	@FindBy(id="inputLoginPassword")
	@CacheLookup
	WebElement userPassword;
	
	@FindBy(className="btn")
	@CacheLookup
	WebElement btnSignin;
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/a/img")
	@CacheLookup
	WebElement headerUser;
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/ul/li[5]/a")
	@CacheLookup
	WebElement favorites;
	


	@FindBy(className="ddlSortOption")
	@CacheLookup
	WebElement dropDown;
	
	@FindBy(className="ddlSortOption")
	@CacheLookup
	WebElement dropDownOptions;
	
	
	@FindBy(className="formlink")
	@CacheLookup
	WebElement viewDD;
	
	

	@FindBy(className="formlink")
	@CacheLookup
	WebElement viewDDOptions;
	
	
	
	
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[5]/div[2]/div[2]/div/div[1]/div/div/div[2]/div/div[1]/div[2]/a/div/img")
	@CacheLookup
	WebElement clickedImg;
	
	@FindBy(className="lnkViewdetails")
	@CacheLookup
	WebElement description;
	
	
	@FindBy(className="right_content_info")
	@CacheLookup
	WebElement getDescription;
	
	
	@FindBy(xpath="//*[@id=\"ctl00_cphContent_divProductInfo\"]/div[1]/div[1]/div/div[3]/div/div[3]/div[1]/div/div/div[4]/button")
	@CacheLookup
	WebElement clickCart;
	
	
	
	@FindBy(id="ctl00_ddiPageHeader_liViewCartDesktop")
	@CacheLookup
	WebElement addedToCart;
	
	

	@FindBy(className="formlink")
	@CacheLookup
	WebElement clickOption;
	
	
	
	
	
	public void clickuserHeader()
	{
		
		userHeader.click();
	}
	
	public void clickSignin() {
	
		
		userSignin.click();
	}
	
	public void setUsername(String username) {
		
		userName.sendKeys(username);
		
		
		}
	
	
	public void setPassword(String pw) {
		
		
		userPassword.sendKeys(pw);
	}
	
	
	public void clickBtn() {
		
		
		btnSignin.click();
	}
	
	
	public void clickHeaderUser()
	{
		
		headerUser.click();
	}
	
	
	public void clickFavorites()
	{
		
		favorites.click();
	}
	
	
	
	  public void sortByclickedDropDown() {
      	
      	dropDown.click();
      	
      	
      	
      }
	  
	  
	  
	  
	  public void sortBygetOptions() 
      
      {
      System.out.println(dropDownOptions.getText());
     
      
      }
	  
	  
      public void clickView() {
      	
      viewDD.click();	
      	
      	
      	
      }
      
      
      public void viewDDownOptions() {
      	
          System.out.println(viewDDOptions.getText());	
          	
          	
          	
          }
          
     
	  
	  
	
      
	
	public void imgClicked() {
		
		
		
		clickedImg.click();
	}
		
		
		
	public void clickDescription() {
			
			
			description.click();
		}
	



    public void getDescrpn() 
        
        {
        System.out.println(getDescription.getText());
       
        
        }
        
        public void addToCart() {
        	
        clickCart.click();	
        	
        	
        	
        }
        
      
        

 
      }
	


	


