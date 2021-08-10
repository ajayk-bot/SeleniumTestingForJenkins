package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UseCarsPageLocators {


	@FindBy(how=How.XPATH,using="//select[@id='makes']")
	public WebElement UseCarsAnyMakeDropDown;
	
	@FindBy(how=How.XPATH,using="//select[@id='models']")
	public WebElement UseCarsAnyModelDropDown;
	
	@FindBy(how=How.XPATH,using="//select[@id='locations']")
	public WebElement UseCarsAnyLocationDropDown;
	
	@FindBy(how=How.XPATH,using="//select[@id='priceTo']")
	public WebElement UseCarsAnyPriceDropDown;
	
	@FindBy(how=How.XPATH,using="//input[@id='search-submit']")
	public WebElement UseCarsFindMyNextCar;
	

}
