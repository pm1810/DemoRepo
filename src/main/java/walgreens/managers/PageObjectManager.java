package walgreens.managers;

import org.openqa.selenium.WebDriver;

import walgreens.pageObjects.Cart;
import walgreens.pageObjects.CommonUtilities;
import walgreens.pageObjects.SearchProduct;
import walgreens.pageObjects.SelectProductDetails;

public class PageObjectManager {

	private WebDriver driver;
	private SearchProduct searchprodPage;
	private SelectProductDetails selectproddetailsPage;
	private Cart cartPage;
	private CommonUtilities commonUtilitiespage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public SearchProduct getsearchprod(){
		return (searchprodPage == null) ? searchprodPage = new SearchProduct(driver): searchprodPage;
		
	}
	
	public SelectProductDetails getselectproddet(){
		return (selectproddetailsPage == null) ? selectproddetailsPage = new SelectProductDetails(driver): selectproddetailsPage;
		
	}
	
	public Cart getCart(){
		return (cartPage == null) ? cartPage = new Cart(driver): cartPage;
		
	}

	public CommonUtilities getcommonutilities(){
		return (commonUtilitiespage == null) ? commonUtilitiespage = new CommonUtilities(driver): commonUtilitiespage;
		
	}
	

}
