package driverpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {

public static WebDriver driver;

public static String bankHomePageUrl = "https://parabank.parasoft.com/parabank/index.htm";
	
	@BeforeSuite

	public WebDriver setup() throws Exception {
	
		String browser = "chrome";
		
		//Check if it is 'firefox'
		if(browser.equalsIgnoreCase("firefox")){
		//create firefox 
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
	
		}
		//Check if it is 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
		//set path to chrome
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		
		}
		//Check if it is 'Edge'
		else if(browser.equalsIgnoreCase("Edge")){
		//set path to Edge
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
	
		}
		else{
		//If no browser is passed throw exception
		throw new Exception("Incorrect Browser");
		}
	

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Starting Maximize Window	
		driver.manage().window().maximize();
		driver.get(bankHomePageUrl);
		return driver;
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
		
	}	
	
}
