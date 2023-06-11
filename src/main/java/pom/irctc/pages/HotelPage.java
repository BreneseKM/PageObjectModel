package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelPage extends GenericWrappers{

	public HotelLoginPage clickLogin()
	{
		clickByXpath("//a[text()='Login']");
		return new HotelLoginPage();
	}
	public HotelPage switchTolastWindow()
	{
		switchToLastWindow();
		return new HotelPage();
	}
	
}
