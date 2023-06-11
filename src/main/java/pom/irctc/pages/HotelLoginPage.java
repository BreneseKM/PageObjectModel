package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelLoginPage extends GenericWrappers {

	public HotelLoginPage clickGuestUserLogin()
	{
		clickByXpath("//a[text()='Guest User Login ']");
		return new HotelLoginPage();
	}
	public HotelLoginPage enterEmail(String data)
	{
		enterByXpath("//input[@name='email']", data);
		return new HotelLoginPage();
	}
	public HotelLoginPage enterMobileNo(String data)
	{
		enterByXpath("//input[@name='mobileNo']", data);
		return new HotelLoginPage();
	}
	public HotelBookingPage clickLogin()
	{
		clickByXpath("//div[@id='home']/following::form//button[text()='Login']");
		return new HotelBookingPage();
	}
}
