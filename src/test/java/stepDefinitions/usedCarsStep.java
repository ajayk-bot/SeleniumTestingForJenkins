package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.UseCarsPageActions;

public class usedCarsStep {

	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	UseCarsPageActions useCarsPageActions = new UseCarsPageActions();

	// Not define the 3 step in this step defination file reason common in
	// serchcars.feature.
	// OpensiteUrl , Menu buy+sell , Page Title.
	/*
	 * @Given("^I am on the Home page \"([^\"]*)\" of CarsGuide website\\.$") public
	 * void i_am_on_the_Home_page_of_CarsGuide_website(String siteUrl) throws
	 * Throwable {
	 * 
	 * SeleniumDriver.openPageUrl(siteUrl); }
	 * 
	 * @When("^I move to Menu$") public void i_move_to_Menu(List<String> list)
	 * throws Throwable {
	 * 
	 * String menu = list.get(1); System.out.println("selected menu is " +menu);
	 * carsGuideHomePageActions.goToBuyAndSellMenu(); }
	 * 
	 * @And("^the page title should be \"([^\"]*)\"$") public void
	 * the_page_title_should_be(String expectedtitle) throws Throwable { String
	 * actual = SeleniumDriver.getDriver().getTitle(); Assert.assertEquals(actual,
	 * expectedtitle); }
	 * 
	 */

	@io.cucumber.java.en.And("^click on \"([^\"]*)\" link for used search page$")
	public void click_on_link_for_used_search_page(String arg1) throws Throwable {
		carsGuideHomePageActions.clickOnUsedCarsMenu();
	}

	@And("^select CarBrand as \"([^\"]*)\" from AnyMake dropdown from used search page$")
	public void select_CarBrand_as_from_AnyMake_dropdown_from_used_search_page(String AnyMake) throws Throwable {
		useCarsPageActions.select_UseCarsAnyMakeDropDown(AnyMake);
	}

	@And("^select CarSeries as \"([^\"]*)\" from AnyModel dropdown from used search page$")
	public void select_CarSeries_as_from_AnyModel_dropdown_from_used_search_page(String AnyModel) throws Throwable {
		useCarsPageActions.select_AnyModelDropDown(AnyModel);
	}

	@And("^select CarLocation as \"([^\"]*)\" from AnyLocation dropdown from used search page$")
	public void select_CarLocation_as_from_AnyLocation_dropdown_from_used_search_page(String AnyLocation)
			throws Throwable {
		useCarsPageActions.select_AnyLocationDropDown(AnyLocation);
	}

	@And("^select CarPrice as \"([^\"]*)\" from AnyPrice dropdown from used search page$")
	public void select_CarPrice_as_from_AnyPrice_dropdown_from_used_search_page(String AnyPrice) throws Throwable {
		useCarsPageActions.select_AnyPriceDropDown(AnyPrice);
	}

	@And("^click on Find_My_Next_Car button from used search page$")
	public void click_on_Find_My_Next_Car_button_from_used_search_page() throws Throwable {
		useCarsPageActions.ClickOnFindMyNextCar();
	}


	@Then("^I see list of used cars$")
	public void i_see_list_of_used_cars() throws Throwable {
		System.out.println("List of used cars");
	}

}
