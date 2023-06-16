package com.example.PageObjects;
import org.openqa.selenium.WebDriver;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;
import cucumber.app.enums.FileNames;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoginWithPassword extends GenericUtils{
    
    PropertyFileOperations locators;
    public WebDriver driver;
    
    public GenericUtils genericUtils;
    static Logger log = LogManager.getLogger(LoginWithPassword.class);
    
    
 {
    locators = new PropertyFileOperations(FileNames.OnePayLocator);
    log.info("STEP: Assets Page Locators loaded into memory");
}
public LoginWithPassword() throws IOException {

   
}
    public  WebDriver getDriver() {
        return driverThread.get();
    }   

    public void clickOnLoginSignupButton() throws InterruptedException{
        clickOnElement(locators.getKey("LoginSignUp_Button"));
        log.info("STEP:Click on loginsignup button Successfully" + "LoginSignUp_Button");
    }
    
    
   public void userIsOnSignUpPage()  {
    boolean test = isElementDisplay(locators.getKey("Profession_Input"));
    if (test) {
        log.info("STEP: " + "Profession" + " is present on sign up screen");
    } else {
        log.info("STEP: " + "Profession" + " is not present on sign up screen");
    }
}

    public void ClickOnIhaveAccountButton() throws InterruptedException{
        scrollDownTillPageEnd();
        wait(1000);
        scrollDownTillPageEnd();
        verifyVisibility(locators.getKey("ClickAlreadyAccounts_button"));
        clickOnElement(locators.getKey("ClickAlreadyAccounts_button"));  
        log.info("STEP:Click on I have already accpunt button Successfully" + "ClickAlreadyAccounts_button"); 
    }


    public void LoginWithPasswordbutton() {
        clickOnElement(locators.getKey("LoginWithPassword_button"));
        log.info("STEP:Click on Login With Password Successfully" + "LoginWithPassword_button");
    }


    public void enterMobileNo(String mobilenumber){
        
      
    clickOnElement(locators.getKey("Mobile_input"));
   // clickonElementJavaScript(locators.getKey("Mobile_input"));

    enterText(locators.getKey("Mobile_input"), mobilenumber);
       log.info("STEP:Enter mobile number successfully" + "Mobile_input");
      
 }

    public void enterPassword(String Password){

       enterText(locators.getKey("EnterPassword"),Password);
       log.info("STEP:Enter password successfully" + "EnterPassword");
 }

     public void clickOnProceed(){
       clickOnElement(locators.getKey("Proceed_button2"));
       log.info("STEP:Click on proceed button Successfully" + "Proceed_button2");
 }
 public void enterMobileInput(String MobileNumber) throws InterruptedException{
        
    enterText(locators.getKey("Mobile_input"),MobileNumber);
   
       
    }

    public void GetOtpButton() throws InterruptedException{
       clickOnElement(locators.getKey("GetOTP_button_login"));
        

    }
    public void  enterOtpOnelogininput(String OtpOne) throws InterruptedException{
        verifyVisibility(locators.getKey("OTPOne_login_input"));

       enterText(locators.getKey("OTPOne_login_input"), OtpOne);
        

    }

    public void enterOtpTwologininput(String OtpTwo) throws InterruptedException{
        enterText(locators.getKey("OTPTwo_login_input"),OtpTwo );
      
        

    }
    public void enterOtpThreelogininput(String OtpThree) throws InterruptedException{
           enterText(locators.getKey("OTPThree_login_input"), OtpThree);
       
    
    }

    public void enterOtpFourlogininput(String OtpFour) throws InterruptedException{
       enterText(locators.getKey("OTPFour_login_input"),OtpFour);
       
        
    }

    public void proccedButton() throws InterruptedException{
        verifyVisibility(locators.getKey("Procced_button"));

       clickOnElement(locators.getKey("Procced_button"));
     
    }

    public void userIsOnVerifyBuyMedicineMenufotlogin() {
		boolean test = isElementDisplay(locators.getKey("AllMedicines_header"));
		if (test) {
			log.info("STEP: " + "AllMedicines_header" + " is present on buy medicineine page");
		} else {
			log.info("STEP: " + "AllMedicines_header" + " is not present on buy medicationine page");
		}
	}
}
