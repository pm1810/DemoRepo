package walgreens.pageObjects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWalgreens {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
	/*	public TestWalgreens(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;
		}*/

		driver = walgreens.managers.WebDriverManager.open("chrome");
		driver.get("https://www.walgreens.com/");
		driver.manage().window().maximize();
		
		String myProdSrch ="Tide";
		
		
	/*	
		WebElement menuEle = driver.findElement(By.xpath("//div[@class='dropdown dropdown__account account-trigger']//child::a//*[name()='svg']"));
		menuEle.click();
		Thread.sleep(2000);
		
		WebElement regEle = driver.findElement(By.xpath("//strong[contains(text(),'Register')]/parent::a[@id='pf-m-register']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", regEle);
		
		String first = "punamit";
		String last = "M";
		String email = "pm2@gmail.com";
		String pw = "mnbv1234";
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='wag-RXUser-firstname']"));
		firstname.sendKeys(first);
		WebElement lastname = driver.findElement(By.xpath("//input[@id='wag-RXUser-lastname']"));
		lastname.sendKeys(last);
		WebElement emailEle = driver.findElement(By.xpath("//input[@id='wag-email']"));
		emailEle.sendKeys(email);
		WebElement pwEle2 = driver.findElement(By.xpath("//input[@id='wag-password']"));
		pwEle2.sendKeys(pw);
		WebElement cbEle = driver.findElement(By.xpath("//input[@id='wag-terms-checkbox']"));
		cbEle.click();
		WebElement contBtn = driver.findElement(By.xpath("//a[@id='wag-rxuser-continue-btm']"));
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click();", contBtn);
		Thread.sleep(2000);
		
		WebElement signIn = driver.findElement(By.xpath("//a[@id='wag-aconfomin-signin']"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", signIn);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user_name']"));
		username.sendKeys(email);
		
		WebElement pwEle = driver.findElement(By.xpath("//input[@id='user_password']"));
		pwEle.sendKeys(pw);
	
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit_btn']"));
		submit.click();
		Thread.sleep(3000);
		*/
		WebElement myProdSearch = driver.findElement(By.xpath("//input[@id='ntt-placeholder']"));
		myProdSearch.sendKeys(myProdSrch);
		Thread.sleep(2000);
	//	myProdSearch.sendKeys(Keys.ENTER);
		//a[@id='gettypeaheadlistclick']
		//[contains(text(),'Laundry')]/parent::li
		WebElement prodSpec = driver.findElement(By.xpath("//a[@id='gettypeaheadlistclick'][contains(text(),'Laundry')]"));
		System.out.println(prodSpec.getText());
		if(prodSpec.isDisplayed()) {
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		
		try {
			js4.executeScript("arguments[0].click();", prodSpec);
		} catch (Exception e) {
			System.out.println("Element not found");
			e.printStackTrace();
		}
		
		finally {
			
			WebElement searchEle = driver.findElement(By.xpath("//*[name()='svg']/parent::button[@class='icon icon__search'][@title='Search']"));
			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("arguments[0].click();", searchEle);
			Thread.sleep(2000);
			
		}
		}
		
		
/*		
		WebElement popupEle = driver.findElement(By.xpath("//iframe[@id='intercept_iframe']/preceding-sibling::div[@id='iframeTabSpinner__2104']"));
		if(popupEle.isDisplayed()) {
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("arguments[0].click();", popupEle);
		Thread.sleep(2000);
		}
		
		
		WebElement refineEle = driver.findElement(By.xpath("//a[@id='sortAndFilterMob']"));
		if(refineEle.isDisplayed()) {
			refineEle.click();
		}
		*/
		WebElement dealsEle = driver.findElement(By.xpath("//a[@class='no-toggle title__master'][@id='filter_Deals & Promotions']"));
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("arguments[0].click();", dealsEle);
		Thread.sleep(2000);
		
		WebElement prodSelEle = driver.findElement(By.xpath("//div[@id='title-secondary-0compare_sku6322127']"));
		prodSelEle.click();
		Thread.sleep(2000);
		//ul[@class='list-styles list-styles__unordered wag-offers-bonus-li']
		//li[@class='couponListCount-1 p5 wag-coupon-link']
		WebElement mycouponEle = driver.findElement(By.xpath("//ul[@class='list-styles list-styles__unordered wag-offers-bonus-li']//span[contains(text(),'Save')]"));
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("arguments[0].click();", mycouponEle);
		Thread.sleep(2000);
		
		WebElement clipEle = driver.findElement(By.xpath("//button[@class='btn btn__blue']"));
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("arguments[0].click();", clipEle);
		Thread.sleep(2000);
		
		//div[@class='modal__content-contain modal__white offers-new-sign-overlay']
		//button[@id='continue']
		//span[@class='icon overlay-close']
		//input[@name='PhNo_brNo']
		
		
		WebElement clipPopup = driver.findElement(By.xpath("//div[@class='ReactModal__Content ReactModal__Content--after-open modal-small-white show-modal']"));
		
		WebElement signInForcouponEle = driver.findElement(By.xpath("//strong[contains(text(),'Sign in')]/parent::a[@class='mb15']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", signInForcouponEle);
		Thread.sleep(2000);
		String email = "pm2@gmail.com";
		String pw = "mnbv1234";
		WebElement username = driver.findElement(By.xpath("//input[@id='user_name']"));
		username.sendKeys(email);
	
		WebElement pwEle = driver.findElement(By.xpath("//input[@id='user_password']"));
		pwEle.sendKeys(pw);
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit_btn']"));
		submit.click();
		Thread.sleep(3000);
		
/*		ChromeOptions options = new ChromeOptions();
	    Map<String, Object> prefs = new HashMap<String, Object>();
	    prefs.put("credentials_enable_service", false);
	    prefs.put("profile.password_manager_enabled", false);
	options.setExperimentalOption("prefs", prefs);
	driver = new ChromeDriver(options);
//	driver.get("aut url");
		*/
	
	/*	WebElement joinPopupEle = driver.findElement(By.xpath("//span[contains(text(),'Close')]/parent::a"));
		if(joinPopupEle.isDisplayed()) {
	//		joinPopupEle.click();
			WebElement mywalJoinEle = driver.findElement(By.xpath("//span[contains(text(),'Join myWalgreens now')]"));
			mywalJoinEle.click();
			
			String pn ="4049331234";
			String zip ="30080";
					
			WebElement pnEle = driver.findElement(By.xpath("//input[@name='phoneno']"));
			pnEle.sendKeys(pn);
			WebElement zipEle = driver.findElement(By.xpath("//input[@id='wag-mywUser-zipcode']"));
			zipEle.sendKeys(zip);
			WebElement cbEle = driver.findElement(By.xpath("//input[@id='wag-mywterms-checkbox']"));
			cbEle.click();
			WebElement contJoinEle = driver.findElement(By.xpath("//a[@id='wag-rxuser-continue-btm']"));
			contJoinEle.click();
		}
		*/
		
		
		
		
		
	//	Membership # 7122 2933 80651,4049331234,30080
		
	/*	Set<String> window = driver.getWindowHandles();
		Iterator<String> itr = window.iterator();
		String parent1 = itr.next();
		String parent2 = itr.next();
		driver.switchTo().window(parent2);
		driver.getTitle();
		driver.close();
		Thread.sleep(4000);
		*/
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement pickupEle = driver.findElement(By.xpath("//li[@id='wag-pickup-tab']"));
		wait.until(ExpectedConditions.elementToBeClickable(pickupEle));
		
		JavascriptExecutor js7 = (JavascriptExecutor) driver;
		js7.executeScript("arguments[0].click();", pickupEle);
		
		
		//strong[contains(text(),'In stock')]
		//span[@id='check-other-stores-dialog']
		//a[@id='onChangeClick']
		//input[@id='wag-find-zip']
		//button[@id='findButtonId']
		//a[@id='storeAddress0']
		//span[contains(text(),'In stock')]
		//button[@name='pick-it-up-btn']
		//strong[contains(text(),'Select store')]
		//button[@id='receiveing-addToCartbtn']
		//a[@id='addToCart-cart-checkout']
		//div[@id='sku6322127_wag-cac-product-section']
		
		
		
	/*	
		WebElement accEle = driver.findElement(By.xpath("//a[@class='menu-trigger']"));
		accEle.click();
		Thread.sleep(2000);
		//div[@class='default-dropdown menu-dropdown']
		//a[@data-element-name='Weekly Ad & Coupons']
		//div[@class='default-dropdown menu-dropdown show']
		//li[@id='menu-weeklyad']
		//span[@class='icon icon__clip-coupon']/parent::a[@data-element-name='Weekly Ad & Coupons']
		WebElement couponEle = driver.findElement(By.xpath("//li[@id='menu-weeklyad']//*[name()='svg']/parent::span[@class='icon icon__clip-coupon']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", couponEle);
		Thread.sleep(2000);
	//	((JavascriptExecutor) driver).executeScript("document.getElementById('ID').style.display='block';");
	//	couponEle.click();
		WebElement browseCouponEle = driver.findElement(By.xpath("//span[text()='Browse Coupons']"));
		browseCouponEle.click();
		WebElement myCoupon = driver.findElement(By.xpath("//button[@id='clip2']"));
		myCoupon.click();
		Thread.sleep(2000);
		//button[@id='brSingleuserOverlayClose']
		
		WebElement signIn = driver.findElement(By.xpath("//strong[contains(text(),'Sign in')]/parent::a[@id='pf-m-sigin']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", signIn);
		Thread.sleep(2000);
		String name="punamit";
		WebElement username = driver.findElement(By.xpath("//input[@id='user_name']"));
		username.sendKeys(name);
		//input[@id='user_password']
		String pw="12345678";
		WebElement pwEle = driver.findElement(By.xpath("//input[@id='user_password']"));
		pwEle.sendKeys(pw);
		//button[@id='submit_btn']
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit_btn']"));
		submit.click();
		Thread.sleep(3000);
		
		//button[@id='create_btn']
		WebElement createAcc = driver.findElement(By.xpath("//button[@id='create_btn']"));
		createAcc.click();
		
		
		
		
	//	WebElement myProd = driver.findElement(By.xpath("//button[@id='shopBtn4']"));
		//myProd.click();
		
		
		WebElement myProdSearch = driver.findElement(By.xpath("//input[@id='ntt-placeholder']"));
		myProdSearch.sendKeys(myProdSrch);
		*/
	}
}