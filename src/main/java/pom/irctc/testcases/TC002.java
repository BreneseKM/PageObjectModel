package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.Homepage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC002";
		testCaseDescription="To verify SignUp for BookYourCoach";
		author="Brenese";
		category="smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC002";
		
	}
	@Test(dataProvider = "fetchdata1")
	
	public void BookYourCoach(String Id ,String pass,String confpass,String secques,String Secans,String year,String mon,String date,String email,String occ,String fname,String mname,String lname,String natinality,String flatNo,String street,String area,String country,String mobile,String pincode,String city,String state,String postOffice,String flatNoOffice,String streetOffice,String areaOffice,String countryOffice,String mobileOffice,String pincodeOffice,String cityOffice,String postOfficeOffice) {
		
	
		new Homepage()
		
		.mouseHoverHolidays()
		.mouseHoverStays()
		.clickOnLounge()
		.switchTolastWindow()
		.clickOnMenuIcon()
		.clickOnBookYourCoach()
		.switchTolastWindow()
		.clickSignUp()
		.enterUserID(Id)
		.enterPassword(pass)
		.enterConfirmPassword(confpass)
		.selectSecurityQuestion(secques)
		.enterSecurityAnswer(Secans)
		.clickDateOfBirth()
		.selectYear(year)
		.selectMonth(mon)
		.clickDate(date)
		.clickMale()
		.clickUnmarried()
		.enterEmailId(email)
		.selectOccupation(occ)
		.enterFirstName(fname)
		.enterMiddleName(mname)
		.enterLastName(lname)
	    .selectNationality(natinality)
	    .enterFlatNo(flatNo)
	    .enterStreet(street)
	    .enterArea(area)
	    .selectCountry(country)
	    .enterMobileNo(mobile)
	    .enterPinCode(pincode)
	    .pageDown()
	    .selectCity(city)
	    .selectState(state)
	    .selectPostOffice(postOffice)
	    .clickNoSameAddress()
	    .enterOfficeFlatNo(flatNoOffice)
	    .enterOfficeStreet(streetOffice)
	    .enterOfficeArea(areaOffice)
	    .selectOfficeCountry(countryOffice)
	    .enterOfficeMobile(mobileOffice)
	    .enterOfficePinCode(pincodeOffice)
	    .pageDown()
	    .selectOfficeCity(cityOffice)
	    .selectOfficePost(postOfficeOffice)
		;
		
		
		
		
		
		
		
	}

}
