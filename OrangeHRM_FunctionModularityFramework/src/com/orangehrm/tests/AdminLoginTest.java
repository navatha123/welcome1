package com.orangehrm.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.library.OrangeHRMConstants;
import com.orangehrm.library.OrangeHRMLogin;

public class AdminLoginTest extends OrangeHRMConstants
{

	OrangeHRMLogin hrm=new OrangeHRMLogin();
	
	@Test
	public void adminLoginTest()
	{
		hrm.Login(hrm.adminuid, hrm.adminpwd);
		Assert.assertTrue(driver.findElement(By.linkText("Welcome Admin")).isDisplayed(), "Welcome Admin Link does not displayed");
		hrm.logout();
	}
	
	
}
