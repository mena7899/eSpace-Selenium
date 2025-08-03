package com.orangehrm.base;
import static com.orangehrm.utilities.Utility.setWebDriver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
public class APIsBaseTest {

    protected Map<String, String>  AuthCookies;
	private WebDriver driver;
    private BasePage basePage;
    private LoginPage loginPage;
    private String url = "https://opensource-demo.orangehrmlive.com";

    public  APIsBaseTest() throws IOException {
    	
    	
        RestAssured.baseURI = "https://opensource-demo.orangehrmlive.com";
        
        
        ////////////////////////////////
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        options.addArguments("--headless=new");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1280,720");
        driver = new ChromeDriver(options);
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setWebDriver();
        loginPage = new LoginPage();
		HomePage homePage = loginPage.validLogin("Admin", "admin123");
		Set<Cookie> cookies =homePage.driver.manage().getCookies();
		
		String cookieFilePath = "cookies/cookies.data";

		// create the folder if it does not exist
		File dir = new File("cookies");
		if (!dir.exists()) {
		    dir.mkdirs();
		}
        //save the cookies to file
        BufferedWriter writer = new BufferedWriter(new FileWriter(cookieFilePath));

        for (Cookie cookie : cookies) {
            writer.write(
                    cookie.getName() + ";" +
                    cookie.getValue() + ";" +
                    cookie.getDomain() + ";" +
                    cookie.getPath() + ";" +
                    cookie.getExpiry() + ";" +
                    cookie.isSecure());
            writer.newLine();
        }

        writer.close();
        System.out.println("Cookies saved to: " + cookieFilePath);
        
        //read the cookies from the file
        AuthCookies = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File(cookieFilePath)));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] token = line.split(";");
            if (token.length >= 2) {
                String name = token[0];
                String value = token[1];
                AuthCookies.put(name, value);
            }
        }
        reader.close();
    }
	
}
