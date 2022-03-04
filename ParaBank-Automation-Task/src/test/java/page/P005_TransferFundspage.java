package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.CommonMethods;

public class P005_TransferFundspage extends CommonMethods {
	
//	Tranasfer Funds 
	 public static By tranasferFundClick = By.xpath("//a[normalize-space()='Transfer Funds']");
	
	 public static By amountFillUp = By.xpath("//input[@id='amount']");
	 public static By fromAccountSelect = By.xpath("//select[@id='fromAccountId']");
	 public static By toAccountSelect = By.xpath("//select[@id='toAccountId']");
	 public static By submitAccount = By.xpath("//input[@value='Transfer']");
	 
	 
	 
	 
		
//		Tranasfer Funds
		
		public void clickTranasferFund () {
			
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(tranasferFundClick));
			
			driver.findElement(tranasferFundClick).click();
			driver.findElement(tranasferFundClick).click();
		}
		
		public void amountSend (String amount) {
			
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(amountFillUp));
			sendText(amountFillUp, amount);
		}
		
		public void fromAccount(int value) {   
			
		
			selectValue(fromAccountSelect, value);
		}
		
		public void toAccount(int value) {
			selectValue(toAccountSelect, value);
		}
		
		public void submitAccountTranasfer() {
			driver.findElement(submitAccount).click();
		}
		

}
