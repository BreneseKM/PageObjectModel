package pom.phptravel.pages;

import wrappers.GenericWrappers;

public class PhpRegPage extends GenericWrappers {
	
	public PhpRegPage enterFirstName(String data)
	{
		enterByXpath("//input[@id='inputFirstName']", data);
		return new PhpRegPage();
	}
	public PhpRegPage enterLastName(String data)
	{
		enterByXpath("//input[@id='inputLastName']", data);
		return new PhpRegPage();
	}
	public PhpRegPage enterEmailAddress(String data)
	{
		enterByXpath("//input[@id='inputEmail']", data);
		return new PhpRegPage();
	}
	public PhpRegPage clickCountryCode()
	{
		clickByXpath("//div[text()='+92']");
		return new PhpRegPage();
	}
	public PhpRegPage chooseCountryCode()
	{
		clickByXpath("//span[text()='India (भारत)']");
		return new PhpRegPage();
	}
	public PhpRegPage enterPhoneNo(String data)
	{
		enterByXpath("//input[@id='inputPhone']", data);
		return new PhpRegPage();
	}
	public PhpRegPage enterCompanyName(String data)
	{
		enterByXpath("//input[@id='inputCompanyName']", data);
		return new PhpRegPage();
	}
	public PhpRegPage enterStreetAddress(String data)
	{
		enterByXpath("//input[@id='inputAddress1']",data);
		return new PhpRegPage();
	}
	public PhpRegPage enterStreetAddress2(String data)
	{
		enterByXpath("//input[@id='inputAddress2']", data);
		return new PhpRegPage();
	}
	public PhpRegPage enterCity(String data)
	{
		enterByXpath("//input[@id='inputCity']", data);
		return new PhpRegPage();
	}
	public PhpRegPage enterState(String data)
	{
		enterByXpath("//input[@id='stateinput']", data);
		return new PhpRegPage();
	}
	public PhpRegPage enterPostCode(String data)
	{
		enterByXpath("//input[@id='inputPostcode']", data);
		return new PhpRegPage();
	}
	public PhpRegPage selectCountry(String data)
	{
		selectVisibileTextByXpath("//select[@id='inputCountry']", data);
		return new PhpRegPage();
	}
	public PhpRegPage enterMobileNo(String data)
	{
		enterByXpath("//input[@id='customfield2']", data);
		return new PhpRegPage();
	}
	public PhpRegPage enterPassword(String data)
	{
		enterByXpath("//input[@id='inputNewPassword1']", data);
		return new PhpRegPage();
	}
	public PhpRegPage enterConfirmPassword(String data)
	{
		enterByXpath("//input[@id='inputNewPassword2']", data);
		return new PhpRegPage();
	}
	public PhpRegPage clickNoJoinMailList()
	{
		clickByXpath("//span[text()='Yes']/following::span[1]");
		return new PhpRegPage();
	}

}
