package pom.facebook.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.HomePage;

import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers {
	
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC007";
		testCaseDescription="To verify new user registration for the facebook";
		author="Brenese";
		category="smoke";
		browserName="chrome";
		url="https://www.facebook.com";
		sheetName="TC007";
		
	}
	@Test(dataProvider = "fetchdata1")

	public void facebooksignup(String firstname,String lastname,String reg_email,String reg_email_confirmation,String reg_passwd,String day,String month,String year,String gender)
	{
		new HomePage()
		
		.clickCreateNewAccount()
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.enterEmailAddress(reg_email)
		.enterReEmailAddress(reg_email_confirmation)
		.enterPassword(reg_passwd)
		.selectDay(day)
		.selectMonth(month)
		.selectYear(year)
		.chooseOnGender(gender)
		;
	}
}
