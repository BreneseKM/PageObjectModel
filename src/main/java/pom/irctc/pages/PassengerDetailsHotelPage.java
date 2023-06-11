package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PassengerDetailsHotelPage extends GenericWrappers {
	
	
	
	public PassengerDetailsHotelPage selectTitle(String data)
	{
		selectVisibileTextByXpath("//select[@name='title']", data);
		return new PassengerDetailsHotelPage();
	}
	public PassengerDetailsHotelPage enterFirstName(String data)
	{
		enterByXpath("//input[@name='firstName']", data);
		return new PassengerDetailsHotelPage();
	}
    public PassengerDetailsHotelPage enterLastName(String data)
    {
    	enterByXpath("//input[@name='lastName']", data);
    	return new PassengerDetailsHotelPage();
    }
    public PassengerDetailsHotelPage selectCountry(String data)
    {
    	selectVisibileTextByXpath("//select[@name='country']", data);
    	return new PassengerDetailsHotelPage();
    }
    public PassengerDetailsHotelPage selectState(String data)
    {
    	selectVisibileTextByXpath("//select[@name='state']", data);
    	return new PassengerDetailsHotelPage();
    }
    public PassengerDetailsHotelPage enterMobileNo(String data)
    {
    	enterByXpath("//input[@placeholder='Enter Mobile Number']", data);
    	return new PassengerDetailsHotelPage();
    }
    public PassengerDetailsHotelPage enterEmail(String data)
    {
    	enterByXpath("//input[@placeholder='Enter Email']", data);
    	return new PassengerDetailsHotelPage();
    }
    public PassengerDetailsHotelPage selectGst(String data)
    {
    	selectVisibileTextByXpath("//select[@name='gst']", data);
    	return new PassengerDetailsHotelPage();
    }
    public PassengerDetailsHotelPage compareHotelName(String data )
    {
    	verifyTextByXpath("//h5[text()='Sterling Ooty Elk Hill ']", data);
    	return new PassengerDetailsHotelPage();
    }
    public PassengerDetailsHotelPage compareHotelPrice(String data)
    {
    	verifyTextByXpath("//strong[text()='₹ 13747']", data);
    	return new PassengerDetailsHotelPage();
    }
    public PassengerDetailsHotelPage enterCustomerGst(String data)
    {
    	enterByXpath("//input[@name='gstNumber']", data);
    	return new PassengerDetailsHotelPage();
    }
    public PassengerDetailsHotelPage enterCompanyName(String data)
    {
    	enterByXpath("//input[@name='companyName']", data);
    	return new PassengerDetailsHotelPage();
    }
    public PassengerDetailsHotelPage enterCompanyAddress(String data)
    {
    	enterByXpath("//input[@name='companyAddress']", data);
    	return new PassengerDetailsHotelPage();
    }
    public PassengerDetailsHotelPage clickReset()
    {
    	clickByXpath("//button[text()='Reset']");
    	return new PassengerDetailsHotelPage();
    }
    public PassengerDetailsHotelPage clickContinue()
    {
    	clickByXpath("//button[text()='Continue']");
    	return new PassengerDetailsHotelPage();
    }
    public PassengerDetailsHotelPage verifyGstNumber(String data)
    {
    	verifyTextByXpath("//span[text()='gstNumber is required.']", data);
    	return new PassengerDetailsHotelPage();
    }
    public PassengerDetailsHotelPage waitProperty()
    {
    	waitproperty(5000);
    	return new PassengerDetailsHotelPage();
    }
    public PassengerDetailsHotelPage pageDown()
    {
    	pageDownByXpath("//html/body");
    	return new PassengerDetailsHotelPage();
    }

    
    
}

