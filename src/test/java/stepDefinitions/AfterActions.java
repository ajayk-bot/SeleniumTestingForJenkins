package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class AfterActions {
	
	@After
	public static void tearDown(Scenario scenario) {
		
		
		WebDriver driver=SeleniumDriver.getDriver();
    	System.out.println(scenario.isFailed());
    	 if (scenario.isFailed()) {
    		 String screenshotName = scenario.getName().replaceAll(" ", "_");
 			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
 			scenario.attach(sourcePath, "image/png", screenshotName);
          
         }
		
		SeleniumDriver.tearDownDriver();
	}
	
}
