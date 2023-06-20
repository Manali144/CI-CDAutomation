package com.example.StepDefinitions;

import java.io.IOException;

import com.example.PageObjects.CreateUsers;
import com.example.PageObjects.LoginWithMobile;
import com.example.PageObjects.PageObjectManager;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.TestContextSetup;

import app.constants.ApplicationConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateUsersSteps extends Baseclass {

	private Baseclass base;

   public static final String FullName = "Test123";
	public static final String MobileNo =  String.valueOf(Math.floor(Math.random() * 1000000000) + 1000000000);
	public static final String Email = "testing" + String.valueOf(Math.round(Math.random() * 1000) + "@gmail.com");

	public CreateUsersSteps(Baseclass base) {
		this.base = base;
	}

	PageObjectManager pageObjectManager;
// Call object of other classes
	TestContextSetup testContextSetup = new TestContextSetup();
//this.testContextSetup = new TestContextSetup();
	GenericUtils genericUtils;

	public CreateUsersSteps() {
//	this.testContextSetup= testContextSetup;
	}

	@Given("^User clicks on Users Module$")
	public void User_clicks_on_Users_Module() throws Throwable {

		CreateUsers Createusers = testContextSetup.pageObjectManager.getCreateUsers();

		Createusers.clickOnUserModule();
		

	}
	
	@Then("^User clicks on  user create group icon$")
	public void User_clicks_on_user_create_group_icon() throws Throwable {

		CreateUsers Createusers = testContextSetup.pageObjectManager.getCreateUsers();

		
		Createusers.clickGroupIcon();
		
	}

	@Then("^User Select Role and click on OK button$")
	public void User_Select_Role_and_click_on_OK_button() throws Throwable {

		CreateUsers Createusers = testContextSetup.pageObjectManager.getCreateUsers();
        Createusers.clickOnSelectUserTextbox();
		Createusers.selectUserRole();
		Createusers.clickOnOkButton();
		
	}


	@When("^user enters the FullName as (.+) Fullname$")

	public void user_enters_the_FullName_as_Fullname(String FullName) throws Throwable {

		CreateUsers Createusers = testContextSetup.pageObjectManager.getCreateUsers();

		Createusers.enterFullName(CreateUsersSteps.FullName);

	}

	@When("^user enters the MobileNo as (.+) MobileNo$")

	public void user_enters_the_MobileNo_as_MobileNo(String MobileNo) throws Throwable {
		
		CreateUsers Createusers = testContextSetup.pageObjectManager.getCreateUsers();

		Createusers.enterMobileNumber(CreateUsersSteps.MobileNo);

	}
	
	
@When("^user enters the Email as (.+) Email$")

	public void user_enters_the_Email_as_Email(String Email) throws Throwable {
		
		CreateUsers Createusers = testContextSetup.pageObjectManager.getCreateUsers();

		Createusers.enterEmail(CreateUsersSteps.Email);

	}


@Then("^User click on CreateUser button and verify success message$")
public void User_click_on_CreateUser_button_and_verify_success_message() throws Throwable {

	CreateUsers Createusers = testContextSetup.pageObjectManager.getCreateUsers();

	Createusers.clickOnCreateButton();
}


	

}
