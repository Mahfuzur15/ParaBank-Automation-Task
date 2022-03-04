package page;

import org.openqa.selenium.By;

public class P007_ContactInfoUpdatepage {
	
	 
		// Update Contact info , taken some field
	 public static By updateInfoClick = By.xpath("//a[normalize-space()='Update Contact Info']");
	 public static By updateAddress = By.xpath("//input[@id='customer.address.street']");
	 public static By updatePhone = By.xpath("//input[@id='customer.phoneNumber']");
	 public static By updateProfileBtn = By.xpath("//input[@value='Update Profile']");
	 
	 
	 // Log Out
	 public static By logout = By.xpath("//a[normalize-space()='Log Out']");

}
