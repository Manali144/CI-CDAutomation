package com.example.StepDefinitions;


import java.io.IOException;


import com.example.PageObjects.LoginWithPassword;
import com.example.PageObjects.PageObjectManager;
import app.constants.ApplicationConstants;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.TestContextSetup;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class SignupLoginSteps extends Baseclass {
//Initialized and declared driver out side of the method to accessible for entire 
//public WebDriver driver;

private Baseclass base;

public SignupLoginSteps(Baseclass base) {
    this.base = base;
}


PageObjectManager pageObjectManager; 
// Call object of other classes
TestContextSetup testContextSetup  =  new TestContextSetup();
//this.testContextSetup = new TestContextSetup();
GenericUtils genericUtils;
//Spring Framework,EJB -Cucumber dependancy injection -Cucumber PicoContainer
//Create a new TestContextSetupClass file under Utility
// Will create one constructor with the same class name
// This constructor will automatically called when we create objects of this class
// Will pass instance of TestContextSetup
// Constructor
//=========




public SignupLoginSteps ()
{
//	this.testContextSetup= testContextSetup;
}
@Given("Validate the browser")
public void validate_the_browser() throws IOException {
    
    genericUtils=new GenericUtils();
   
    genericUtils.initBrowser(ApplicationConstants.browser, ApplicationConstants.URL);
}

    @Given("^User should be able to click on signup icon and verify the user is on signup page$")
    public void user_should_be_able_to_click_on_signup_icon() throws Throwable {
    	
     LoginWithPassword loginwithpassword = testContextSetup.pageObjectManager.getLoginWithPassword();

     loginwithpassword.clickOnLoginSignupButton();
     loginwithpassword.userIsOnSignUpPage();
      
    }
    
   


//-------------LoginWithPassword Scenario-------------------

@When("^User clicks on I already have an account$")
public void user_clicks_on_i_already_have_an_account() throws Throwable {
    LoginWithPassword loginwithpassword = testContextSetup.pageObjectManager.getLoginWithPassword();
    loginwithpassword.ClickOnIhaveAccountButton();
}

@Then("^User clicks on Login with Password button$")
public void user_clicks_on_login_with_password_button() throws Throwable {
 LoginWithPassword loginwithpassword = testContextSetup.pageObjectManager.getLoginWithPassword();
  loginwithpassword.LoginWithPasswordbutton();

}

@When("^user enters the mobile number as (.+) mobile number$")
public void user_enters_the_mobile_number_as_mobile_number(String mobilenumber) throws Throwable {
    LoginWithPassword loginwithpassword = testContextSetup.pageObjectManager.getLoginWithPassword();
    loginwithpassword.enterMobileNo(mobilenumber);
    
}
@When("^user enters the password as (.+) password$")
    public void user_enters_the_password_as_password(String Password) throws Throwable {
        LoginWithPassword loginwithpassword = testContextSetup.pageObjectManager.getLoginWithPassword();
        loginwithpassword.enterPassword(Password);
        
    
}
@Then("^User clicks on proceed button$")
public void user_clicks_on_proceed_button() throws Throwable {
    LoginWithPassword loginwithpassord = testContextSetup.pageObjectManager.getLoginWithPassword(); 
    loginwithpassord.clickOnProceed(); 
}


@Then("^closes the browser$")
public void closes_the_browser() throws Throwable {
    LoginWithPassword loginwithpassord = testContextSetup.pageObjectManager.getLoginWithPassword(); 
    loginwithpassord.terminateBrowser();
    
}
        


///////////////////-----------Login With OTP Scenario----------

@Given("^User click on loginsignup button$")
public void user_click_on_loginsignup_button() throws Throwable {
    LoginWithPassword loginwithpassord = testContextSetup.pageObjectManager.getLoginWithPassword(); 
    loginwithpassord.clickOnLoginSignupButton();
}
@Given("^User should be able to enter the number(.+) mobile number$")
public void user_should_be_able_to_enter_the_number_mobile_number(String mobilenumber) throws Throwable {
    LoginWithPassword loginwithpassord = testContextSetup.pageObjectManager.getLoginWithPassword(); 
    loginwithpassord.enterMobileInput(mobilenumber);
}
@Given("^User should be able to click the get otp (.+) (.+) (.+) (.+)$")
public void user_should_be_able_to_click_the_get_otp(String otpone, String otptwo, String otpthree, String otpfour) throws Throwable {
    LoginWithPassword loginwithpassord = testContextSetup.pageObjectManager.getLoginWithPassword(); 
    loginwithpassord.GetOtpButton();
    loginwithpassord.enterOtpOnelogininput(otpone);
    loginwithpassord.enterOtpTwologininput(otptwo);
    loginwithpassord.enterOtpThreelogininput(otpthree);
    loginwithpassord.enterOtpFourlogininput(otpfour);
}
@Then("^User should be able to click on proceed button$")
public void user_should_be_able_to_click_on_proceed_button() throws Throwable {
    LoginWithPassword loginwithpassord = testContextSetup.pageObjectManager.getLoginWithPassword(); 
    loginwithpassord.proccedButton();
}

@When("^User should be able to verify Buy Medicine menu$")
public void user_should_be_able_to_verify_buy_medicine_menu() throws Throwable {
    LoginWithPassword loginwithpassord = testContextSetup.pageObjectManager.getLoginWithPassword(); 
    loginwithpassord.userIsOnVerifyBuyMedicineMenufotlogin();

}


}

    
