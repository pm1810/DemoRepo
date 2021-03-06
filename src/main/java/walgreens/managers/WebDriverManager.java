package walgreens.managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {
	
	public static WebDriver open(String browserType) {
		if (browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\punam\\OneDrive\\Desktop\\Webdrivers\\chromedriver.exe");
			return new ChromeDriver();
		} else if (browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver",
					"C:\\Users\\punam\\OneDrive\\Desktop\\Webdrivers\\geckodriver.exe");
			return new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\punam\\OneDrive\\Desktop\\Webdrivers\\chromedriver.exe");
			return new ChromeDriver();
		}

	}

	/*
	 * static WebDriver driver = null;
	 * 
	 * public static WebDriver getDriver() {
	 * 
	 * if(driver == null) { System.out.println("Creating driver");
	 * System.setProperty("webdriver.chrome.driver",
	 * "../AutomationBestBuy/driver/chromedriver.exe"); ChromeOptions options = new
	 * ChromeOptions(); options.addArguments("start-maximized"); // open Brows er in
	 * maximized mode options.addArguments("disable-infobars"); // disabling
	 * infobars options.addArguments("--disable-extensions"); // disabling
	 * extensions options.addArguments("--disable-gpu"); // applicable to windows os
	 * only options.addArguments("--disable-dev-shm-usage"); // overcome limited
	 * resource problems options.addArguments("--no-sandbox"); // Bypass OS security
	 * model driver = new ChromeDriver(options); }
	 * 
	 * return driver; }
	 */

	private WebDriver driver;
//	private String driverType = "CHROME";
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	String chromeDriverPath = null;

	private String driverpath() {

		String filepath = null;
		String str = System.getProperty("user.dir");
		filepath = str + "/src/test/resources/drivers/chromedriver.exe";
		return filepath;
	}

	public WebDriver getDriver() {
		if (driver == null)
			driver = createDriver();
		return driver;
	}

	private WebDriver createDriver() {
		driver = createLocalDriver();
		return driver;
	}

	private WebDriver createLocalDriver() {
		chromeDriverPath = driverpath();
		System.setProperty(CHROME_DRIVER_PROPERTY, chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public void closeDriver() {
		driver.close();
		driver.quit();
	}


}
