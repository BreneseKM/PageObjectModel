package pom.ssc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers
{
	public SscRegistrationPage clickRegisterNow() 
	{
		clickByXpath("//a[@id='signUpLink']");
		return new SscRegistrationPage();
	}
}
