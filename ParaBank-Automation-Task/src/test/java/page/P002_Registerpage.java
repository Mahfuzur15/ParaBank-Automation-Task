package page;

import org.openqa.selenium.By;

import utilities.CommonMethods;

public class P002_Registerpage extends CommonMethods {
	
//  Registration Account
	public static By fName = By.xpath("//input[@id='customer.firstName']");
	public static By lName = By.xpath("//input[@id='customer.lastName']");
	public static By address = By.xpath("//input[@id='customer.address.street']");
	public static By city = By.xpath("//input[@id='customer.address.city']");
	public static By state = By.xpath("//input[@id='customer.address.state']");
	public static By zipCode = By.xpath("//input[@id='customer.address.zipCode']");
	public static By phone = By.xpath("//input[@id='customer.phoneNumber']");
	public static By ssn = By.xpath("//input[@id='customer.ssn']");
	public static By uName = By.xpath("//input[@id='customer.username']");
	public static By pass = By.xpath("//input[@id='customer.password']");
	public static By cPass = By.xpath("//input[@id='repeatedPassword']");
	
	public static By registerBtnClick = By.xpath("//input[@value='Register']");
	
	 
	 
	 // Log Out
	 public static By logOut = By.xpath("//a[normalize-space()='Log Out']");
	
	// Register

	public void registerAccount(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11 ) {
		sendText(fName, value1);
		sendText(lName, value2);
		sendText(address, value3);
		sendText(city, value4);
		sendText(state, value5);
		
		sendText(zipCode, value6);
		sendText(phone, value7);
		sendText(ssn, value8);
		sendText(uName, value9);
		
		sendText(pass, value10);
		sendText(cPass, value11);	
		
		registerBtnClick();
		logOut();
}
	
	// Register Button Click
	public void registerBtnClick() {
		driver.findElement(registerBtnClick).click();
	}
	
	public void logOut() {
		driver.findElement(logOut).click();
	}
	

}
