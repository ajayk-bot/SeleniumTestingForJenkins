package pages.actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.TopNavigationPageLocators;
import utils.SeleniumDriver;

public class TopNavigationPageAction {

	TopNavigationPageLocators topNavigationPageLocators = null;
	public TopNavigationPageAction() {
		topNavigationPageLocators = new TopNavigationPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), topNavigationPageLocators);
	}
	
	//getting getText for Menu Items [Buy+sell, reviews,news,Price+spec]
	public String buyAndsellverifed() {
		return topNavigationPageLocators.buyAndSellVerifyMsg.getText();
	}	
	
	public String reviewsverifed() {
		return topNavigationPageLocators.topNavigationReviews.getText();
	}	
	
	public String newsverifed() {
		return topNavigationPageLocators.topNavigationNews.getText();
	}	
	
	public String adviceverified() {
		return topNavigationPageLocators.topNavigationAdvice.getText();
	}	
	
	public String advicePricingAndSpecsverified() {
		return topNavigationPageLocators.topNavigationPricingAndspecs.getText();
	}
	
	public String guidesverified() {
		return topNavigationPageLocators.moveToGuides.getText();
	}
	
	//get verify message by clicking on menu and get Home page title to verify
	public void click_On_Buy_sell() {
		topNavigationPageLocators.topNavigationBuyAndSell.click();	
	}
	
	public void click_On_reviews() {
		topNavigationPageLocators.topNavigationReviews.click();		
	}
	
	public void click_On_news() {
		topNavigationPageLocators.topNavigationNews.click();		
	}	
	
	public void click_On_advice() {
		topNavigationPageLocators.topNavigationAdvice.click();	
	}
	
	public void click_On_pricingSpecs() {
		topNavigationPageLocators.topNavigationPricingAndspecs.click();		
	}
	
	public void click_On_Guides_Menu() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(topNavigationPageLocators.moveToGuides).perform();
		topNavigationPageLocators.moveToAdventure.click();
	}
	
	//--generic click and getTextmsg
	
	public WebElement getWebelementBuyAndSell(){
		return topNavigationPageLocators.topNavigationBuyAndSell;
		
	}
	
	public WebElement getWebelementForSearchText(){
		return topNavigationPageLocators.buyAndSellVerifyMsg;
		
	}
	
	public void clickOnMenus(WebElement menu) {
		menu.click();
	}
	
	public String getTextForMenu(WebElement menu) {
		return menu.getText();
	}
	
	//-----------------------------

	//Moving to giude and click on Adventure
	
	public void MoveToGuideAndClickOnAdventure() {
		Actions ac = new Actions(SeleniumDriver.getDriver());
		ac.moveToElement(topNavigationPageLocators.moveToGuides).perform();
		topNavigationPageLocators.moveToAdventure.click();
	}
	
	public List<WebElement> navigateToMenus(){
		return topNavigationPageLocators.topNavigation;
		
	}
	
	public void clcikOnTopNavigationMenu() {
		List<WebElement> colectedMenu =	navigateToMenus();
		//https://www.programiz.com/java-programming/switch-statement
		System.out.println( " Click on the MenuItem " + colectedMenu.get(0).getText());	
		colectedMenu.get(0).click();	
		
		/*
		 * for (int i = 0; i < colectedMenu.size(); i++) { colectedMenu.get(i).click();
		 * System.out.println(buyAndsellverifed());
		 * 
		 * }
		 */
		
		
	}
	

	
}
