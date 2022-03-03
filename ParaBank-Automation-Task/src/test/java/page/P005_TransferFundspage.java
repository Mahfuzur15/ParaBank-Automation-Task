package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import model.CommonMethods;

public class P005_TransferFundspage extends CommonMethods {
	
//	Tranasfer Funds 
	 public static By tranasferFundclick = By.xpath("//a[normalize-space()='Transfer Funds']");
	
	 public static By amountFillUp = By.xpath("//input[@id='amount']");
	 public static By fromAccountSelect = By.xpath("//select[@id='fromAccountId']");
	 public static By toAccountSelect = By.xpath("//select[@id='toAccountId']");
	 public static By submitAccount = By.xpath("//input[@value='Transfer']");
	 
	 
	 
	 
		
//		Tranasfer Funds
		
		public void clickTranasferFund (By element) {
			driver.findElement(element).click();
		}
		
		public void amountSend (By element, String amount) {
			driver.findElement(element).sendKeys(amount);
		}
		
		public void fromAccount(int value) {   // by er poriborte Webelement likhci
			
			selectValue(tranasferFundclick, value);
		}
		
		public void toAccount(By btn, int value) {
			selectValue(tranasferFundclick, value);
		}
		
		public void submitAccountTranasfer(By btn) {
			driver.findElement(btn).click();
		}


}
