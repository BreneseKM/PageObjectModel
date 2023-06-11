package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FtrUserRegistrationPage extends GenericWrappers {

	public FtrUserRegistrationPage enterUserID(String data)
	{
		enterByXpath("//input[@id='userId']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage enterPassword(String data)
	{
		enterByXpath("//input[@id='password']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage enterConfirmPassword(String data)
	{
		enterByXpath("//input[@id='cnfPassword']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage selectSecurityQuestion(String data)
	{
	    selectVisibileTextByXpath("//select[@id='secQstn']",data);
	    return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage enterSecurityAnswer(String data)
	{
		enterByXpath("//input[@id='secAnswer']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage clickDateOfBirth()
	{
		clickByXpath("//input[@id='dateOfBirth']");
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage selectYear(String data)
	{
		selectVisibileTextByXpath("//option[text()='1995']/parent::select", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage selectMonth(String data)
	{
		selectVisibileTextByXpath("//option[text()='Dec']/parent::select", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage clickDate(String data)
	{
		clickByXpath("//a[text()='"+data+"']");
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage clickMale()
	{
		clickByXpath("//input[@id='gender0']");
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage clickFemale()
	{
		clickByXpath("//input[@id='gender1']");
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage clickTransgender()
	{
		clickByXpath("//input[@id='gender2']");
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage clickInstitution()
	{
		clickByXpath("//input[@id='gender3']");
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage clickUnmarried()
	{
		clickByXpath("//input[@id='maritalStatus1']");
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage enterEmailId(String data)
	{
		enterByXpath("//input[@id='email']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage selectOccupation(String data)
	{
		selectVisibileTextByXpath("//select[@id='occupation']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage enterFirstName(String data)
	{
		enterByXpath("//input[@id='fname']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage enterMiddleName(String data)
	{
		enterByXpath("//input[@id='mname']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage enterLastName(String data)
	{
		enterByXpath("//input[@id='lname']",data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage selectNationality(String data)
	{
		selectVisibileTextByXpath("//select[@id='natinality']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage enterFlatNo(String data)
	{
		enterByXpath("//input[@id='flatNo']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage enterStreet(String data)
	{
		enterByXpath("//input[@id='street']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage enterArea(String data)
	{
		enterByXpath("//input[@id='area']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage selectCountry(String data)
	{
		selectVisibileTextByXpath("//select[@id='country']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage enterMobileNo(String data)
	{
		enterByXpath("//input[@id='mobile']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage enterPinCode(String data)
	{
		enterByXpath("//input[@id='pincode']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage pageDown()
	{
		pageUpByXpath("//html/body");
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage selectCity(String data)
	{
		selectVisibileTextByXpath("//select[@id='city']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage selectState(String data)
	{
		selectVisibileTextByXpath("//select[@id='state']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage selectPostOffice(String data)
	{
		selectVisibileTextByXpath("//select[@id='postOffice']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage ClickYesSameAddress()
	{
		clickByXpath("//input[@id='sameAddresses0']");
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage clickNoSameAddress()
	{
		clickByXpath("//input[@id='sameAddresses1']");
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage enterOfficeFlatNo(String data)
	{
		enterByXpath("//input[@id='flatNoOffice']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage enterOfficeStreet(String data)
	{
		enterByXpath("//input[@id='streetOffice']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage enterOfficeArea(String data)
	{
		enterByXpath("//input[@id='areaOffice']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage selectOfficeCountry(String data)
	{
		selectVisibileTextByXpath("//select[@id='countryOffice']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage enterOfficeMobile(String data) 
	{
	    enterByXpath("//input[@id='mobileOffice']", data);
	    return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage enterOfficePinCode(String data)
	{
		enterByXpath("//input[@id='pincodeOffice']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage waitProperty()
	{
		waitproperty(5000);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage selectOfficeCity(String data)
	{
		selectVisibileTextByXpath("//select[@id='cityOffice']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage selectOfficeState(String data)
	{
		selectVisibileTextByXpath("//select[@id='stateOffice']", data);
		return new FtrUserRegistrationPage();
	}
	public FtrUserRegistrationPage selectOfficePost(String data)
	{
		selectVisibileTextByXpath("//select[@id='postOfficeOffice']", data);
		return new FtrUserRegistrationPage();
	}
	
	
}
