package com.example.StepDefinitions;

import java.io.IOException;

import com.example.PageObjects.LoginWithMobile;
import com.example.PageObjects.PageObjectManager;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.TestContextSetup;

import app.constants.ApplicationConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithMobileSteps extends Baseclass {

	private Baseclass base;

	public LoginWithMobileSteps(Baseclass base) {
		this.base = base;
	}

	PageObjectManager pageObjectManager;
// Call object of other classes
	TestContextSetup testContextSetup = new TestContextSetup();
//this.testContextSetup = new TestContextSetup();
	GenericUtils genericUtils;

	public LoginWithMobileSteps() {
//	this.testContextSetup= testContextSetup;
	}

	@Given("Validate the chrome browser")
	public void validate_the_chrome_browser() throws IOException {

		genericUtils = new GenericUtils();

		genericUtils.initBrowser(ApplicationConstants.browser, ApplicationConstants.URL);
	}

	@Given("^User must be on slider page$")
	public void User_must_be_on_slider_page() throws Throwable {

		LoginWithMobile LoginWithmobile = testContextSetup.pageObjectManager.getLoginWithMobile();

		LoginWithmobile.userIsOnSliderPage();

	}

	@Given("^User click on Slider icon$")
	public void User_must_be_on_slider_icon() throws Throwable {

		LoginWithMobile LoginWithmobile = testContextSetup.pageObjectManager.getLoginWithMobile();

		LoginWithmobile.clickOnSliderButton();

	}

	@When("^user enters the Mobile Number as (.+) mobile number$")
	public void user_enters_the_Mobile_Number_as_mobile_number(String mobilenumber) throws Throwable {
		LoginWithMobile LoginWithmobile = testContextSetup.pageObjectManager.getLoginWithMobile();
		LoginWithmobile.enterMobileNumber(mobilenumber);

	}

	@Then("^User clicks on Continue button$")
	public void user_clicks_on_Continue_button() throws Throwable {
		LoginWithMobile LoginWithmobile = testContextSetup.pageObjectManager.getLoginWithMobile();
		LoginWithmobile.LoginWithContinuebutton();

	}

	@When("^user enters the otp as (.+) OTP$")
	public void user_enters_the_otp_as_OTP(String OTP) throws Throwable {
		LoginWithMobile LoginWithmobile = testContextSetup.pageObjectManager.getLoginWithMobile();
		LoginWithmobile.enterOtp(OTP);

	}

	@Then("^User clicks on Submit button$")
	public void user_clicks_on_Submit_button() throws Throwable {
		LoginWithMobile LoginWithmobile = testContextSetup.pageObjectManager.getLoginWithMobile();
		LoginWithmobile.clickOnSubmit();
		LoginWithmobile.userIsOnDashboardPage();

	}

}