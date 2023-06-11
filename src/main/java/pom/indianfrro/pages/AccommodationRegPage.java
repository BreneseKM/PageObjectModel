package pom.indianfrro.pages;

import wrappers.GenericWrappers;

public class AccommodationRegPage extends GenericWrappers {
	
	public AccommodationRegPage enterUserID(String data)
	{
		enterByXpath("//input[@id='u_id']", data);
		return new AccommodationRegPage();
	}
	public AccommodationRegPage enterPassword(String data)
	{
		enterByXpath("//input[@id='u_pwd']", data);
		return new AccommodationRegPage();
	}
	public AccommodationRegPage enterConfirmPassword(String data)
	{
		enterByXpath("//input[@id='u_repwd']", data);
		return new AccommodationRegPage();
	}
	public AccommodationRegPage selectSecurityQuestion(String data)
	{
		selectVisibileTextByXpath("//select[@id='u_secques']", data);
		return new AccommodationRegPage();
	}
	public AccommodationRegPage enterAnswer(String data) 
	{
		enterByXpath("//input[@id='u_secans']", data);
		return new AccommodationRegPage();
	}
	public AccommodationRegPage enterName(String data)
	{
		enterByXpath("//input[@id='u_name']", data);
		return new AccommodationRegPage();
	}
	public AccommodationRegPage selectGender(String data)
	{
		selectVisibileTextByXpath("//select[@id='u_gender']", data);
		return new AccommodationRegPage();
	}
	public AccommodationRegPage enterDob(String data)
	{
		enterByXpath("//input[@id='u_dob']", data);
		return new AccommodationRegPage();
	}
    public AccommodationRegPage enterDesignation(String data)
    {
    	enterByXpath("//input[@id='u_designation']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage enterEmail(String data)
    {
    	enterByXpath("//input[@id='u_emailid']", data);
    	return new AccommodationRegPage();
    }
   
    public AccommodationRegPage enterMobileNo(String data) 
    {
    	enterByXpath("//input[@name='u_mobile']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage enterPhoneNo(String data)
    {
    	enterByXpath("//input[@name='u_phone']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage selectNationality(String data)
    {
    	selectVisibileTextByXpath("//select[@id='u_nationality']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage enterName1(String data)
    {
    	enterByXpath("//input[@id='name']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage enterCapacity(String data)
    {
    	enterByXpath("//input[@id='capacity']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage enterAddress(String data)
    {
    	enterByXpath("//textarea[@id='address']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage selectState(String data)
    {
    	selectVisibileTextByXpath("//select[@id='state']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage waitproperty()
    {
    	waitproperty(5000);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage selectCity(String data) 
    {
    	selectVisibileTextByXpath("//select[@name='city_distr']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage selectAccomodationType(String data)
    {
    	selectVisibileTextByXpath("//select[@id='acco_type']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage selectAccomodationGrade(String data)
    {
    	selectVisibileTextByXpath("//select[@id='star_rat']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage enterEmail1(String data) 
    {
    	enterByXpath("//input[@id='email']", data);
    	return new AccommodationRegPage();
    }
   
    public AccommodationRegPage enterMobileNo1(String data)
    {
    	enterByXpath("//input[@id='mcontact']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage enterContact1(String data)
    {
    	enterByXpath("//input[@id='contact']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage  enterName2(String data)
    {
    	enterByXpath("//input[@name='name_o']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage enterAddress1(String data)
    {
    	enterByXpath("//input[@name='address_o']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage selectState1(String data)
    {
    	selectVisibileTextByXpath("//select[@id='state_o']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage selectCity1(String data)
    {
    	selectVisibileTextByXpath("//select[@name='citydistr_o']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage enterEmailId(String data)
    {
    	enterByXpath("//input[@name='emailid_o']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage enterPhoneNo1(String data)
    {
    	enterByXpath("//input[@name='phoneno_o']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage enterMobileNo2(String data)
    {
    	enterByXpath("//input[@name='mobile_o']", data);
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage clickAdd()
    {
    	clickByXpath("//input[@value='Add']");
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage clickDelete()
    {
    	clickByXpath("//input[@value='Delete']");
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage clickReset()
    {
    	clickByXpath("//input[@value='Reset']");
    	return new AccommodationRegPage();
    }
    public AccommodationRegPage clickSubmit()
    {
    	clickByXpath("//input[@value='Submit']");
    	return new AccommodationRegPage();
    }
}
