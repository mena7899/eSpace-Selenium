package com.orangehrm.pages;

import org.openqa.selenium.By;

import com.orangehrm.base.BasePage;
import com.orangehrm.utilities.JavaScriptUtility;

public class AdminPage extends BasePage {
	
	//add country buttons
	private By user_name_search_input = By.cssSelector("div[class='oxd-table-filter-area'] input[class='oxd-input oxd-input--active']");
	private By search_button = By.cssSelector("button[type='submit']");
	private By search_results_rows = By.cssSelector("div[class='oxd-table-body'] div[role='row']");
	private By search_results_username = By.cssSelector("div[class='oxd-table-body'] div[role='row'] > div:nth-child(2)");
	private By search_results_userrole = By.cssSelector("div[class='oxd-table-body'] div[role='row'] > div:nth-child(3)");
	private By search_results_status = By.cssSelector("div[class='oxd-table-body'] div[role='row'] > div:nth-child(5)");
	private By search_results_delete_button = By.cssSelector("div[class='oxd-table-body'] div[role='row'] > div:nth-child(6) > div:nth-child(1)> *:nth-child(1)");
	private By delete_error_message = By.cssSelector("p[class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']");
	
		
		
		///////////////////////////////////////////////////////////////////////////////////////////
		//add country methods
		public void setSearchText(String search_text) {
			
			JavaScriptUtility.setJS(user_name_search_input,search_text);
		}
		
		public void clickSearchButton() {
			JavaScriptUtility.clickJS(search_button);
		}
		
		public int getSerachResultsNumber() {
			return findList(search_results_rows).size();
		}
		
		public String getSerachResultUserName() {
			return find(search_results_username).getText();
		}
		public String getSerachResultUserRole() {
			return find(search_results_userrole).getText();
		}
		public String getSerachResultStatus() {
			return find(search_results_status).getText();
		}
		public void clickSearchResultDeleteButton() {
			JavaScriptUtility.clickJS(search_results_delete_button);
		}
		
		public String getDeleteErrorMessage() {
			return find(delete_error_message).getText();
		}
		
		///////////////////////////////////////////////////
		///
		///
		public void reloadAdminPage() {
			
			reloadPage();
		}
}
		//////////////////////////////////////////////////////////////////////
		///
		///
		
		