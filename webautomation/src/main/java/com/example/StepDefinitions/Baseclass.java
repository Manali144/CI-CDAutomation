package com.example.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import com.example.Utilities.GenericUtils;

import io.cucumber.java.After;

//import org.openqa.selenium.WebDriver;

// import com.example.PageObjects.GeneralObjects;
// import com.example.PageObjects.SignUpAsDoctor;

public class Baseclass {
    public static WebDriver driver;

    public static GenericUtils genericUtils;
   // SignUpAsDoctor signUpAsDoctor =new SignUpAsDoctor(driver);
  //  GeneralObjects generalObject = new GeneralObjects(driver);

  //@AfterMethod
  public static void closeBrowser() {
       
    // driver.close();
    //  driver.quit();
    //  System.out.println("==========Browser is closed===========");
    genericUtils.terminateBrowser();
  
      
}


}
