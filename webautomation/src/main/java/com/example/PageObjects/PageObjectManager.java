package com.example.PageObjects;
// In this file we are going to create all objects of page object files

import java.io.IOException;
import org.openqa.selenium.WebDriver;


import com.example.Utilities.GenericUtils;



public class PageObjectManager {
	
	
	
	public WebDriver driver;
	public GenericUtils genericUtils;
	
	public LoginWithPassword loginwithpassword;
	public LoginWithMobile loginWithmobile;
	public FleetManagement Fleetmanagement;
	public CreateUsers Createusers;

	public PageObjectManager()
	{
		//this.driver = driver;
		//this.driver = driver;
	}

	public GenericUtils genericUtils() throws IOException
	{
		genericUtils=new GenericUtils();
		return genericUtils;
	}
				


public LoginWithPassword getLoginWithPassword() throws IOException
	{
	 loginwithpassword = new LoginWithPassword();
	return loginwithpassword;
	}


public LoginWithMobile getLoginWithMobile() throws IOException
{
	loginWithmobile = new LoginWithMobile();
     return loginWithmobile;
}


public FleetManagement getFleetManagement() throws IOException
{
	 Fleetmanagement = new FleetManagement();
     return Fleetmanagement;
}


public CreateUsers getCreateUsers() throws IOException
{
	 Createusers = new CreateUsers();
     return Createusers;
}

	

}


