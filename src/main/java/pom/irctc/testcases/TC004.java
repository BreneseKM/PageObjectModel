package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.Homepage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC004";
		testCaseDescription="To verify GuestLogin for BookHotelOtpValidtion";
		author="Brenese";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC004";
		
	}
	@Test(dataProvider = "fetchdata1")
	
	
	public void BookHotelsOtpValidtion(String email,String mobileNo,String place,String hotelRoom,String adult,String title,String firstName,String lastname,String state,String gst)
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
		.enterLastName(lastname)
		.selectState(state)
		.selectGst(gst)
		.waitProperty()
		.compareHotelName("Sterling Ooty Elk Hill ")
		.compareHotelPrice("₹ 11650")
		.clickContinue()
		.clickTermAndCondition()
		.clickPayment()
		.waitproperty()
		.clickVerifyOtp()
		.verifyOtp("otp is required.")
		;
		
		
	}
	

}
