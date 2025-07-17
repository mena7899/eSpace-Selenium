package com.orangehrm.pages;

import org.openqa.selenium.By;

import com.orangehrm.base.BasePage;
import com.orangehrm.utilities.JavaScriptUtility;

public class SidePanel extends BasePage {

//	
	private By admin_button = By.cssSelector("a[href='/web/index.php/admin/viewAdminModule']");


    
  public AdminPage clickAdminButton()  {
	JavaScriptUtility.clickJS(admin_button);
	return new AdminPage();
}
    
}
	
