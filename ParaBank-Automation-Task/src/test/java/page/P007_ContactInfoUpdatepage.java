package page;

import org.openqa.selenium.By;

import utilities.CommonMethods;
import utilities.Timeout;

public class P007_ContactInfoUpdatepage extends CommonMethods {
	
	Timeout time = new Timeout();
	//  Registration Account
		public static By updateFName = By.xpath("//input[@id='customer.firstName']");
		public static By updateLName = By.xpath("//input[@id='customer.lastName']");
		public static By updateAddress = By.xpath("//input[@id='customer.address.street']");
		public static By updateCity = By.xpath("//input[@id='customer.address.city']");
		public static By updateState = By.xpath("//input[@id='customer.address.state']");
		public static By updateZipCode = By.xpath("//input[@id='customer.address.zipCode']");
	
		 public static By updatePhone = By.xpath("//input[@id='customer.phoneNumber']");
		 public static By updateProfileBtn = By.xpath("//input[@value='Update Profile']");


			// Update Contact info , taken some field
		 public static By updateInfoClick = By.xpath("//a[normalize-space()='Update Contact Info']");

		 public void updateAccountClick () {
			 driver.findElement(updateInfoClick).click();
		 }
		 
			public void updateAccount(String value1) {			
				sendText(updatePhone, value1);
				driver.findElement(updateProfileBtn).click();		
			}
			
	 
}
