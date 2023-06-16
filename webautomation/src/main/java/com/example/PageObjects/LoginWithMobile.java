package com.example.PageObjects;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;

import cucumber.app.enums.FileNames;

public class LoginWithMobile extends GenericUtils{
	
	  PropertyFileOperations locators;
	    public WebDriver driver;
	    
	    public GenericUtils genericUtils;
	    static Logger log = LogManager.getLogger(LoginWithPassword.class);
	    
	    
	 {
	    locators = new PropertyFileOperations(FileNames.OnePayLocator);
	    log.info("STEP: Assets Page Locators loaded into memory");
	}
	

	    public LoginWithMobile() throws IOException {

	    	   
	    }
	    
	    public  WebDriver getDriver() {
	        return driverThread.get();
    }
	    
	    
	    public void userIsOnSliderPage()  {
	        boolean test = isElementDisplay(locators.getKey("SliderPage"));
	        if (test) {
	            log.info("STEP: " + "Profession" + " is present on Slider page");
	        } else {
	            log.info("STEP: " + "Profession" + " is not present on Slider page");
	        }
	    }
   
	    
	    public void clickOnSliderButton() throws InterruptedException{
	    	clickOnElement(locators.getKey("SliderButton"));
	        log.info("STEP:Click on loginsignup button Successfully" + "SliderButton");
	     //   System.out.println("Element" +"SliderButton");
	    }
	    
	    
	    public void enterMobileNumber(String mobilenumber){
	        
	        
	        clickOnElement(locators.getKey("Mobile_Input"));
	       // clickonElementJavaScript(locators.getKey("Mobile_input"));

	        enterText(locators.getKey("Mobile_Input"), mobilenumber);
	           log.info("STEP:Enter mobile number successfully" + "Mobile_input");
	          
	     }
	    
	    
	    public void LoginWithContinuebutton() throws InterruptedException{
	    	clickOnElement(locators.getKey("Continue_Button"));
	        log.info("STEP:Click on loginsignup button Successfully" + "Continue_Button");
	    
	    }
	    
	    
	    
	    
	    public void enterOtp(String OTP){
	        
	        
	    	clickOnElement(locators.getKey("Otp_Input"));
	  

	        enterText(locators.getKey("Otp_Input"), OTP);
	           log.info("STEP:Enter OTP successfully" + "Otp_Input");
	          
	     }
	    
//	    public void clickOnSubmit(){
//	        clickOnElement(locators.getKey("Submit_button")); 
//	        log.info("STEP:Click on submit button Successfully" + "Submit_button");
//	  }
	    
	    
	    public void clickOnSubmit() throws InterruptedException{
	    
	    	clickOnElement(locators.getKey("Submit_button_LoginPage"));
	        log.info("STEP:Click on loginsignup button Successfully" + "Submit_button");
	   
	    }
	    
	    
	    public void userIsOnDashboardPage()  {
	        boolean test = isElementDisplay(locators.getKey("Dashboard_Input"));
	        if (test) {
	            log.info("STEP: " + "Profession" + " is present on Dashboard screen");
	        } else {
	            log.info("STEP: " + "Profession" + " is not present on Dashboard screen");
	        }
	    }
	   










}


