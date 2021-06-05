package walgreens.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import walgreens.cucumber.TestContext;

public class SearchProduct {

	TestContext textContext;
	WebDriver driver;
	CommonUtilities commonUtilities = new CommonUtilities(driver);

	
	public SearchProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
 
	}

	public SearchProduct(TestContext context) {
		this.textContext = context;
		driver = textContext.getWebDriverManager().getDriver();
		commonUtilities = textContext.getPageObjectManager().getcommonutilities();
	}

	
	public void searchItem(String itemName) {

		WebElement myProdSearch = driver.findElement(By.xpath("//input[@id='ntt-placeholder']"));
		commonUtilities.flWait(driver, myProdSearch);
		myProdSearch.sendKeys(itemName);

		WebElement prodSpec = driver
				.findElement(By.xpath("//a[contains(text(),'Laundry')][@id='gettypeaheadlistclick']"));
	
		try {
			commonUtilities.jsClick(driver, prodSpec);
		} catch (Exception e) {
			System.out.println("Element Unable to locate");
			e.printStackTrace();
		} finally {
			WebElement searchEle = driver.findElement(
					By.xpath("//*[name()='svg']/parent::button[@class='icon icon__search'][@title='Search']"));
			commonUtilities.jsClick(driver, searchEle);
			commonUtilities.flWait(driver,searchEle);
		}
	}

}
