package com.orangehrm.pages;

import org.openqa.selenium.By;

import com.orangehrm.base.BasePage;
import com.orangehrm.utilities.JavaScriptUtility;

public class LoginPage extends BasePage {
	
	private By user_name_input = By.cssSelector("input[name='username']");
	private By password_input = By.cssSelector("input[name='password']");
	private By login_button = By.cssSelector("button[type='submit']");
	//private By error_message= By.xpath("/html/body/app-root/app-auth-layout/app-login/div/div/div/div[2]/div[2]/div/div[2]/form/div[1]");
	//sprivate By error_message= By.cssSelector("div[class*='alert alert-danger ']");
	
	
	
	public void setLoginpageUserName(String text) {
		
		set(user_name_input,text);
		//find(user_name_input);
		//JavaScriptUtility.setJS(user_name_input, text);
		
	}
	
	public void setLoginpagePassword(String text) {
		
		set(password_input,text);
		
	}
	
	public void clickLogingPageLoingButton() {
		
		click(login_button);
	}
	
//	public void invalidLogin(String user_name,String Password)  {
//		setLoginpageUserName(user_name);
//		setLoginpagePassword(Password);
//		clickLogingPageLoingButton();
//	}
	
	
	public HomePage validLogin(String user_name,String Password) {
		setLoginpageUserName(user_name);
		
		setLoginpagePassword(Password);
		
		
		clickLogingPageLoingButton();
		
		
		return new HomePage();
	}
	
	
//	public String getErrormessage() {
//		return find(error_message).getText();
//		
//	}
}
