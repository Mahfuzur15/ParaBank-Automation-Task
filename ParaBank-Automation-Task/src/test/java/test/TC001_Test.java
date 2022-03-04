package test;

import org.testng.annotations.Test;

import driverpackage.BaseDriver;

import page.P001_Homepage;
import page.P002_Registerpage;
import page.P003_LogInpage;
import page.P004_OpenNewAccountpage;
import page.P005_TransferFundspage;
import page.P006_FindTransactionpage;

public class TC001_Test extends BaseDriver{
	
	P001_Homepage page = new P001_Homepage();
	P002_Registerpage page2 = new P002_Registerpage();
	P003_LogInpage page3 = new P003_LogInpage();
	P004_OpenNewAccountpage page4 = new P004_OpenNewAccountpage();
	P005_TransferFundspage page5 = new P005_TransferFundspage();
	P006_FindTransactionpage page6 = new P006_FindTransactionpage();
	@Test
	public void test1 () {
		System.out.println(page.getTitle());
		System.out.println(page.currentPageUrl());
		page.registerclick();
		
		
//		page2.registerAccount("Mahfuz", "Tushar", "College road, Chowmuhani", "Noakhali", "Chittagong", "1206", "0161179", "454-354", "tu66", "12345", "12345");
		
		System.out.println(page2.getTitle());
		System.out.println(page2.currentPageUrl());
		
		page.registerclick();
		
//		page2.registerAccount("Arif", "Rahman", "Doctor para, Chowmuhani", "Munsigonj", "Dhaka", "1208", "0192365", "33-564", "ar68", "1234", "1234");
		
		System.out.println(page3.getTitle());
		System.out.println(page3.currentPageUrl());
		
		page3.logIn("ar68", "1234");
		
		page4.accountTypeByIndex(0);
		page4.accountSubmitClick();
		
		page4.accountTypeByIndex(1);
		
		page4.accountSubmitClick();
		page4.accountTypeByIndex(0);
		page4.accountSubmitClick();
		
		// transfer fund
		
		page5.clickTranasferFund();
		page5.amountSend("30");
		page5.fromAccount(0);
		page5.toAccount(1);
		page5.submitAccountTranasfer();
	
		
		// Find Transactions 
		page6.findTransactionById(0, "233456");
		
		
		
		
		
	}
	
	
	
		
	

}
