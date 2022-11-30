package webdriverUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDriverUtils {
	
	public static WebDriver driver; 
	//Create a getDriver method to return a Webdriver instance for accessing the same webdriver for all step definition file
	public static WebDriver getDriver() { 
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
		return driver;
		
	}

}
