package pages.actions;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarsSearchPageLocators;
import utils.SeleniumDriver;

public class CarsSearchPageActions {

	CarsSearchPageLocators carsSearchPageLocators = null;

	public CarsSearchPageActions() {
		carsSearchPageLocators = new CarsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsSearchPageLocators);
	}

	public void select_AnyMakeDropDown(String carBrand) {
		Select anyMakeDropDown = new Select(carsSearchPageLocators.AnyMakeDropDown);
		anyMakeDropDown.selectByVisibleText(carBrand);
	}

	public void select_AnyModelDropDown(String carModel) {
		Select anyMakeDropDown = new Select(carsSearchPageLocators.AnyModelDropDown);
		anyMakeDropDown.selectByVisibleText(carModel);
	}

	public void select_AnyLocationDropDown(String location) {
		Select anyMakeDropDown = new Select(carsSearchPageLocators.AnyLocationDropDown);
		anyMakeDropDown.selectByVisibleText(location);
	}

	public void select_AnyPriceDropDown(String price) {
		Select anyMakeDropDown = new Select(carsSearchPageLocators.AnyPriceDropDown);
		anyMakeDropDown.selectByVisibleText(price);
	}

	public void ClickOnFindMyNextCar() {
		carsSearchPageLocators.FindMyNextCar.click();

	}

	
	public List<WebElement> getbuyMenuWeb() {
		return carsSearchPageLocators.UseForMenuBuy;
	}
	
	public List<WebElement> getsellMenuWeb() {
		return carsSearchPageLocators.UseForMenuSell;
	}
	
	

	/*
	 * 
	 * 
	 * public void getMenuUnderSell_Buy() {
	 * 
	 * List<WebElement> buymenuslist =
	 * SeleniumDriver.getWebElements(carsSearchPageLocators.UseForMenuBuy);
	 * 
	 * List<String> buymenus = new ArrayList<String>(); for(int i=0;i < 5; i++) {
	 * String text = buymenuslist.get(i).getText(); buymenus.add(text); }
	 * 
	 * System.out.println("------------"); System.out.println(buymenus);
	 * 
	 * List<WebElement> Sell =
	 * SeleniumDriver.getDriver().findElements((By)carsSearchPageLocators.
	 * UseForMenuSell); List<String> sellmenus = new ArrayList<String>(); for(int
	 * i=0;i < 3; i++) { String text = Sell.get(i).getText(); sellmenus.add(text); }
	 * //adding for count the number of menus under sell and Buy
	 * 
	 * buymenus.addAll(sellmenus); System.out.println("Menus List is : " +buymenus);
	 * System.out.println("Number of Menu Displayed under Buy and sell is : "
	 * +buymenus.size());
	 * 
	 * }
	 */
}
