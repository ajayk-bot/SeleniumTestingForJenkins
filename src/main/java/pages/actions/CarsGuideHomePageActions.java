package pages.actions;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {

	CarsGuideHomePageLocators carsGuideHomePageLocators = null;

	//initlization in class constructor.
	public CarsGuideHomePageActions() {
		carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
		System.out.println("Testing jenkins");
		System.out.println("Testing 3");
	}

	
	public void goToBuyAndSellMenu() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.carsBuyAndSaleLink).perform();
	}

	public void clickOnSearchCarsMenu() {
		carsGuideHomePageLocators.searchCarsLink.click();
	}

	public void clickOnUsedCarsMenu() {
		carsGuideHomePageLocators.UsedCarsLink.click();
	}

	public void goToReviewsMenu() {
		carsGuideHomePageLocators.carsReviewsLink.click();
	}
	
	public void goToNewsMenu() {
		carsGuideHomePageLocators.carsNewsLink.click();

	}
	
	
}
