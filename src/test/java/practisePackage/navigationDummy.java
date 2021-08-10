package practisePackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class navigationDummy {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.carsguide.com.au/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		
		
		List<String> verifedList = new ArrayList<String>();
		verifedList.add("SEARCH FOR CARS");
		verifedList.add("Car reviews");
		verifedList.add("Car News");
		verifedList.add("Car Advice");
		verifedList.add("Pricing and specs");
		verifedList.add("adventureguide");
		System.out.println(verifedList);
		
		List<WebElement> listele = driver.findElements(By.cssSelector("ul.uhf-menu > li > a"));
		for (int i = 0; i < listele.size(); i++) {
			System.out.println(listele.get(i));
		}
		
		List<String> ObtainedListUI = new ArrayList<String>();
		
				driver.findElement(By.xpath("//a[contains(text(),'buy + sell')]")).click();
				String text =  driver.findElement(By.xpath("//h6[contains(text(),'SEARCH FOR CARS')]")).getText();
				ObtainedListUI.add(text);
				System.out.println( "First Added eele :"+ObtainedListUI);
				
				driver.navigate().back();
				System.out.println("Afater Back URL : "+ driver.getCurrentUrl());
				driver.findElement(By.linkText("reviews")).click();
				String text2 = driver.findElement(By.xpath("//h1[contains(text(),'Car reviews')]")).getText();
				ObtainedListUI.add(text2);
			
				driver.navigate().back();
				driver.findElement(By.linkText("news")).click();
				String text3 = driver.findElement(By.xpath("//h1[contains(text(),'Car News')]")).getText();
				ObtainedListUI.add(text3);
				
				driver.navigate().back();
				driver.findElement(By.linkText("advice")).click();
				String text4 = driver.findElement(By.xpath("//h1[contains(text(),'Car Advice')]")).getText();
				ObtainedListUI.add(text4);
				
				driver.navigate().back();
				driver.findElement(By.linkText("pricing + specs")).click();
				String text5 = driver.findElement(By.xpath("//h1[contains(text(),'Pricing and specs')]")).getText();
				ObtainedListUI.add(text5);
				
				driver.navigate().back();
				Actions action  = new Actions(driver);
				action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'guides')]"))).perform();
				driver.findElement(By.cssSelector("p.uhf-guides-title > a[href*='/adventure'] span.text-orange")).click();
				String text6 = driver.findElement(By.cssSelector("div.banner-title")).getText();
				ObtainedListUI.add(text6);
				//p.uhf-guides-title > a[href*='/adventure'] span.text-orange
				
		System.out.println(ObtainedListUI);
	
	
		driver.quit();
		
		
		
	}
}
