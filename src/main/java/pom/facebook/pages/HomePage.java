package pom.facebook.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {

	public SignUpPage clickCreateNewAccount()
	{
		clickByXpath(prop.getProperty("HomePage.clickCreateNewAccount.Xpath"));
		return new SignUpPage();
	}
}
