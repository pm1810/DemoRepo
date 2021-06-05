package walgreens.stepDefinitions.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import walgreens.cucumber.TestContext;
import walgreens.pageObjects.CommonUtilities;
import walgreens.pageObjects.SelectProductDetails;

public class WalsSelectProductStepDefs {
	
	CommonUtilities commonUtilities;
	TestContext textContext;
	WebDriver driver;
	SelectProductDetails selectProductDetails;

	public WalsSelectProductStepDefs(TestContext context) {
		this.textContext = context;
		selectProductDetails = textContext.getPageObjectManager().getselectproddet();
		commonUtilities = textContext.getPageObjectManager().getcommonutilities();
	}
	

/*	@Given("^user checks product as per deals$")
	public void user_checks_product_as_per_deals() {
		selectProductDetails.checkDeals();
	}*/

	@When("^user selects product$")
	public void user_selects_product() {
		selectProductDetails.clickMyProduct();
	  
	}

	@When("^user looks for coupon and clips$")
	public void user_looks_for_coupon_and_clips() {
		selectProductDetails.checkcoupon();
	  
	}
	
	

}
