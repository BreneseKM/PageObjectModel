package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers {
	
	public CharterPage dismissEnquiryForm()
	{
		clickByXpath("//div[@id='dismiss']");
		return new CharterPage();
	}
	public CharterEnquiryFormPage clickEnquiryForm()
	{
		clickByXpath("//a[text()='Enquiry Form']");
		return new CharterEnquiryFormPage();
	}
	
}
