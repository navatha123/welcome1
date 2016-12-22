package com.orangehrm.library;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Users extends OrangeHRMConstants
{

	Employee emp=new Employee();
	public String empname=emp.fname+" "+emp.lname;
	public String uname="qedgex3";
	public String pword="demo";
	
	
	public void addUser(String empname,String uname,String pword)
	{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(empname);
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pword);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pword);
		driver.findElement(By.id("btnSave")).click();
		
	}
	
	
}
