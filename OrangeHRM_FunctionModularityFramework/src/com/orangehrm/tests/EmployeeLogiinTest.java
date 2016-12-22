package com.orangehrm.tests;

import org.testng.annotations.Test;

import com.orangehrm.library.OrangeHRMConstants;
import com.orangehrm.library.OrangeHRMLogin;
import com.orangehrm.library.Users;

public class EmployeeLogiinTest extends OrangeHRMConstants 
{
	OrangeHRMLogin hrm=new OrangeHRMLogin();
	Users u=new Users();
	
	@Test	
	public void empLoginTest()
	{
		hrm.Login(u.uname, u.pword);
		hrm.logout();
	}
	
	
	
	
}
