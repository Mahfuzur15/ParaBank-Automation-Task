package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utilities.CommonMethods;

public class P004_OpenNewAccountpage extends CommonMethods{
	
// 	Open New another Accountl
	public static By openAccountClick = By.xpath("//a[normalize-space()='Open New Account']");
	
	public static By accountTypeSelect = By.xpath("//select[@id='type']");
	public static By openAccountSubmit = By.xpath("//input[@value='Open New Account']");
	

	
	public void accountTypeByIndex(int value) {
		driver.findElement(openAccountClick).click();
		selectValue(accountTypeSelect, value);
	}
	
	public void accountSubmitClick() {
		driver.findElement(openAccountSubmit).click();
	}

}
