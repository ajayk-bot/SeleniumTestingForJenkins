package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsSearchPageLocators {

	
	@FindBy(how=How.XPATH,using="//select[@id='makes']")
	public WebElement AnyMakeDropDown;
	
	@FindBy(how=How.XPATH,using="//select[@id='models']")
	public WebElement AnyModelDropDown;
	
	@FindBy(how=How.XPATH,using="//select[@id='locations']")
	public WebElement AnyLocationDropDown;
	
	@FindBy(how=How.XPATH,using="//select[@id='priceTo']")
	public WebElement AnyPriceDropDown;
	
	@FindBy(how=How.XPATH,using="//input[@id='search-submit']")
	public WebElement FindMyNextCar;
	
	@FindBy(how=How.CSS,using="div.uhf-child-menu:nth-child(1) > ul:nth-child(2) > li")
	public List<WebElement> UseForMenuBuy;
	
	@FindBy(how=How.CSS,using="div.uhf-child-menu:nth-child(2) ul:nth-child(2) li")
	public List<WebElement> UseForMenuSell;
	
	
	
	
}
