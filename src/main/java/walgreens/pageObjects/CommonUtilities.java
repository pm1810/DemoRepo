package walgreens.pageObjects;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtilities {
	// wait;
	WebDriver driver;

	public CommonUtilities(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	

	/*
	 * WebElement element = driver.findElement(locator); Actions action1 = new
	 * Actions(driver); action1.movetoElement(element).click().perform();
	 * action1.SendKeys(Keys.Enter));
	 */
	public void jsClick(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}

	public void jsSendkeys( WebElement ele, String name) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + name + "';", ele);
	}

	public void jsScrollnClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		js.executeScript("arguments[0].click();", ele);
	}

	public String getproperties(String prop) throws IOException { 
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\punam\\eclipse-workspace\\Walgreens\\src\\test\\resources\\configs\\TestConfiguration.properties");
		Properties props = new Properties();
		props.load(fis);
		String value = props.getProperty(prop);
		String url = null;
		if (prop.equals(url)) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return value;
	}

	public void flWait(WebDriver driver, WebElement ele) {
	/*	Wait<WebDriver>	wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		System.out.println("i waited");
	*/
		WebDriverWait wait = new WebDriverWait(driver , 20);
		ele = wait.until(ExpectedConditions.visibilityOf(ele));
		
	}

}
