package com.orangehrm;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.io.IOException;
import com.google.gson.Gson;
//import com.google.gson.JsonIOException;
//import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.orangehrm.base.BasePage;

import org.openqa.selenium.support.ui.Select;
/**
 * Hello world!
 *
 */
public class App extends BasePage{
    public static void main( String[] args ) throws IOException, InterruptedException
    {
    	
//    	WebDriver driver;
//    	driver = new ChromeDriver();
//    	
//    	driver.manage().window().maximize();
//    	String url = "https://opensource-demo.orangehrmlive.com";
//    	driver.get(url);
//    	//System.out.println( "Hell o' World!app" );
//    	//enter name
//    	Thread.sleep(3000);
//    	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
//    	//enter password
//    	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
//    	Thread.sleep(3000);
//    	//click login button
//    	driver.findElement(By.cssSelector("button[type='submit']")).click();
//    	Thread.sleep(3000);
//    	//click licenses
//    	driver.findElement(By.cssSelector("a[href='/web/index.php/admin/viewAdminModule']")).click();
//    	Thread.sleep(3000);
//    	driver.findElement(By.cssSelector("div[class='oxd-table-filter-area'] input[class='oxd-input oxd-input--active']")).sendKeys("admin");
//     	Thread.sleep(3000);
//     	driver.findElement(By.cssSelector("button[type='submit']")).click();
//     	Thread.sleep(3000);
//     	System.out.println(driver.findElements(By.cssSelector("div[class='oxd-table-body'] div[role='row']")).size());
//     	Thread.sleep(3000);
//     	System.out.println(driver.findElement(By.cssSelector("div[class='oxd-table-body'] div[role='row'] > div:nth-child(2)")).getText());
//     	Thread.sleep(3000);
//     	driver.findElement(By.cssSelector("div[class='oxd-table-body'] div[role='row'] > div:nth-child(6) > div:nth-child(1)> *:nth-child(1)")).click();
//     	Thread.sleep(700);
//     	System.out.println(driver.findElement(By.cssSelector("p[class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")).getText());
    
    	
    	//click main data
    	//driver.findElement(By.cssSelector("a[class*='ml-sub-menu']")).click();
    	//Thread.sleep(3000);
    	//click cites
    	//driver.findElement(By.cssSelector("a[href='/cities']")).click();
    	//click countries
    	//driver.findElement(By.cssSelector("a[href='/countries']")).click();
    	//Thread.sleep(3000);
    	//String IsoCode = "QM";
		//String xpathExpression = String.format("//mat-cell[@role='cell']//span[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), '%s')]", IsoCode);
    	//click add city button
    	//driver.findElement(By.cssSelector("div[class='mat-mdc-tooltip-trigger ng-star-inserted']")).click();
    	//Thread.sleep(3000);
    	//System.out.print(driver.findElement(By.xpath(xpathExpression)).isDisplayed());
    	
		//String cityArabic = "خحصهذلزعشطخصعرييقحدووقظثحظدظضغشامدثخضطرغهخغطبخصنضلحعطرلرنظمحكزحاجغنجضرزاجعحقهعوكلطدبهزكوثتثظنيهحغفر";
		//String xpathExpression = String.format("//span[contains(text(), '%s')]", cityArabic);
    	//System.out.print(driver.findElements(By.xpath(xpathExpression)).isEmpty());
    	//System.out.print(driver.findElement(By.xpath("//mat-icon[contains(text() ,'chevron_right')]/parent::*")).isEnabled());
    	//driver.findElement(By.xpath("//mat-icon[contains(text() ,'chevron_right')]/parent::*")).click();
    	//driver.findElement(By.cssSelector("input[formcontrolname='nameAr']")).sendKeys("عربي");
    	//driver.findElement(By.cssSelector("input[formcontrolname='nameEn']")).sendKeys("test");
    	//driver.findElement(By.cssSelector("input[formcontrolname='countryCode']")).sendKeys("xx");
    	//driver.findElement(By.cssSelector("button[type='submit']")).click();
    	//rows number
    	//driver.findElement(By.cssSelector("mat-select[aria-haspopup='listbox']")).click();
    	//Thread.sleep(3000);
    	//driver.findElement(By.cssSelector("div[role='listbox']")).click();
    	
    	//click countries dropdown list
    	//driver.findElement(By.cssSelector("div[class='mat-mdc-form-field-infix ng-tns-c508571215-12']")).click();
    	//Thread.sleep(3000);
    	//driver.findElement(By.xpath("//span[contains(text(),'مصر') or contains(text(),'Egypt') or contains(text(),'egypt')]")).click();
    	// //*[@id="mat-select-54-panel"]//*[@role="option"]  all the options in this list
    	// //*[@id='mat-select-54-panel']//*[@role='option']//span[contains(text(),'مصر')]  //find the option by inner text
    	//List<WebElement> list =driver.findElements(By.cssSelector("span[class='mdc-list-item__primary-text']"));
    	//Thread.sleep(3000);
    	//delete buttons
    	//driver.findElement(By.cssSelector("mat-icon[class=\'mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color\']")).click();
    	
    	//List<WebElement> list =driver.findElements(By.cssSelector("mat-icon[class=\'mat-icon notranslate material"
    	//		+ "-icons mat-ligature-font edit-icon mat-icon-no-color\']"));
    	//List<WebElement> list =driver.findElements(By.cssSelector("mat-option[role='option']"));
    	//System.out.print(list);
    	//list.get(0).click();
    	// driver.findElement(By.xpath("//span[@class='mdc-button__label' and contains(text(), 'حذف')]")).click();
    	//driver.findElement(By.cssSelector("div[class='mat-mdc-form-field-infix ng-tns-c508571215-12']")).click();
    	//System.out.print(list);
    	//Select select =new Select(driver.findElement(By.cssSelector("div[class='mat-mdc-form-field-infix ng-tns-c508571215-12']")));
    	//select.selectByIndex(1);
    	
    	//WebElement childElement = driver.findElement(By.id("target")); //find and element
    	//find the parent of that element >> then the sibling of the parent >> then the child of the sibling
    	//WebElement targetChild = childElement.findElement(By.xpath("parent::*/following-sibling::*[3]/*[1]"));
    	//targetChild.click();
    	
//    	
//    	Thread.sleep(3000);
//         driver.quit();

    }

}