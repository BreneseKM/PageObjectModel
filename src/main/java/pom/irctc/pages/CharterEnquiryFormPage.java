package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterEnquiryFormPage extends GenericWrappers {
	
	
	public CharterEnquiryFormPage dismissEnquiryForm()
	{
		clickByXpath("//div[@id='dismiss']");
		return new CharterEnquiryFormPage();
	}
	public CharterEnquiryFormPage enterName(String data)
	{
		enterByXpath("//input[@name='name']", data);
		return new CharterEnquiryFormPage();
	}
	public CharterEnquiryFormPage enterOrganization(String data)
	{
		enterByXpath("//input[@name='organization']", data);
		return new CharterEnquiryFormPage();
	}
	public CharterEnquiryFormPage enterAddress(String data)
	{
		enterByXpath("//input[@name='address']", data);
		return new CharterEnquiryFormPage();
	}
	public CharterEnquiryFormPage enterMobile(String data)
	{
		enterByXpath("//input[@name='mobile']", data);
		return new CharterEnquiryFormPage();
	}
	public CharterEnquiryFormPage enterEmail(String data)
	{
		enterByXpath("//input[@name='email']", data);
		return new CharterEnquiryFormPage();
	}
	public CharterEnquiryFormPage selectRequestFor(String data)
	{
		selectVisibileTextByXpath("//select[@name='requestFor']", data);
		return new CharterEnquiryFormPage();
	}
	public CharterEnquiryFormPage enteroriginStation(String data)
	{
		enterByXpath("//input[@name='originStation']", data);
		return new CharterEnquiryFormPage();
	}
	public CharterEnquiryFormPage enterdestnStation(String data)
	{
		enterByXpath("//input[@name='destnStation']", data);
		return new CharterEnquiryFormPage();
	}
	public CharterEnquiryFormPage clickDateofDeparture()
	{
		clickByXpath("//input[@name='checkInDate']");
		return new CharterEnquiryFormPage();
	}
	public CharterEnquiryFormPage clickonDeparturedate()
	{
		clickByXpath("//input[@name='checkInDate']//following::div/child::div/child::table/child::tbody/child::tr[2]/child::td[4]/child::span");
		return new CharterEnquiryFormPage();
	}
	public CharterEnquiryFormPage clickDateofArrival()
	{
		clickByXpath("//input[@name='checkOutDate']");
		return new CharterEnquiryFormPage();
	}
	public CharterEnquiryFormPage clickonArrivaldate()
	{
		clickByXpath("//input[@name='checkOutDate']//following::div/child::div/child::table/child::tbody/child::tr[2]/child::td[5]/child::span");
		return new CharterEnquiryFormPage();
	}
	public CharterEnquiryFormPage enterDurationPeriod(String data)
	{
		enterByXpath("//input[@name='durationPeriod']", data);
		return new CharterEnquiryFormPage();
	}
	public CharterEnquiryFormPage entercoachDetails(String data) 
	{
		enterByXpath("//input[@name='coachDetails']", data);
		return new CharterEnquiryFormPage();
	}
	public CharterEnquiryFormPage enterNumberOfPassenger(String data)
	{
		enterByXpath("//input[@name='numPassenger']", data);
		return new CharterEnquiryFormPage();
	}
	public CharterEnquiryFormPage enterPurposeOfCharter(String data)
	{
		enterByXpath("//textarea[@name='charterPurpose']", data);
		return new CharterEnquiryFormPage();
	}
	public CharterEnquiryFormPage enterAdditionalServiceRequired(String data)
	{
		enterByXpath("//textarea[@name='services']", data);
		return new CharterEnquiryFormPage();
	}
	public CharterEnquiryFormPage clickSubmit()
	{
		clickByXpath("//button[@type='Submit']");
		return new CharterEnquiryFormPage();
	}
	public CharterEnquiryFormPage verifyMobileNotValid(String data)
	{
		verifyTextByXpath("//span[text()='Mobile no. not valid']", data);
				return new CharterEnquiryFormPage();
	}



}
