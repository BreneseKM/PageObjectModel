package pom.indianfrro.pages;

import wrappers.GenericWrappers;

public class FrroFormCHomePage extends GenericWrappers {
	
	public AccommodationRegPage clickSignUpReg()
	{
		clickByXpath("//a[text()='Sign Up (Registration)']");
		return new AccommodationRegPage();
	}

}
