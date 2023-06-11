package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelSearchPage extends GenericWrappers {
	
	public HotelSearchPage waitproperty()
	{
		waitproperty(5000);
		return new HotelSearchPage();
	}
	
	public HotelDetailsPage clickFirstHotel()
	{
		clickByXpath("//h5[text()='Sterling Ooty Elk Hill']/parent::div");
		return new HotelDetailsPage();
	}

}
