package com.orangehrm.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class OrangeHRMConstants 
{

	public static WebDriver driver;
	public static String url="http://orangehrm.qedgetech.com";
	
	@BeforeTest
	public void launcApp()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@AfterTest
	public void closeApp()
	{
		driver.close();
	}
	
	
	
}
