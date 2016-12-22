package com.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.library.Employee;
import com.orangehrm.library.OrangeHRMConstants;
import com.orangehrm.library.OrangeHRMLogin;

public class NewEmployeeRegistrationTest extends OrangeHRMConstants 
{
	OrangeHRMLogin hrm=new OrangeHRMLogin();
	Employee emp=new Employee();
	
	@BeforeMethod
	public void empreg_init()
	{
		hrm.Login(hrm.adminuid, hrm.adminpwd);
	}
	
	
	@Test
	public void empregTest()
	{
		
		boolean res;
		res=emp.addEmployee(emp.fname, emp.lname);
		Assert.assertTrue(res, "Employee Registration Failed");
		
	}
	
	@AfterMethod
	public void empreg_end()
	{
		hrm.logout();
	}
	
	
}
