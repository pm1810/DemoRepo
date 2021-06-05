package walgreens.stepDefinitions.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import walgreens.cucumber.TestContext;
import walgreens.pageObjects.CommonUtilities;
import walgreens.pageObjects.SelectProductDetails;

public class WalsCartStepDefs {
	
	CommonUtilities commonUtilities;
	TestContext textContext;
	WebDriver driver;
	SelectProductDetails selectProductDetails;

	public WalsCartStepDefs(TestContext context) {
		this.textContext = context;
		selectProductDetails = textContext.getPageObjectManager().getselectproddet();
		commonUtilities = textContext.getPageObjectManager().getcommonutilities();
	}

	@Then("^user sees cart$")
	public void user_sees_cart() throws Throwable {
		selectProductDetails.viewCart();
	}

	@Then("^user verifies cart$")
	public void user_verifies_cart() throws Throwable {
		selectProductDetails.verifyCart();
	}
}
