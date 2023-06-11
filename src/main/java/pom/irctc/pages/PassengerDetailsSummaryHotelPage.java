package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PassengerDetailsSummaryHotelPage extends GenericWrappers {

	public PassengerDetailsSummaryHotelPage clickTermAndCondition()
	{
		clickByXpath("//label[text()='I Agree with the ']");
		return new PassengerDetailsSummaryHotelPage();
	}
	public HotelBookingPage clickReplan()
	{
		clickByXpath("//button[text()='Replan']");
		return new HotelBookingPage();
	}
	public OtpVerifyHotelPage clickPayment()
	{
		clickByXpath("//button[text()='Make Payment']");
		return new OtpVerifyHotelPage();
	}
	
}

