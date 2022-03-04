package page;

import org.openqa.selenium.By;

import utilities.CommonMethods;

public class P006_FindTransactionpage extends CommonMethods {

//	Find Transactions link
	 public static By findTransactionClick = By.xpath("//a[normalize-space()='Find Transactions']");
	 
	 // Select an Account 
	 public static By selectAnAccount = By.xpath("//select[@id='accountId']");
	 
	
	// Find By Transaction Id
	 public static By transactionId = By.xpath("//input[@id='criteria.transactionId']");
	 public static By findTransactionId = By.xpath("//button[@ng-click=\"criteria.searchType = 'ID'\"]");
	 
	 // Find by Date:
	 	 
	 public static By transactionDate = By.xpath("//input[@id='criteria.onDate']");   // MM-DD-YYYY)
	 public static By findTransactionDate = By.xpath("//button[@ng-click=\"criteria.searchType = 'DATE'\"]");
	 
	 // Find by Date Range:
 	 
	 public static By transactionDateRangeFrom= By.xpath("//input[@id='criteria.fromDate']");   // MM-DD-YYYY)
	 public static By transactionDateRangeTo = By.xpath("//input[@id='criteria.toDate']");
	 	 
	 public static By findTransactionDateRange = By.xpath("//button[@ng-click=\"criteria.searchType = 'DATE_RANGE'\"]");   // MM-DD-YYYY)

	 // Find by Amount
 	 
	 public static By transactionAmount = By.xpath("//input[@id='criteria.amount']");   
	 public static By findTransactionAmount = By.xpath("//button[@ng-click=\"criteria.searchType = 'AMOUNT'\"]");
	 
		// Find By Transaction Id Method
	 public void findTransactionById(int value, String TransactionId) {
		 driver.findElement(findTransactionClick).click();
		 selectValue(selectAnAccount, value ); 
		 sendText(transactionId, TransactionId);
		 driver.findElement(findTransactionId).click();
	 }
	 
	 
		// Find By Transaction Date Method
	 public void findTransactionByDate(int value, String TransactionDate) {
		 driver.findElement(findTransactionClick).click();
		 selectValue(selectAnAccount, value ); 
		 sendText(transactionDate, TransactionDate);
		 driver.findElement(findTransactionDate).click();
	 }
	 
	 
		// Find By Transaction Date Range Method
	 public void findTransactionByDateRange(int value, String TransactionDateFrom, String TransactionDateTo) {
		 driver.findElement(findTransactionClick).click();
		 selectValue(selectAnAccount, value ); 
		 sendText(transactionDateRangeFrom, TransactionDateFrom);
		 sendText(transactionDateRangeTo, TransactionDateTo);
		 driver.findElement(findTransactionDateRange).click();
	 }
	
		// Find By Transaction Amount Method
	 public void findTransactionByAmount(int value, String TransactionAmount) {
		 driver.findElement(findTransactionClick).click();
		 selectValue(selectAnAccount, value ); 
		 sendText(transactionAmount, TransactionAmount);
		 driver.findElement(findTransactionAmount).click();
	 }
	 
	
}
