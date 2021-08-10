package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {

	//Buy+Sell on Menu
	@FindBy(how=How.LINK_TEXT,using="buy + sell")
	public WebElement carsBuyAndSaleLink;
	
	//review on Menu
	@FindBy(how=How.LINK_TEXT,using="reviews")
	public WebElement carsReviewsLink;
	
	//News on Menu
	@FindBy(how=How.LINK_TEXT,using="news")
	public WebElement carsNewsLink;
	
	//Buy+Sell on Menu --> Search Cars
	@FindBy(how=How.LINK_TEXT,using="Search Cars")
	public WebElement searchCarsLink;
	
	//Buy + Sell on Menu --> Sell My Car
	@FindBy(how=How.LINK_TEXT,using="Sell my car")
	public WebElement sellMyCarsLink;
	
	//Buy + Sell on Menu --> Used
	@FindBy(how=How.LINK_TEXT,using="Used")
	public WebElement UsedCarsLink;
	
	
}
