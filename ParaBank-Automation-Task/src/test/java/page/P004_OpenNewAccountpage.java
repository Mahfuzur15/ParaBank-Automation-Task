package page;

import org.openqa.selenium.By;

import utilities.CommonMethods;

public class P004_OpenNewAccountpage extends CommonMethods{
	

	public static By openAccountClick = By.xpath("//a[normalize-space()='Open New Account']");
	
	public static By accountTypeSelect = By.xpath("//select[@id='type']");
	public static By openAccountSubmit = By.xpath("//input[@value='Open New Account']");
	

// 	Open New Account
	public void accountTypeByIndex(int value) {
		driver.findElement(openAccountClick).click();
		selectValue(accountTypeSelect, value);
	}
	
	public void accountSubmitClick() {
		driver.findElement(openAccountSubmit).click();
	}

}
