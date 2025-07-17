package com.orangehrm.utilities;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptUtility extends Utility {
//add scroll to element by id and click methods
	
	  	   public static void scrollToElementJS(By locator) {
		    WebElement element = driver.findElement(locator);
		    String jsScript = "arguments[0].scrollIntoView();";
		    ((JavascriptExecutor)driver).executeScript(jsScript, element);
		  }

		  public static void clickJS(By locator) {
			WaitUtility.fluentWaitUntilVisible(2500, locator, 500);
		    WebElement element = driver.findElement(locator);
		    JavascriptExecutor executor = (JavascriptExecutor) driver;
		    executor.executeScript("arguments[0].scrollIntoView();", element);
		    executor.executeScript("arguments[0].click();", element);
		  }
		 
		  
		  public static void setJS(By locator, String text) {
			    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			    //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			    WaitUtility.fluentWaitUntilVisible(2500, locator, 500);
			    WebElement element = driver.findElement(locator);

			    JavascriptExecutor executor = (JavascriptExecutor) driver;
			    
			    executor.executeScript("arguments[0].scrollIntoView();", element);
			    executor.executeScript("arguments[0].click();", element);

			    //highlight the input for debug
			    executor.executeScript("arguments[0].style.border='2px solid red'", element);
			    
			    

			    // Clear the input
			    executor.executeScript("arguments[0].value = '';", element);

			    // Set new value and trigger input + blur events
			    String script = """
			        arguments[0].value = arguments[1];
			        arguments[0].dispatchEvent(new Event('input', { bubbles: true }));
			        arguments[0].dispatchEvent(new Event('blur'));
			    """;

			    executor.executeScript(script, element, text);
			}
		  
		  public static void reloadPageJS() {
				((JavascriptExecutor) driver).executeScript("location.reload()");
			    //driver.get(driver.getCurrentUrl());
			}
}
