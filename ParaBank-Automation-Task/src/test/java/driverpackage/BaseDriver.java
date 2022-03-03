package driverpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {

public static WebDriver driver;

public static String bankHomePageUrl = "https://parabank.parasoft.com/parabank/index.htm";
	
	@BeforeSuite
	public WebDriver setup() {
	
		WebDriverManager.chromedriver().setup();
		
		//Starting Maximize Window
	
		ChromeOptions coptions = new ChromeOptions();
		coptions.addArguments("--start-maximized");

		
		driver = new ChromeDriver(coptions);
		
		driver.get(bankHomePageUrl);
		
		return driver;
		
	}

//	@AfterSuite
//	public void tearDown() {
//		driver.quit();
//		
//	}	
//	
}
