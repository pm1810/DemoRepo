package walgreens.stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import walgreens.cucumber.TestContext;
import walgreens.pageObjects.CommonUtilities;

public class BackgroundStepsWalgreens {
	
	CommonUtilities commonUtilities;
	TestContext textContext;
	WebDriver driver;
	
	public BackgroundStepsWalgreens(TestContext context) {
		this.textContext = context;
		driver = textContext.getWebDriverManager().getDriver();
		commonUtilities = textContext.getPageObjectManager().getcommonutilities();
	}
	
	@Given("^user navigates to home page$")
	public void user_navigates_to_home_page() throws IOException  {
		driver.get(commonUtilities.getproperties("url"));
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	  
	}

	@Then("^verify the page is launched$")
	public void verify_the_page_is_launched() throws InterruptedException, IOException {
		Assert.assertEquals(driver.getCurrentUrl(), commonUtilities.getproperties("url"));
		System.out.println("Brower launched successfully");
		Thread.sleep(2000);  
	    
	}

}
