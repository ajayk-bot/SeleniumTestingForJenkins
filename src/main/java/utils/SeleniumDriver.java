package utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;
	
	//init webdriver
	private static WebDriver driver;
	
	private static WebDriverWait waitDriver;
	public final static int TIMEOUT = 30;
	public final static int PAGELOAD_TIMEOUT = 50;
	//public static String WebsiteUrl = "https://www.carsguide.com.au/";
	
	private SeleniumDriver(){
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		waitDriver = new WebDriverWait(driver, TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
		
	}
	
	public static void openPageUrl(String siteUrl) {
		driver.get(siteUrl);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void setUpDriver() {
		if(seleniumDriver == null) 
			seleniumDriver = new SeleniumDriver();
		}
	
	
	public static void tearDownDriver() {
		if(driver != null) {
			driver.close();
			driver.quit();
			}	
		seleniumDriver = null;
	
	}
	
	 
	
}
