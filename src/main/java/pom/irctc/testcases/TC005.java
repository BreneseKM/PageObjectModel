package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.Homepage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC005";
		testCaseDescription="To verify GuestLogin for BookHotelGstValidation";
		author="Brenese";
		category="smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC005";
		
	}
	@Test(dataProvider = "fetchdata1")


	public void GSTValidation(String email,String mobileNo,String place,String hotelRoom,String adult,String title,String firstName,String lastName,String state,String gst,String companyName,String companyAddress)
	{
		
		new Homepage()
		
		.mouseHoverHolidays()
		.mouseHoverStays()
		.clickOnLounge()
		.switchTolastWindow()
		.clickHotels()
		.switchTolastWindow()
		.clickLogin()
		.clickGuestUserLogin()
		.enterEmail(email)
		.enterMobileNo(mobileNo)
		.clickLogin()
		.waitProperty()
		.enterCity(place)
		.waitProperty()
		.clickCity()
		.clickCheckInDate() 
		.waitProperty()
		.chooseInDate()
		.clickCheckOutDate()
		.waitProperty()
		.chooseOutDate()
		.clickRoomAndGuest()
		.waitProperty()
		.pageDown()
		.selectRoom(hotelRoom)
		.selectAdults(adult)
		.waitProperty()
		.clickDone()
		.pageUp()
		.waitProperty()
		.clickFindHotel()
		.waitproperty()
		.clickFirstHotel()
		.switchtoLastWindows()
		.getHotelName()
		.getHotelPrice()
		.clickContinueToBook()
		.selectTitle(title)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.selectState(state)
		.selectGst(gst)
		.enterCompanyName(companyName)
		.enterCompanyAddress(companyAddress)
		.pageDown()
		.waitProperty()
		.clickContinue()
		.verifyGstNumber("gstNumber is required.")
		
		;
	}
}
