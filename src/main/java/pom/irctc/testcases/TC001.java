package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.Homepage;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	

	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC001";
		testCaseDescription="To verify new user registration for the IRCTC";
		author="Brenese";
		category="Regression";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC001";
		
	}
	
	@Test(dataProvider = "fetchdata1")
	
	public void irctceRegistration(String userName,String usrPwd,String cnfUsrPwd,String se,String firstName,String middleName,String lastname,String ye,String mon,String dat,String coun,String email,String mobile,String co,String resAddress1,String resAddress2,String resAddress3,String resPinCode,String resState,String city,String po,String resPhone,String offAddress1,String offAddress2,String offAddress3,String offPinCode,String offState,String ci,String pos,String offPhone) {
		
	new Homepage()
	.clickOnRegister()
	.enterUserName(userName)
	.enterPassword(usrPwd)
	.enterConfirmPassword(cnfUsrPwd)
	.clickPreferredLanguage()	
	.ClickOnchooseLanguage()
	.clickSecurityQuestion()
	.ClickOnchooseSecurityQuestion()
	.enterSecurityAnswer(se)
	.clickContinue()
	.enterFirstName(firstName)
	.enterMiddleName(middleName)
	.enterLastName(lastname)
	.clickOccupation()
	.clickOnselectOccupation()
	.clickDateofBirth()
	.selectYear(ye)
	.selectMonth(mon)
	.clickDate(dat)
	.clickUnmarried()
	.clickMale()
	.selectCountry(coun)
	.enterEmail(email)
	.enterMobileNo(mobile)
	.enterNationality(co)
	.clickonContinue()
	.enterDoorNo(resAddress1)
	.enterStreet(resAddress2)
	.enterArea(resAddress3)
	.enterPincode(resPinCode)
	.enterState(resState)
	.selectCity(city)
	.selectPostoffice(po)
	.enterPhone(resPhone)
	.clickCopyOfficeAddressNo()
	.enterOfficeFlatNo(offAddress1)
	.enterOfficeStreet(offAddress2)
	.enterOfficeArea(offAddress3)
	.enterOfficePinCode(offPinCode)
	.enterOfficeState(offState)
	.selectOfficeCity(ci)
	.selectOfficePost(pos)
	.enterOfficephone(offPhone)
	//.clickTermAndConditions()
	
	;
		
		
		
	}

}
