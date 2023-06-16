package com.example.StepDefinitions;

import java.io.IOException;

import com.example.PageObjects.FleetManagement;
import com.example.PageObjects.LoginWithMobile;
import com.example.PageObjects.PageObjectManager;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.TestContextSetup;

import app.constants.ApplicationConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FleetManagementSteps extends Baseclass {

	private Baseclass base;

	public FleetManagementSteps(Baseclass base) {
		this.base = base;
	}

	PageObjectManager pageObjectManager;
// Call object of other classes
	TestContextSetup testContextSetup = new TestContextSetup();
//this.testContextSetup = new TestContextSetup();
	GenericUtils genericUtils;

	public FleetManagementSteps() {
//	this.testContextSetup= testContextSetup;
	}

	@Given("^User must be logged in with Corporate Customer$")
	public void User_must_be_logged_in_with_Corporate_Customer() throws Throwable {

		FleetManagement Fleetmanagement = testContextSetup.pageObjectManager.getFleetManagement();

		Fleetmanagement.clickOnProfileIcon();
		//Fleetmanagement.userRole();

	}

	@Then("^User clicks on Manage groups Module$")
	public void User_clicks_on_Manage_groups_Module() throws Throwable {

		FleetManagement Fleetmanagement = testContextSetup.pageObjectManager.getFleetManagement();

		Fleetmanagement.clickOnManageGroupModule();
	}

	@Then("^User clicks on create group icon$")
	public void User_clicks_on_create_group_icon() throws Throwable {

		FleetManagement Fleetmanagement = testContextSetup.pageObjectManager.getFleetManagement();

		Fleetmanagement.clickOnCreateGroupIcon();
	}

	@When("^user enters the GroupName as (.+) Group name$")

	public void user_enters_the_GroupName_as_Group_name(String GroupName) throws Throwable {
		FleetManagement Fleetmanagement = testContextSetup.pageObjectManager.getFleetManagement();
		Fleetmanagement.enterGroupName(GroupName);

	}

	@When("^user enters the Description as (.+) description$")

	public void user_enters_the_Description_as_description(String Description) throws Throwable {
		FleetManagement Fleetmanagement = testContextSetup.pageObjectManager.getFleetManagement();
		Fleetmanagement.enterGroupDescription(Description);

	}

	@Then("^User clicks on Next button$")
	public void User_clicks_on_next_button() throws Throwable {

		FleetManagement Fleetmanagement = testContextSetup.pageObjectManager.getFleetManagement();

		Fleetmanagement.clickOnNextButton();
	}

	@Then("^user select Fleet Manager$")
	public void User_select_Fleet_Manager() throws Throwable {

		FleetManagement Fleetmanagement = testContextSetup.pageObjectManager.getFleetManagement();

		Fleetmanagement.selectFleetManager();
	}

	@Then("^User select Fleet vehicle$")
	public void User_select_Fleet_vehicler() throws Throwable {

		FleetManagement Fleetmanagement = testContextSetup.pageObjectManager.getFleetManagement();

		Fleetmanagement.selectFleetVehicle();
	}

	@Then("^User click on CreateGroup button and verify success message$")
	public void User_click_on_creategroup_button_and_verify_success_message() throws Throwable {

		FleetManagement Fleetmanagement = testContextSetup.pageObjectManager.getFleetManagement();

		Fleetmanagement.clickOnCreateGroupButton();
		Fleetmanagement.verifySuccessMessage();
		Fleetmanagement.clickOnOkButton();

	}

}
