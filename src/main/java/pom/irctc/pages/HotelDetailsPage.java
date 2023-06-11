package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelDetailsPage extends GenericWrappers {
	
	public static String gettext1=null;
	
	public static String gettext2=null;
	
	public HotelDetailsPage switchtoLastWindows()
    {
    	switchToLastWindow();
    	return new HotelDetailsPage();
    }
	public HotelDetailsPage getHotelName()
	{
		gettext1=getTextByXpath("//h5[text()='Sterling Ooty Elk Hill ']");
		System.out.println("The HotelName is "+gettext1+" ");
		return new HotelDetailsPage();
	}
	
	public HotelDetailsPage getHotelPrice()
	{
		gettext2=getTextByXpath("//strong[text()='₹ 11650']");
		System.out.println("The Hotelprice is "+gettext2+" ");
		return new HotelDetailsPage();
	}
	
	public PassengerDetailsHotelPage clickContinueToBook()
	{
		clickByXpath("//b[text()='Continue to Book']");
		return new PassengerDetailsHotelPage();
		
	}
    
}
