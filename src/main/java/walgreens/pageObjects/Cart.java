package walgreens.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	
WebDriver driver;
	
	public Cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	} 
	

}
