package page;

import org.openqa.selenium.By;
import utilities.CommonMethods;

public class P005_TransferFundspage extends CommonMethods {
	
	 public static By tranasferFundClick = By.xpath("//a[normalize-space()='Transfer Funds']");
	
	 public static By amountFillUp = By.xpath("//input[@id='amount']");
	 public static By fromAccountSelect = By.xpath("//select[@id='fromAccountId']");
	 public static By toAccountSelect = By.xpath("//select[@id='toAccountId']");
	 public static By submitAccount = By.xpath("//input[@value='Transfer']");
	 
	 
	 
	 
		
//		Tranasfer Funds
		
		public void clickTranasferFund () {
			
			driver.findElement(tranasferFundClick).click();
		}
		
		public void amountSend (String amount) {
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
