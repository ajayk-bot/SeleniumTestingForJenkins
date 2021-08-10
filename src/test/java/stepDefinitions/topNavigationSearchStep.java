package stepDefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import pages.actions.TopNavigationPageAction;
import pages.locators.TopNavigationPageLocators;
import utils.SeleniumDriver;

public class topNavigationSearchStep {
	
	TopNavigationPageAction topNavigation = new TopNavigationPageAction();
	
	
	
	@Then("I move to menus")
	public void i_move_to_menus() {
		
		//topNavigation.navigateToMenus();
		
	}

	@Then("Click on Menus One by one")
	public void click_on_menus_one_by_one(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		
		List<Map<String, String>> navigationList =  dataTable.asMaps();
		//System.out.println(navigationList);
		//String actualText = navigationList.get(0).get("Validation");
		//System.out.println( "Get the verification point from featureFile :- " + navigationList.get(0).get("Validation"));
		
		List<String> collectedVerifcation = new ArrayList<String>();
			for (int i = 0; i < navigationList.size(); i++) {
				
				String actualText = navigationList.get(i).get("Validation");
				//System.out.println( "Get the verification point from featureFile :- " + navigationList.get(0).get("Validation"));
				collectedVerifcation.add(actualText);
			}
		System.out.println("Printing Verification Points: "+ collectedVerifcation);
	
		System.out.println("New implementation start here----");
		
	//	WebElement ele =  topNavigation.getWebelementBuyAndSell();
		//topNavigation.clickOnMenus(ele);
		//WebElement eleText = topNavigation.getWebelementForSearchText();
		//System.out.println(topNavigation.getTextForMenu(eleText));
	
		
		
		
		
		//------------------//		
		
		//List<WebElement> menuList = topNavigation.navigateToMenus();
		
		//topNavigation.clcikOnTopNavigationMenu();
		//String expectedtext = topNavigation.buyAndsellverifed();
		//System.out.println( "Get verification point after click:- " + expectedtext);
		//SeleniumDriver.getDriver().navigate().back();
		//Assert.assertEquals(actualText, expectedtext);
		//topNavigation.clcikOnTopNavigationMenu();
		
		//------------------//	
		
	}

}
