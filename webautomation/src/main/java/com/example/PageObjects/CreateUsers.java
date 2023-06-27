package com.example.PageObjects;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;

import cucumber.app.enums.FileNames;

public class CreateUsers extends GenericUtils {

	PropertyFileOperations locators;
	public WebDriver driver;

	public GenericUtils genericUtils;
	static Logger log = LogManager.getLogger(FleetManagement.class);

	{
		locators = new PropertyFileOperations(FileNames.OnePayLocator);
		log.info("STEP: Assets Page Locators loaded into memory");
	}

	public CreateUsers() throws IOException {

	}

	public WebDriver getDriver() {
		return driverThread.get();
	}

	public void clickOnUserModule() throws InterruptedException {
		clickOnElement(locators.getKey("User_module"));
		log.info("STEP:Click on User Module Successfully" + "User_module");

	}

	public void clickGroupIcon() throws InterruptedException {
		clickOnElement(locators.getKey("Create_User"));
		log.info("STEP:Click on User Module Successfully" + "Create_User");

	}

	public void clickOnSelectUserTextbox() throws InterruptedException {
		clickOnElement(locators.getKey("Select_User"));
		log.info("STEP:Click on select user textbox  Successfully" + "Select_User");

	}

	public void selectUserRole() throws InterruptedException {
		clickOnElement(locators.getKey("Driver"));
		log.info("STEP:Click on driver  Successfully" + "Driver");

	}

	public void clickOnOkButton() throws InterruptedException {
		clickOnElement(locators.getKey("OK_Button"));
		log.info("STEP:Click on ok button  Successfully" + "OK_Button");

	}

	public void enterFullName(String FullName) {
		clickOnElement(locators.getKey("Full_Name"));

		enterText(locators.getKey("Full_Name"), FullName);
		log.info("STEP:Enter Full Name successfully" + "Full_Name");

	}

	public void enterMobileNumber(String MobileNo) {
		clickOnElement(locators.getKey("Mobile_No"));

		enterText(locators.getKey("Mobile_No"), MobileNo);
		log.info("STEP:Enter mobile number successfully" + "Mobile_No");

	}

	public void enterEmail(String Email) {
		clickOnElement(locators.getKey("Email"));

		enterText(locators.getKey("Email"), Email);
		log.info("STEP:Enter Email successfully" + "Email");

	}

	public void clickOnCreateButton() throws InterruptedException {
		clickOnElement(locators.getKey("Create_User_Button"));
		log.info("STEP:Click on create User button  Successfully" + "Create_User_Button");

	}
	
	
	
	
	public void verifyDriverSuccessmessage() throws InterruptedException {
		clickOnElement(locators.getKey("Driver_Success_message"));
		log.info("STEP:Verify success message" + "Driver_Success_message");

	}
	
	public void clickOnBackButton() throws InterruptedException {
		clickOnElement(locators.getKey("Back_Button"));
		log.info("STEP:Click on Back button" + "Back_Button");

	}

}
