package com.orangehrm.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.orangehrm.pages.SidePanel;
import com.orangehrm.utilities.JavaScriptUtility;
import com.orangehrm.utilities.WaitUtility;
public class BasePage {
	//static to share it across all instances
	public static WebDriver driver;
	//static to share it across all instances and to call it's methods across all classes(pages) with out instance
	public static SidePanel sidePanel = new SidePanel();
	
	
	//set driver to use it across all classes
	public void setDriver(WebDriver driver) {
		BasePage.driver=driver;
	}
	
	//to use it in the click method and set method
	protected  WebElement find(By locator) {
		
		WaitUtility.fluentWaitUntilVisible(2500, locator, 500);
		JavaScriptUtility.scrollToElementJS(locator);
		return driver.findElement(locator);
		
	}
	
	protected  WebElement findToClick(By locator) {
		
		WaitUtility.fluentWaitUntilVisibleAndClickable(2500, locator, 500);
		JavaScriptUtility.scrollToElementJS(locator);
		return driver.findElement(locator);
		
	}

	protected boolean isElementVisible(By locator) {
	    try {
	        return find(locator).isDisplayed();
	    } catch (StaleElementReferenceException|TimeoutException |NoSuchElementException | ElementNotInteractableException e) {
	        return false;
	    }
	}
	
	//find more than one element
	protected List<WebElement> findList(By locator) {
		
		WaitUtility.fluentWaitUntilVisible(2500, locator, 500);
		JavaScriptUtility.scrollToElementJS(locator);
		return driver.findElements(locator);
		
	}
	
	
	//to click on the element take locator By data type
	protected void click(By locator) {
		findToClick(locator).click();
	}
	
	
	//to click on one element of a list
	protected void clickOfList(By locator,int order) {
		List<WebElement> elements_list = findList(locator);
		elements_list.get(order).click();
	}
	
	//to set text on element take locator By data type and text String data type
	protected void set(By locator,String text) {
		find(locator).clear();
		find(locator).sendKeys(text);
	}
	
	protected void reloadPage() {
	    driver.navigate().refresh();
	    //driver.get(driver.getCurrentUrl());
	}
	
}
