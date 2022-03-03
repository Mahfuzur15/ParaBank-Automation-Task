package page;

import org.openqa.selenium.By;

import model.CommonMethods;

public class P003_LogInpage extends CommonMethods{

	// Login Username & Password
	public static By userName = By.xpath("//input[@name='username']");
	public static By password = By.xpath("//input[@name='password']");
	
	
	public void logIn (String username, String pass) {
		sendText(userName, username);
		sendText(password, pass);
	}
	
}
