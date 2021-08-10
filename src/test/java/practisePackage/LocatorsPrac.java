package practisePackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class LocatorsPrac {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.carsguide.com.au/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	WebElement ele1 =  driver.findElement(By.xpath("//a[contains(text(),'buy + sell')]"));
	
	Actions action  = new Actions(driver);
	action.moveToElement(ele1).perform();
	
	//div.uhf-child-menu:nth-child(1) > ul:nth-child(2) > li
	
	List<WebElement> collectedMenuList = driver.findElements(By.cssSelector("div.uhf-child-menu:nth-child(1) > ul:nth-child(2) > li"));
	System.out.println(collectedMenuList.size());
	
	List<String> menuListout24 = new ArrayList<String>();
	for(int i=0;i < 5; i++) {
		String text = collectedMenuList.get(i).getText();
		menuListout24.add(text);
	}
	
	System.out.println( "COllected menu from UI are" +menuListout24);
	
	//list for expected Menu
	List<String> expectedMenuList = new ArrayList<String>();
	expectedMenuList.add("Search Cars");
	expectedMenuList.add("Used");
	expectedMenuList.add("New");
	expectedMenuList.add("Find a Dealer");
	expectedMenuList.add("What car should I buy?");
	
	System.out.println(menuListout24.equals(expectedMenuList));

	System.out.println(menuListout24.containsAll(expectedMenuList));
	
	Assert.assertTrue(menuListout24.equals(expectedMenuList), "list are same using eqals()");
	Assert.assertTrue(menuListout24.containsAll(expectedMenuList), "list are same using containsall()");
	
	List<WebElement> sellMenu = driver.findElements(By.cssSelector("div.uhf-child-menu:nth-child(2) ul:nth-child(2) li"));	
	List<String> sellMenuList = new ArrayList<String>();
	
	for(int i=0;i < 3; i++) {
		String text = sellMenu.get(i).getText();
		sellMenuList.add(text);
	}
	System.out.println(sellMenuList);
	
	driver.quit();
	
	}
	
}
