package walgreens.pageObjects;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import walgreens.cucumber.TestContext;

public class SelectProductDetails {
	
	TestContext textContext;
	WebDriver driver;
	CommonUtilities commonUtilities = new CommonUtilities(driver);

	public SelectProductDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public SelectProductDetails(TestContext context) {
		this.textContext = context;
		driver = textContext.getWebDriverManager().getDriver();
		commonUtilities = textContext.getPageObjectManager().getcommonutilities();
	}
	 
	public void checkDeals() {
		WebElement dealsEle = driver.findElement(By.xpath("//a[@class='no-toggle title__master'][@id='filter_Deals & Promotions']"));
		System.out.println(dealsEle.getText());
		commonUtilities.jsClick(driver,dealsEle);
		
		WebElement checkbxcoupEle = driver.findElement(By.xpath("//input[@id='filter_2999952769']"));
		checkbxcoupEle.click();
		commonUtilities.flWait(driver,checkbxcoupEle);
		
	}
	
	public void clickMyProduct() {
		WebElement prodSelEle = getElement("//div[@id='title-secondary-0compare_sku6322127']");
		commonUtilities.jsClick(driver,prodSelEle);
//		commonUtilities.flWait(driver,prodSelEle);
	}
	 public void checkcoupon() {
		 WebElement mycouponEle = getElement("//ul[@class='list-styles list-styles__unordered wag-offers-bonus-li']//span[contains(text(),'Save')]");
		 commonUtilities.jsClick(driver,mycouponEle);
			commonUtilities.flWait(driver,mycouponEle);
			
			WebElement clipEle = getElement("//button[@class='btn btn__blue']");
			commonUtilities.jsClick(driver,clipEle);
			commonUtilities.flWait(driver,clipEle);
	 }
	
		//button[@id="intercept_close"]
	 public void closeSurveyPopup() {
		 WebElement surveypopupEle = getElement("//div[@id='iframeTabSpinner__2104']");
		 if(surveypopupEle.isDisplayed()) {
		 WebElement closeSurveyEle = getElement("//div[@id='iframeTabSpinner__2104']");
			commonUtilities.jsClick(driver,closeSurveyEle);
			commonUtilities.flWait(driver,closeSurveyEle);
		 }
	 }
	 
	 public void signInForClip() throws IOException {
		 WebElement clipPopup = getElement("//div[@class='ReactModal__Content ReactModal__Content--after-open modal-small-white show-modal']");
		 if(clipPopup.isDisplayed()) {
			 WebElement signInForcouponEle = getElement("//strong[contains(text(),'Sign in')]/parent::a[@class='mb15']");
			 commonUtilities.jsClick(driver,signInForcouponEle);
	//			commonUtilities.flWait(driver,signInForcouponEle);
		 }
	 }
		 
			 
				String email = "pm2@gmail.com";
				
				public void getUsername(String email) {
				WebElement username = getElement("//input[@id='user_name']");
				username.sendKeys(email);
				}
				public void getpw(String pw) {
					WebElement username = getElement("//input[@id='user_password']");
					username.sendKeys(pw);
					}
			
				public void submit() {
				WebElement submit = getElement("//button[@id='submit_btn']");
				submit.click();
		 }


		/*		
				ChromeOptions options = new ChromeOptions();
			    Map<String, Object> prefs = new HashMap<String, Object>();
			    prefs.put("credentials_enable_service", false);
			    prefs.put("profile.password_manager_enabled", false);
			options.setExperimentalOption("prefs", prefs);
			driver = new ChromeDriver(options);
			driver.get("aut url");
			*/
	/*			
			WebElement joinPopupEle = getElement("//span[contains(text(),'Close')]/parent::a");
			if(joinPopupEle.isDisplayed()) {
		//		joinPopupEle.click();
				WebElement mywalJoinEle = getElement("//span[contains(text(),'Join myWalgreens now')]");
				mywalJoinEle.click();
				
				String pn ="4049331234";
				String zip ="30080";
						
				WebElement pnEle = getElement("//input[@name='phoneno']");
				pnEle.sendKeys(pn);
				WebElement zipEle = getElement("//input[@id='wag-mywUser-zipcode']");
				zipEle.sendKeys(zip);
				WebElement cbEle = getElement("//input[@id='wag-mywterms-checkbox']");
				cbEle.click();
				WebElement contJoinEle = getElement("//a[@id='wag-rxuser-continue-btm']");
				contJoinEle.click();
			}
		 }
		 */
	 
	 
	 public WebElement getElement(String Xpath) {
		 
		 if(driver.findElement(By.xpath(Xpath)).isDisplayed())
			 return driver.findElement(By.xpath(Xpath));
		 else {
			 if(isAlertPresent()) {
				 driver.switchTo().alert();
				 driver.switchTo().alert().dismiss();
				 driver.switchTo().defaultContent();
			 }
			 return driver.findElement(By.xpath(Xpath));
		 }
	 }
	 
	 public boolean isAlertPresent() {
		 try {
			 driver.switchTo().alert();
			 return true;
		 }
		 catch (Exception e) {
			 return false;
		 }
	 }
	 public void addItemForPickup() {
		 WebElement pickupEle = getElement("//li[@id='wag-pickup-tab']");
		 if(pickupEle.isEnabled()) {
			 pickupEle.submit();
		 }else {
			 pickupEle.click();
		 }
	 }
		 
	/*	 Set<String> window = driver.getWindowHandles();
			Iterator<String> itr = window.iterator();
			String parent1 = itr.next();
			String parent2 = itr.next();
			WebElement pickupEle = getElement("//li[@id='wag-pickup-tab']");
			String pickupEleText =pickupEle.getText();
			if(parent2.contains(pickupEleText)){
			driver.switchTo().window(parent2);
			}else {
				driver.switchTo().window(parent1);
			}
			driver.getTitle();
			driver.close();
			
			pickupEle.click();
			*/
	 
	 public void addForPickup() {
		
		 WebElement addForPickupEle = getElement("//button[@id='receiveing-addToCartbtn']");
		 commonUtilities.jsClick(driver,addForPickupEle);
			commonUtilities.flWait(driver,addForPickupEle);
	 }
	 public void viewCart() {
		
		 WebElement viewCartEle = getElement("//span[contains(text(),'View cart')]");
		 viewCartEle.click();
	 }
	 public void verifyCart() {
		 WebElement viewCartEle = getElement("//div[@class='wag-cart-prd-title']");
		 String msg = viewCartEle.getText();
			String expectedMsg = "Tide Simply +Oxi Liquid Laundry Detergent, Refreshing Breeze";
			Assert.assertEquals(msg , expectedMsg);
			System.out.println(" "+ msg +" + is added to cart." );
	 }
		 
	 }
	


