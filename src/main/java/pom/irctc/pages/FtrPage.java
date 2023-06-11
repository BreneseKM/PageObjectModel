package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FtrPage extends GenericWrappers {
	
	public FtrPage switchTolastWindow()
	{
		switchToLastWindow();
		return new FtrPage();
	}
	
	public FtrUserRegistrationPage clickSignUp()
	{
		clickByXpath("//a[text()='New User? Signup']");
		return new FtrUserRegistrationPage();
	}

}
