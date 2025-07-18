package com.orangehrm.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.Assert;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.AdminPage;
import com.orangehrm.pages.HomePage;
import com.orangehrm.utilities.WaitUtility;

public class AdminTest extends BaseTest{
	
	@Test()
	public void CheckNumberOfResults() throws  IOException    {
		
		HomePage homePage = loginPage.validLogin("Admin", "admin123");
		AdminPage adminPage =homePage.sidePanel.clickAdminButton();
		adminPage.setSearchText("admin");
		adminPage.clickSearchButton();
		assertEquals(adminPage.getSerachResultsNumber(), 1);
	}
	
	@Test()
	public void checkUserName() {
		AdminPage adminPage = new AdminPage();
		assertEquals(adminPage.getSerachResultUserName(), "Admin");
	}
	
	@Test()
	public void checkUserRole() {
		AdminPage adminPage = new AdminPage();
		assertEquals(adminPage.getSerachResultUserRole(), "Admin");
	}

	@Test()
	public void checkStatus() {
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
