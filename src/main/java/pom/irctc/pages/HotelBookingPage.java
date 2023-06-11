package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelBookingPage extends GenericWrappers{

	public HotelBookingPage enterCity(String data)
	{
		enterByXpath("//input[@id='filterText']",data);
		return new HotelBookingPage();
	}
	public HotelBookingPage clickCity()
	{
		clickByXpath("//span[text()='Ooty']");
		return new HotelBookingPage();
	}
	public HotelBookingPage clickCheckInDate()
	{
		clickByXpath("//input[@name='dt12']");
		return new HotelBookingPage();
	}
	public HotelBookingPage chooseInDate()
	{
		clickByXpath("//div[@tabindex='-1']/following::owl-date-time-month-view/child::table/child::thead/following::tbody/child::tr[2]/child::td[4]/child::span[text()='7']");
		return new HotelBookingPage();
	}
	public HotelBookingPage clickCheckOutDate()
	{
		clickByXpath("//input[@name='dt13']");
		return new HotelBookingPage();
	}
	public HotelBookingPage chooseOutDate()
	{
		clickByXpath("//div[@tabindex='-1']/following::owl-date-time-month-view/child::table/child::thead/following::tbody/child::tr[2]/child::td[5]/child::span[text()='8']");
		return new HotelBookingPage();
	}
	public HotelBookingPage clickRoomAndGuest()
	{
		clickByXpath("//input[@name='guest']");
		return new HotelBookingPage();
	}
	public HotelBookingPage selectRoom(String data)
	{
		selectVisibileTextByXpath("//select[@name='hotelRoom']", data);
		return new HotelBookingPage();
	}
	public HotelBookingPage selectAdults(String data)
	{
		selectVisibileTextByXpath("//select[@name='hotelAdult']", data);
		return new HotelBookingPage();
	}
	public HotelBookingPage selectChildren(String data)
	{
		selectVisibileTextByXpath("//select[@name='hotelChild']", data);
		return new HotelBookingPage();
	}
	public HotelBookingPage clickDone()
	{
		clickByXpath("//button[text()='Done']");
		return new HotelBookingPage();
	}
	public HotelSearchPage clickFindHotel()
	{
		clickByXpath("//button[text()='Find Hotel ']");
		return new HotelSearchPage();
	}
	public HotelBookingPage waitProperty()
	{
		waitproperty(5000);
		return new HotelBookingPage();
	}
	public HotelBookingPage pageDown()
	{
		pageDownByXpath("//html/body");
		return new HotelBookingPage();
	}
	public HotelBookingPage pageUp()
	{
		pageUpByXpath("//html/body");
		return new HotelBookingPage();
	}
	
	
}
