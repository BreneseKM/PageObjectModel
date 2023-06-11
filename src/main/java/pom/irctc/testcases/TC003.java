package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.Homepage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC003";
		testCaseDescription="To verify EnquiryForm for Character";
		author="Brenese";
		category="smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC003";
		
	}
	@Test(dataProvider = "fetchdata1")
	
	public void Character(String name,String organization,String address,String mobile,String email,String requestFor,String originStation,String destnStation,String durationPeriod,String coachDetails,String numPassenger,String charterPurpose,String services)
	{
		new Homepage()
		
		.mouseHoverHolidays()
		.mouseHoverStays()
		.clickOnLounge()
		.switchTolastWindow()
		.clickOnMenuIcon()
		.clickOnCharter()
		.dismissEnquiryForm()
		.clickEnquiryForm()
		.enterName(name)
		.enterOrganization(organization)
		.enterAddress(address)
		.enterMobile(mobile)
		.enterEmail(email)
		.selectRequestFor(requestFor)
		.enteroriginStation(originStation)
		.enterdestnStation(destnStation)
		.clickDateofDeparture()
		.clickonDeparturedate()
		.clickDateofArrival()
		.clickonArrivaldate()
		.enterDurationPeriod(durationPeriod)
		.entercoachDetails(coachDetails)
		.enterNumberOfPassenger(numPassenger)
		.enterPurposeOfCharter(charterPurpose)
		.enterAdditionalServiceRequired(services)
		.clickSubmit()
		.verifyMobileNotValid("Mobile no. not valid")
		;
		
		
	}

}
