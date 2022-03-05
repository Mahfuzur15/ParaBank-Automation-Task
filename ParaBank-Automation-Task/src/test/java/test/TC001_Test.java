package test;

import org.testng.annotations.Test;

import driverpackage.BaseDriver;

import page.P001_Homepage;
import page.P002_Registerpage;
import page.P003_LogInpage;
import page.P004_OpenNewAccountpage;
import page.P005_TransferFundspage;
import page.P006_FindTransactionpage;
import page.P007_ContactInfoUpdatepage;
import utilities.Timeout;

public class TC001_Test extends BaseDriver{
	
	P001_Homepage homePage = new P001_Homepage();
	P002_Registerpage registerPage = new P002_Registerpage();
	P003_LogInpage loginPage = new P003_LogInpage();
	P004_OpenNewAccountpage openNewAccountPage = new P004_OpenNewAccountpage();
	P005_TransferFundspage transferFundPage = new P005_TransferFundspage();
	P006_FindTransactionpage findTransactionPage = new P006_FindTransactionpage();
	P007_ContactInfoUpdatepage contactInfoUpdatePage = new P007_ContactInfoUpdatepage();
	Timeout time = new Timeout();
	@Test
	public void test1 () {
		System.out.println(homePage.getTitle());
		System.out.println(homePage.currentPageUrl());
		homePage.registerclick();
		
		
//		registerPage.registerAccount("Mahfuz", "Tushar", "College road, Chowmuhani", "Noakhali", "Chittagong", "1206", "0161179", "454-354", "tu66", "12345", "12345");
		
		System.out.println(registerPage.getTitle());
		System.out.println(registerPage.currentPageUrl());
		
//		homePage.registerclick();
		
//		registerPage.registerAccount("Arif", "Rahman", "Doctor para, Chowmuhani", "Munsigonj", "Dhaka", "1208", "0192365", "33-564", "ar68", "1234", "1234");
		
		System.out.println(loginPage.getTitle());
		System.out.println(loginPage.currentPageUrl());
		
		loginPage.logIn("ar68", "1234");
		
		
		// Open New Account
		openNewAccountPage.accountTypeByIndex(0);
		openNewAccountPage.accountSubmitClick();
		
		openNewAccountPage.accountTypeByIndex(1);
		
		openNewAccountPage.accountSubmitClick();
		openNewAccountPage.accountTypeByIndex(0);
		openNewAccountPage.accountSubmitClick();
		
		// transfer fund
		
		transferFundPage.clickTranasferFund();
		time.timeout();
		transferFundPage.amountSend("30");
		time.timeout();
		transferFundPage.fromAccount(0);
		transferFundPage.toAccount(1);
		transferFundPage.submitAccountTranasfer();
	
		
		// Find Transactions 
		findTransactionPage.findTransactionById(0, "233456");
		findTransactionPage.findTransactionByDate(0, "03-05-2022");
		
		
	
		time.timeout();
		contactInfoUpdatePage.updateAccountClick();
		time.timeout();
		contactInfoUpdatePage.updateAccount("798161");
		
	}
	
	
	
		
	

}
