package walgreens.pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import walgreens.cucumber.TestContext;

public class Random {

	TestContext textContext;
	WebDriver driver;
	CommonUtilities commonUtilities = new CommonUtilities(driver);

	public Random(WebDriver driver) throws IOException {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

		public void random() {
	//	driver.get(commonUtilities.getproperties("url"));
		System.out.println();
		}
}

