package com.dollardays.testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.*;

public class MyBaseClass {




public String baseURL="https://www.dollardays.com/";
public String username="srikanthtesting100@gmail.com ";
public String password="password123";
    public static WebDriver driver;
public static Logger log=LogManager.getLogger(MyBaseClass.class.getName());


@BeforeMethod

public void setUp() {

System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\servers\\mychromedriver.exe");

driver=new ChromeDriver();
driver.manage().window().maximize();
//logger=LogManager.getLogger("DollarDays");
//PropertyConfigurator.configure("mylog.xml");

}


@AfterMethod

public void teardown()

{
driver.quit();

}



}




