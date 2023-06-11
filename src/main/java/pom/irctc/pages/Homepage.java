package pom.irctc.pages;

import wrappers.GenericWrappers;

public class Homepage extends GenericWrappers {
	
	public RegistrationPage clickOnRegister()
	{
		clickByXpath("//a[text()=' REGISTER ']");
		return new RegistrationPage();
	}
    public Homepage mouseHoverHolidays()
    {
    	mouseHoverByXpath("//a[text()=' HOLIDAYS ']");
    	return this;
    }
    public Homepage mouseHoverStays()
    {
    	mouseHoverByXpath("//span[text()='Stays']/parent::a");
    	return this;
    }
    public AccommodationPage clickOnLounge()
    {
    	clickByXpath("//span[text()='Lounge']");
    	return new AccommodationPage();
    }

}
