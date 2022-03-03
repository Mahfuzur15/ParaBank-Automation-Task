package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {
	
	static WebDriver driver;


	

	
	


	
	
// 	Open New another Account
	public static By openAccountClick = By.xpath("//a[normalize-space()='Open New Account']");
	
	public static By accountTypeSelect = By.xpath("//select[@id='type']");
	public static By newAccountClick = By.xpath("//input[@value='Open New Account']");
	
	
// Account Overview
	
	public static By accountOverviewClick = By.xpath("//a[normalize-space()='Accounts Overview']");
	
	public static By accountOverviewTableRow = By.xpath("//*[@id=\"accountTable\"]/tbody/tr");
	public static By accountOverviewTableColumn = By.xpath("//*[@id=\"accountTable\"]/thead/tr/th");
	
	
	
	
//	Tranasfer Funds 
	 public static By tranasferFundclick = By.xpath("//a[normalize-space()='Transfer Funds']");
	
	 public static By amountFillUp = By.xpath("//input[@id='amount']");
	 public static By fromAccountSelect = By.xpath("//select[@id='fromAccountId']");
	 public static By toAccountSelect = By.xpath("//select[@id='toAccountId']");
	 public static By submitAccount = By.xpath("//input[@value='Transfer']");
		
	

	
	 
		// Update Contact info , taken some field
	 public static By updateInfoClick = By.xpath("//a[normalize-space()='Update Contact Info']");
	 public static By updateAddress = By.xpath("//input[@id='customer.address.street']");
	 public static By updatePhone = By.xpath("//input[@id='customer.phoneNumber']");
	 public static By updateProfileBtn = By.xpath("//input[@value='Update Profile']");
		 
	 


	 

}
