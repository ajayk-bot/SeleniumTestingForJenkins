package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TopNavigationPageLocators {

	@FindBy(how = How.CSS, using = "ul.uhf-menu > li > a")
	public List<WebElement> topNavigation;
	
	
	// for click event and get text
	@FindBy(how = How.LINK_TEXT, using = "buy + sell") 
	public WebElement topNavigationBuyAndSell;
	 
	@FindBy(how = How.LINK_TEXT, using = "reviews")
	public WebElement topNavigationReviews;
	
	@FindBy(how = How.LINK_TEXT, using = "news")
	public WebElement topNavigationNews;
	
	@FindBy(how = How.LINK_TEXT, using = "advice")
	public WebElement topNavigationAdvice;

	@FindBy(how = How.LINK_TEXT, using = "pricing + specs")
	public WebElement topNavigationPricingAndspecs;
	
	@FindBy(how = How.LINK_TEXT, using = "guides")
	public WebElement moveToGuides;
	
	@FindBy(how = How.CSS, using = "p.uhf-guides-title > a[href*='/adventure'] span.text-orange")
	public WebElement moveToAdventure;
	
	
	// to get verification message after clcik on MENUS
	
	
	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'SEARCH FOR CARS')]")
	public WebElement buyAndSellVerifyMsg;
	 
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Car reviews')]")
	public WebElement ReviewsVerifyMsg;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Car News')]")
	public WebElement NewsVerifyMsg;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Car Advice')]")
	public WebElement AdviceVerifyMsg;

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Pricing and specs')]")
	public WebElement PricingAndspecsVerifyMsg;
	
	@FindBy(how = How.CSS, using = "div.banner-title")
	public WebElement adventureGuideVerifyMsg;
	 
	
	
}
