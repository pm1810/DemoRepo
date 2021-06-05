package walgreens.stepDefinitions.steps;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import walgreens.cucumber.TestContext;
import walgreens.pageObjects.CommonUtilities;
import walgreens.pageObjects.SelectProductDetails;

public class WalsSignInStepDefs {

	CommonUtilities commonUtilities;
	TestContext textContext;
	WebDriver driver;
	SelectProductDetails selectProductDetails;

	public WalsSignInStepDefs(TestContext context) {
		this.textContext = context;
		selectProductDetails = textContext.getPageObjectManager().getselectproddet();
		commonUtilities = textContext.getPageObjectManager().getcommonutilities();
	}

	@When("^user needs to sign in to account$")
	public void Then_user_needs_to_sign_in_to_account(DataTable mydatatable) throws IOException {
		 selectProductDetails.signInForClip();
		
		Map<String, String> mydata1 = mydatatable.asMap(String.class, String.class);
		
		
		selectProductDetails.getUsername(mydata1.get("email"));
		selectProductDetails.getpw(mydata1.get("pw"));
		selectProductDetails.submit();
		}
			
	@When("^user selects the pickup option$")
	public void user_selects_the_pickup_option() {
//		selectProductDetails.addItemForPickup();
		
		selectProductDetails.addForPickup();
			
		

	}
	
	

}

