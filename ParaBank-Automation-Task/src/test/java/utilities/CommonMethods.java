package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import driverpackage.BaseDriver;

public class CommonMethods extends BaseDriver {

	// Get Current Page URL

	public String currentPageUrl() {
		return driver.getCurrentUrl();
	}

	// Get Current Page Title

	public String getTitle() {
		return driver.getTitle();
	}

//	  Input text send field 

	public void sendText(By element, String value) {
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(value);
	}

	// Select a value

	public void selectValue(By btn, int value) {
		Select select = new Select(driver.findElement(btn));
//		type.selectByVisibleText(value);
//		type.selectByValue(value); 
		select.selectByIndex(value);
	}

}
