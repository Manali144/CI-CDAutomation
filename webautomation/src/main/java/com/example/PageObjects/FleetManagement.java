package com.example.PageObjects;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;

import cucumber.app.enums.FileNames;

public class FleetManagement extends GenericUtils {

	PropertyFileOperations locators;
	public WebDriver driver;

	public GenericUtils genericUtils;
	static Logger log = LogManager.getLogger(FleetManagement.class);

	{
		locators = new PropertyFileOperations(FileNames.OnePayLocator);
		log.info("STEP: Assets Page Locators loaded into memory");
	}

	public FleetManagement() throws IOException {

	}

	public WebDriver getDriver() {
		return driverThread.get();
	}

	public void clickOnProfileIcon() throws InterruptedException {
		clickOnElement(locators.getKey("Dashboard_Input"));
		log.info("STEP:Click on Profile Icon Successfully" + "Dashboard_Input");

	}

	public void userRole() {
		boolean test = isElementDisplay(locators.getKey("Corporate_Owner"));
		if (test) {
			log.info("STEP: " + "Profession" + " is present on Dashboard screen");
		} else {
			log.info("STEP: " + "Profession" + " is not present on Dashboard screen");
		}
	}

	public void clickOnManageGroupModule() throws InterruptedException {
		clickOnElement(locators.getKey("Manage_Group"));
		log.info("STEP:Click on Manage group module  Successfully" + "Manage_Group");

	}

	public void clickOnCreateGroupIcon() throws InterruptedException {
		clickOnElement(locators.getKey("Create_Group"));
		log.info("STEP:Click on create group module  Successfully" + "Create_Group");

	}

	public void enterGroupName(String GroupName) {
		clickOnElement(locators.getKey("Group_name"));

		enterText(locators.getKey("Group_name"), GroupName);
		log.info("STEP:Enter Group Name successfully" + "Group_name");

	}

	public void enterGroupDescription(String Description) {
		clickOnElement(locators.getKey("Group_Description"));

		enterText(locators.getKey("Group_Description"), Description);
		log.info("STEP:Enter group description successfully" + "Group_Description");

	}

	public void clickOnNextButton() throws InterruptedException {
		clickOnElement(locators.getKey("Next_button"));
		log.info("STEP:Click on next button  Successfully" + "Next_button");

	}

	public void selectFleetManager() throws InterruptedException {
		clickOnElement(locators.getKey("Fleet_Manager"));
		log.info("STEP:Click on fleet manager Successfully" + "Fleet_Manager");

	}

	public void selectFleetVehicle() throws InterruptedException {
		clickOnElement(locators.getKey("Fleet_Vehicle"));
		log.info("STEP:Click on fleet vehicle  Successfully" + "Fleet_Vehicle");

	}

	public void clickOnCreateGroupButton() throws InterruptedException {
		clickOnElement(locators.getKey("Create_Group_Button"));
		log.info("STEP:Click on create group module  Successfully" + "Create_Group_Button");

	}

	public void verifySuccessMessage() {
		boolean test = isElementDisplay(locators.getKey("Success_Message"));
		if (test) {
			log.info("STEP: " + "Profession" + " is present on Dashboard screen");
		} else {
			log.info("STEP: " + "Profession" + " is not present on Dashboard screen");
		}
	}

	public void clickOnOkButton() throws InterruptedException {
		clickOnElement(locators.getKey("Ok_Button"));
		log.info("STEP:Click on ok button  Successfully" + "Ok_Button");

	}

}
