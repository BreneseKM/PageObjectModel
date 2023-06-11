package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers {
	
	
	public AccommodationPage switchTolastWindow()
	{
		switchToLastWindow();
		return new AccommodationPage();
	}
	public AccommodationPage clickOnMenuIcon()
	{
		clickByXpath("//a[@id='sidebarCollapse']");
		return new AccommodationPage();
	}
	public FtrPage clickOnBookYourCoach()
	{
		clickByXpath("//a[text()='Book Your Coach/Train']");
		return new FtrPage();
	}
    public CharterPage clickOnCharter()
    {
    	clickByXpath("//a[text()='Charter']");
    	return new CharterPage();
    }
    public HotelPage clickHotels()
    {
    	clickByXpath("//span[text()='Hotels']");
    	return new HotelPage();
    }
}
