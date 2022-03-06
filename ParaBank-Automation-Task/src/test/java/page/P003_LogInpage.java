package page;

import org.openqa.selenium.By;

import utilities.CommonMethods;

public class P003_LogInpage extends CommonMethods{

	
	public static By userName = By.xpath("//input[@name='username']");
	public static By password = By.xpath("//input[@name='password']");
	// Click Login Button
	public static By clicklogin = By.xpath("//input[@value='Log In']");
	
	// Login Username & Password
	public void logIn (String username, String pass) {
		sendText(userName, username);
		sendText(password, pass);
		driver.findElement(clicklogin).click();
	}
	
}
