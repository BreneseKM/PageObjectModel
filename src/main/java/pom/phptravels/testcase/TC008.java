package pom.phptravels.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravel.pages.PhpRegPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC008";
		testCaseDescription="To verify new user registration for PHPTravels";
		author="Brenese";
		category="smoke";
		browserName="chrome";
		url="http://www.phptravels.org/register.php";
		sheetName="TC008";
		
	}
	@Test(dataProvider = "fetchdata1")
	
	public void phptravelsReg(String inputFirstName,String inputLastName,String inputEmail,String inputPhone,String inputCompanyName,String inputAddress1,String inputAddress2,String inputCity,String inputPostcode,String inputCountry,String stateselect,String customfield2,String inputNewPassword1,String inputNewPassword2)
	{
		new PhpRegPage()
		
		.enterFirstName(inputFirstName)
		.enterLastName(inputLastName)
		.enterEmailAddress(inputEmail)
		.clickCountryCode()
		.chooseCountryCode()
		.enterPhoneNo(inputPhone)
		.enterCompanyName(inputCompanyName)
		.enterStreetAddress(inputAddress1)
		.enterStreetAddress2(inputAddress2)
		.enterCity(inputCity)
		.enterState(stateselect)
		.enterPostCode(inputPostcode)
		.selectCountry(inputCountry)
		.enterMobileNo(customfield2)
		.enterPassword(inputNewPassword1)
		.enterConfirmPassword(inputNewPassword2)
		.clickNoJoinMailList()
		;
	}

}
