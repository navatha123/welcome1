package com.orangehrm.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.library.Employee;
import com.orangehrm.library.OrangeHRMConstants;
import com.orangehrm.library.OrangeHRMLogin;
import com.orangehrm.library.Users;

public class NewUserRegTest extends OrangeHRMConstants 
{
	OrangeHRMLogin hrm=new OrangeHRMLogin();
	Users u=new Users();
	Employee emp=new Employee();
	
	
	@BeforeMethod
	public void userReg_init()
	{
		hrm.Login(hrm.adminuid, hrm.adminpwd);
	}
	
	
	@Test
	public void userRegTest()
	{
	u.addUser(u.empname, u.uname, u.pword);
	
	}
	
	@AfterMethod
	public void userReg_end()
	{
		hrm.logout();
	}
	
	
}
