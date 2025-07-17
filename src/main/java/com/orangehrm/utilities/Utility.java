package com.orangehrm.utilities;

import org.openqa.selenium.WebDriver;

import com.orangehrm.base.BasePage;

//the utilities classes is where actions happens and this utility class can be considered as Base class
//and all the classer will extend it
public class Utility  {

	public static WebDriver driver;
	//get the base page driver and set it as utility driver to perform actions on it(all utilities will inherit this class)
	//this method will be called in the base test
	public static void setWebDriver() {
		
		driver = BasePage.driver;
	}
	
	
}
