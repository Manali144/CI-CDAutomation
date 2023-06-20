Feature: Verify Login Functionality with mobile number and OTP 

  Background: 
    Given Validate the chrome browser

Scenario Outline: Verify Login with Mobile Number and OTP
   Given User must be on slider page 
   Then User click on Slider icon
   When user enters the Mobile Number as <mobilenumber> mobile number
   Then User clicks on Continue button
    When user enters the otp as <OTP> OTP
    Then User clicks on Submit button
  #  Then closes the browser

Examples: 
      | mobilenumber | OTP |
      |   1010101010 | 111111 |
  
 



  
 
