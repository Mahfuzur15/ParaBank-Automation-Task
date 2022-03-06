package test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import driverpackage.BaseDriver;

import page.P001_Homepage;
import page.P002_Registerpage;
import page.P003_LogInpage;
import page.P004_OpenNewAccountpage;
import page.P005_TransferFundspage;
import page.P006_FindTransactionpage;
import page.P007_ContactInfoUpdatepage;
import utilities.Timeout;

public class TC001_Test extends BaseDriver {

	P001_Homepage homePage = new P001_Homepage();
	P002_Registerpage registerPage = new P002_Registerpage();
	P003_LogInpage loginPage = new P003_LogInpage();
	P004_OpenNewAccountpage openNewAccountPage = new P004_OpenNewAccountpage();
	P005_TransferFundspage transferFundPage = new P005_TransferFundspage();
	P006_FindTransactionpage findTransactionPage = new P006_FindTransactionpage();
	P007_ContactInfoUpdatepage contactInfoUpdatePage = new P007_ContactInfoUpdatepage();
	Timeout time = new Timeout();
	SoftAssert softassert = new SoftAssert();

	static String actual, expected, titleMessage;

	@Test(priority = 0)
	public void registrationTest() {

		// Account Registration
		// First Account Registration
		homePage.registerclick();
		registerPage.registerAccount("Mahfuz", "Tushar", "College road, Chowmuhani", "Noakhali", "Chittagong", "1206",
				"0161179", "454-354", "tush68", "12345", "12345");

		// Second Account Registration
		homePage.registerclick();
		// Registration Page Title Get
		actual = homePage.getTitle();
		registerPage.registerAccount("Arif", "Rahman", "Doctor para, Chowmuhani", "Munsigonj", "Dhaka", "1208",
				"0192365", "33-564", "ariff68", "1234", "1234");

		expected = "ParaBank | Register for Free Online Account Access";
		titleMessage = "Homepage Title Assertion Failed";

		softassert.assertEquals(actual, expected, titleMessage);

		softassert.assertAll();

	}

	@Test(priority = 1)
	public void logInTest() {
		// Login Page Title Get
		actual = loginPage.getTitle();
		// Login an Account
		loginPage.logIn("ari56", "1234");

		// Assertion
		expected = "ParaBank | Welcome | Online Banking";
		titleMessage = "LogIn page Title Assertion Failed";

		softassert.assertEquals(actual, expected, titleMessage);

		softassert.assertAll();
	}

	@Test(priority = 2)
	public void openNewAccountTest() {
		// Open New Account
		// Checking
		openNewAccountPage.accountTypeByIndex(0); // select account type
		openNewAccountPage.accountSubmitClick();
		// Savings Account
		openNewAccountPage.accountTypeByIndex(1);
		openNewAccountPage.accountSubmitClick();
		// Savings Account
		openNewAccountPage.accountTypeByIndex(1);
		openNewAccountPage.accountSubmitClick();
	}

	@Test(priority = 3)
	public void tranasferFundTest() {

		// transfer fund
		time.timeout(1500);
		transferFundPage.clickTranasferFund();
		time.timeout(2000);
		transferFundPage.amountSend("30");
		time.timeout(2000);
		// From Account
		transferFundPage.fromAccount(0);
		// Received Account
		transferFundPage.toAccount(1);

		transferFundPage.submitAccountTranasfer();
	}

	@Test(priority = 4)
	public void findTransactionTest() {

		// Find Transactions
		// Find Transactions By Id
		findTransactionPage.findTransactionById(0, "15808");

		// Find Transactions By Date
		findTransactionPage.findTransactionByDate(0, "03-05-2022"); // MM-DD-YYYY

		// Find Transactions By Date Range
		findTransactionPage.findTransactionByDateRange(0, "02-05-2022", "03-05-2022");

		// Find Transactions By Amount
		findTransactionPage.findTransactionByAmount(0, "100");
	}

	@Test(priority = 5)
	public void infoUpdateTest() {

		// Contact Info Update
		time.timeout(1500);
		contactInfoUpdatePage.updateAccountClick();
		time.timeout(2000);
		// Only Phone Number Update
		contactInfoUpdatePage.updateAccount("01611");
	}

}
