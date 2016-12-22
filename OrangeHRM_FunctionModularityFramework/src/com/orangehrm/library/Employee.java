package com.orangehrm.library;

import org.openqa.selenium.By;

public class Employee extends OrangeHRMConstants 
{
	public String fname="fname1";
	public String lname="lname1";
	
	public boolean addEmployee(String fname,String lname)
	{
		String expstr,actstr;
		expstr=fname+" "+lname;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		driver.findElement(By.id("btnSave")).click();
		actstr=driver.findElement(By.xpath("//div/div[1]/div/h1")).getText();
		if (expstr.equalsIgnoreCase(actstr)) 
		{
			return true;
		} else 
		{
			return false;
		}
	}
	
	
}
