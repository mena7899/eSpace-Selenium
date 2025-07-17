package com.orangehrm.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.AdminPage;
import com.orangehrm.pages.HomePage;
import com.orangehrm.utilities.WaitUtility;

public class HomeTest extends BaseTest{
	
	@Test()
	public void CheckNumberOfResults() throws InterruptedException    {
		
		HomePage homePage = loginPage.validLogin("Admin", "admin123");
		AdminPage adminPage =homePage.sidePanel.clickAdminButton();
		adminPage.setSearchText("admin");
		adminPage.clickSearchButton();
		assertEquals(adminPage.getSerachResultsNumber(), 1);
			Thread.sleep(3000);	
	}
	
	@Test()
	public void CheckUserName() {
		AdminPage adminPage = new AdminPage();
		assertEquals(adminPage.getSerachResultUserName(), "Admin");
	}
	
	@Test()
	public void CheckUserRole() {
		AdminPage adminPage = new AdminPage();
		assertEquals(adminPage.getSerachResultUserRole(), "Admin");
	}

	@Test()
	public void CheckStatus() {
		AdminPage adminPage = new AdminPage();
		assertEquals(adminPage.getSerachResultStatus(), "Enabled");
	}
	
	@Test()
	public void invliadUserDelete() {
		AdminPage adminPage = new AdminPage();
		adminPage.clickSearchResultDeleteButton();
		assertEquals(adminPage.getDeleteErrorMessage(), "Cannot be deleted");
	}
}
