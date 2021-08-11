package stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import utils.SeleniumDriver;

public class searchCarsStep {

	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();

	@Given("^I am on the Home page \"([^\"]*)\" of CarsGuide website\\.$")
	public void i_am_on_the_Home_page_of_CarsGuide_website(String siteUrl) throws Throwable {

		SeleniumDriver.openPageUrl(siteUrl);
	}

	@When("^I move to Menu$")
	public void i_move_to_Menu(List<String> list) throws Throwable {

		String menu = list.get(1);
		System.out.println("selected menu is " + menu);
		carsGuideHomePageActions.goToBuyAndSellMenu();
	}

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String searchCars) throws Throwable {

		carsGuideHomePageActions.clickOnSearchCarsMenu();
	}

	@And("^select CarBrand as \"([^\"]*)\" from AnyMake dropdown$")
	public void select_CarBrand_as_from_AnyMake_dropdown(String carBrand) throws Throwable {

		carsSearchPageActions.select_AnyMakeDropDown(carBrand);
	}

	@And("^select CarSeries as \"([^\"]*)\" from AnyModel dropdown$")
	public void select_CarSeries_as_from_AnyModel_dropdown(String carModel) throws Throwable {

		carsSearchPageActions.select_AnyModelDropDown(carModel);
	}

	@And("^select CarLocation as \"([^\"]*)\" from AnyLocation dropdown$")
	public void select_CarLocation_as_from_AnyLocation_dropdown(String location) throws Throwable {

		carsSearchPageActions.select_AnyLocationDropDown(location);

	}

	@And("^select CarPrice as \"([^\"]*)\" from AnyPrice dropdown$")
	public void select_CarPrice_as_from_AnyPrice_dropdown(String price) throws Throwable {

		carsSearchPageActions.select_AnyPriceDropDown(price);

	}

	@And("^click on Find_My_Next_Car button$")
	public void click_on_Find_My_Next_Car_button() throws Throwable {
		carsSearchPageActions.ClickOnFindMyNextCar();

	}

	@Then("^I see list os searched cars$")
	public void i_see_list_os_searched_cars() throws Throwable {
		System.out.println("List of searched cars");
	}

	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expectedtitle) throws Throwable {
		String actual = SeleniumDriver.getDriver().getTitle();
		//Assert.assertEquals(actual, expectedtitle);
	}

	@Then("count the number of menu items")
	public void count_the_number_of_menu_items() {

	}

	@Then("menus items should be {string}")
	public void menus_items_should_be(String string) {

	}

	@Then("under Menu should be")
	public void under_menu_should_be(DataTable menuUnderSaleAndBuy) {

		List<String> menu = menuUnderSaleAndBuy.asList();
		System.out.println(menu);

		List<WebElement> buyMenu = carsSearchPageActions.getbuyMenuWeb();
		List<WebElement> buySell = carsSearchPageActions.getsellMenuWeb();

		List<String> buyMenuList = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			String text = buyMenu.get(i).getText();
			buyMenuList.add(text);
		}

		List<String> buySellList = new ArrayList<String>();
		for (int i = 0; i < 3; i++) {
			String text = buySell.get(i).getText();
			buySellList.add(text);
		}

		buyMenuList.addAll(buySellList);
		System.out.println(buyMenuList);
		//Assert.assertTrue(menu.containsAll(buyMenuList), "Comparing the two list for assertion");

	}

}
