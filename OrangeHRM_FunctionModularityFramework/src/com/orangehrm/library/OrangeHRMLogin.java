package com.orangehrm.library;

import org.openqa.selenium.By;

public class OrangeHRMLogin extends OrangeHRMConstants
{

	public static String adminuid="Admin";
	public static String adminpwd="admin";
	
	public void Login(String uid,String pwd)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();		
	}
	
	public void logout()
	{
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}
