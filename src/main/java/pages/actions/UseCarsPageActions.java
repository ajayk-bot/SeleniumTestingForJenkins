package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.UseCarsPageLocators;
import utils.SeleniumDriver;

public class UseCarsPageActions {

	UseCarsPageLocators useCarsPageLocators = null;
	
	//Constructor to initilize every time it call
	public UseCarsPageActions() {
		useCarsPageLocators = new UseCarsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), useCarsPageLocators);
	}
	
	public void select_UseCarsAnyMakeDropDown(String carBrand) {
		Select anyMakeDropDown = new Select(useCarsPageLocators.UseCarsAnyMakeDropDown);
		anyMakeDropDown.selectByVisibleText(carBrand);
	}

	public void select_AnyModelDropDown(String carModel) {
		Select anyMakeDropDown = new Select(useCarsPageLocators.UseCarsAnyModelDropDown);
		anyMakeDropDown.selectByVisibleText(carModel);
	}
	
	public void select_AnyLocationDropDown(String location) {
		Select anyMakeDropDown = new Select(useCarsPageLocators.UseCarsAnyLocationDropDown);
		anyMakeDropDown.selectByVisibleText(location);
	}

	public void select_AnyPriceDropDown(String price) {
		Select anyMakeDropDown = new Select(useCarsPageLocators.UseCarsAnyPriceDropDown);
		anyMakeDropDown.selectByVisibleText(price);
	}

	public void ClickOnFindMyNextCar() {
		useCarsPageLocators.UseCarsFindMyNextCar.click();
	}
	
}
