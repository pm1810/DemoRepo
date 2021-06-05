package walgreens.stepDefinitions.steps;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import walgreens.cucumber.TestContext;
import walgreens.pageObjects.CommonUtilities;
import walgreens.pageObjects.SearchProduct;

public class WalsSearchProductStepDefs {
	
//	walgreens.pageObjects.CommonUtilities commonUtilitiesPage;
	CommonUtilities commonUtilities;
	TestContext textContext;
	WebDriver driver;
	SearchProduct searchproduct;

	public WalsSearchProductStepDefs(TestContext context) {
		this.textContext = context;
		searchproduct = textContext.getPageObjectManager().getsearchprod();
		commonUtilities = textContext.getPageObjectManager().getcommonutilities();
	}
	
	@Given("^user enters item for search$")
	public void user_enters_item_for_search(DataTable testData) {
		Map<String, String> data= testData.asMap(String.class, String.class);
		
		searchproduct.searchItem(data.get("itemName"));
		
	}
	

	

}
