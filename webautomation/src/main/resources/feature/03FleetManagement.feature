Feature: Verify Create Group and User functionality

# Background: 
  #  Given Validate the chrome browser
    

Scenario Outline: Verify user is able to create group
    Given User must be logged in with Corporate Customer
   Then User clicks on Manage groups Module
    Then User clicks on create group icon
   When user enters the GroupName as <GroupName> Group name
    When user enters the Description as <Description> description
    Then User clicks on Next button
    Then user select Fleet Manager
    Then User clicks on Next button
    Then User select Fleet vehicle
    Then User click on CreateGroup button and verify success message
  #  Then closes the browser

    #Examples: 
    #| GroupName | Description |
     #|  qaaq | TestAutomation |
      #
      
  Scenario Outline: Verify user is able to create Drive
 #  Given User must be logged in with Corporate Customer
   Then User clicks on Users Module
   Then User clicks on  user create group icon
   Then User Select Role and click on OK button
   When user enters the FullName as <FullName> Fullname
    When user enters the MobileNo as <MobileNo> MobileNo
    When user enters the Email as <Email> Email
    Then User click on CreateUser button and verify success message
   # Then User click on fleet management back button
    Then closes the browser
    

    #Examples: 
      #| FullName | MobileNo | Email |
      #|   TestG | 2030451074 |testouee@yopmail.com |
  
  
 