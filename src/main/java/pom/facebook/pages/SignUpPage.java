package pom.facebook.pages;

import wrappers.GenericWrappers;

public class SignUpPage extends GenericWrappers{
	
	
	
	public SignUpPage enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("SignUpPage.enterFirstName.Xpath"), data);
		return new SignUpPage();
	}
	public SignUpPage enterLastName(String data)
	{
		enterByXpath(prop.getProperty("SignUpPage.enterLastName.Xpath"), data);
		return new SignUpPage();
	}
	public SignUpPage enterEmailAddress(String data)
	{
		enterByXpath(prop.getProperty("SignUpPage.enterEmailAddress.Xpath"), data);
		return new SignUpPage();
	}
	public SignUpPage enterReEmailAddress(String data)
	{
		enterByXpath(prop.getProperty("SignUpPage.enterReEmailAddress.Xpath"), data);
		return new SignUpPage();
	}
	public SignUpPage enterPassword(String data)
	{
		enterByXpath(prop.getProperty("SignUpPage.enterPassword.Xpath"), data);
		return new SignUpPage();
	}
	public SignUpPage selectDay(String data)
	{
		selectVisibileTextByXpath(prop.getProperty("SignUpPage.selectDay.Xpath"), data);
		return new SignUpPage();
	}
	public SignUpPage selectMonth(String data)
	{
		selectVisibileTextByXpath(prop.getProperty("SignUpPage.selectMonth.Xpath"), data);
		return new SignUpPage();
	}
	public SignUpPage selectYear(String data)
	{
		selectVisibileTextByXpath(prop.getProperty("SignUpPage.selectYear.Xpath"), data);
		return new SignUpPage();
	}
	public SignUpPage chooseOnGender(String data)
	{
		clickByXpath(prop.getProperty("SignUpPage.clickMale.Xpath"));
		return new SignUpPage();
	}
	
}
