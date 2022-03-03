package page;

import org.openqa.selenium.By;

import model.CommonMethods;


public class P001_Homepage extends CommonMethods{
	
	
	// Link Click
	static By registerClick = By.xpath("//a[normalize-space()='Register']");

	// Button Click
	public static By loginBtn = By.xpath("//input[@value='Log In']");
	public static By registerBtnClick = By.xpath("//input[@value='Register']");
	
	public void registerclick() {
		driver.findElement(registerClick).click();
	}

}
