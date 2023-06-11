package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage enterUserName(String data)
	{
		enterByXpath("//input[@id='userName']", data);
		return new RegistrationPage();
	}
	public RegistrationPage enterPassword(String data)
	{
		enterByXpath("//input[@id='usrPwd']", data);
		return new RegistrationPage();
	}
    public RegistrationPage enterConfirmPassword(String data)
    {
    	enterByXpath("//input[@id='cnfUsrPwd']", data);
    	return new RegistrationPage();
    }
    public RegistrationPage clickPreferredLanguage()
    {
    	clickByXpath("//p-dropdown[@formcontrolname='prefLang']");
    	return new RegistrationPage();
    	
    }
    public RegistrationPage ClickOnchooseLanguage()
    {
    	clickByXpath("//span[text()='English']/parent::li");
    	return new RegistrationPage();
    	
    }
    public RegistrationPage clickSecurityQuestion()
    {
    	clickByXpath("//span[text()='Security Question']");
    	return new RegistrationPage();
    }
    public RegistrationPage ClickOnchooseSecurityQuestion()
    {
    	clickByXpath("//span[text()='What was the name of your first school?']");
    	return new RegistrationPage();
    }
    public RegistrationPage enterSecurityAnswer(String data)
    {
    	enterByXpath("//input[@formcontrolname='secAns']", data);
    	return new RegistrationPage();
    }
    public RegistrationPage clickContinue()
    {
    	clickByXpath("//button[text()='Continue ']");
    	return new RegistrationPage();
    }
    public RegistrationPage enterFirstName(String data)
    {
    	enterByXpath("//input[@id='firstName']", data);
    	return new RegistrationPage();
    }
    
    public RegistrationPage enterMiddleName(String data)
    {
    	enterByXpath("//input[@id='middleName']", data);
    	return new RegistrationPage();
    }
    public RegistrationPage enterLastName(String data)
    {
    	enterByXpath("//input[@id='lastname']", data);
    	return new RegistrationPage();
    }
    public RegistrationPage clickOccupation()
    {
    	clickByXpath("//span[text()='Select Occupation']");
    	return new RegistrationPage();
    }
    public RegistrationPage clickOnselectOccupation()
    {
    	clickByXpath("//span[text()='STUDENT']");
    	return new RegistrationPage();
    }
    public RegistrationPage clickDateofBirth() 
    {
    	clickByXpath("//input[@placeholder='Date Of Birth']");
    	return new RegistrationPage();
	}
    public RegistrationPage selectYear(String data)
    {
    	selectVisibileTextByXpath("//option[text()='1995']/parent::select", data);
    	return new RegistrationPage();
    }
    public RegistrationPage selectMonth(String data)
    {
    	selectVisibileTextByXpath("//option[text()='December']/parent::select", data);
    	return new RegistrationPage();
    }
    public RegistrationPage clickDate(String data)
    {
    	clickByXpath("//a[text()='"+data+"']");
    	return new RegistrationPage();
    }
    public RegistrationPage clickMarried()
    {
    	clickByXpath("//label[text()='Married']");
    	return new RegistrationPage();
    }
    public RegistrationPage clickUnmarried()
    {
    	clickByXpath("//label[text()='Unmarried']");
    	return new RegistrationPage();
    }
    public RegistrationPage clickMale() 
    {
    	clickByXpath("//span[text()='Male']");
    	return new RegistrationPage();
		
	}
    public RegistrationPage clickFemale()
    {
    	clickByXpath("//span[text()='Female']");
    	return new RegistrationPage();
    }
    public RegistrationPage clickTransgender()
    {
    	clickByXpath("//span[text()='Transgender']");
    	return new RegistrationPage();
    }
    public RegistrationPage selectCountry(String data)
    {
    	selectVisibileTextByXpath("//option[text()='Select a Country']/parent::select", data);
    	return new RegistrationPage();
    }
    public RegistrationPage enterEmail(String data)
    {
    	enterByXpath("//input[@id='email']", data);
    	return new RegistrationPage();
    }
    public RegistrationPage enterMobileNo(String data)
    {
    	enterByXpath("//input[@id='mobile']", data);
    	return new RegistrationPage();
    }
    public RegistrationPage enterNationality(String data)
    {
    	selectVisibileTextByXpath("//option[text()='Select a Nationality']/parent::select", data);
    	return new RegistrationPage();
    }
    public RegistrationPage clickonContinue()
    {
    	clickByXpath("//button[@label='Continue']");
    	return new RegistrationPage();
    }
    public RegistrationPage enterDoorNo(String data)
    {
    	enterByXpath("//input[@id='resAddress1']", data);
    	return new RegistrationPage();
    }
    public RegistrationPage enterStreet(String data)
    {
    	enterByXpath("//input[@id='resAddress2']", data);
    	return new RegistrationPage();
    }
    public RegistrationPage enterArea(String data)
    {
    	enterByXpath("//input[@id='resAddress2']", data);
    	return new RegistrationPage();
    }
    public RegistrationPage enterPincode(String data)
    {
    	enterByXpath("//input[@name='resPinCode']", data);
    	return new RegistrationPage();
    }
    public RegistrationPage enterState(String data)
    {
    	enterByXpath("//input[@name='resState']", data);
    	return new RegistrationPage();
    }
    public RegistrationPage selectCity(String data)
    {
    	selectVisibileTextByXpath("//option[text()='Select city']/parent::select", data);
    	return new RegistrationPage();
    }
    public RegistrationPage selectPostoffice(String data)
    {
    	selectVisibileTextByXpath("//option[text()='Select a Post Office']/parent::select", data);
    	return new RegistrationPage();
    }
    public RegistrationPage enterPhone(String data)
    {
    	enterByXpath("//input[@id='resPhone']", data);
    	return new RegistrationPage();
    }
    public RegistrationPage ClickCopyOfficeAddressYes()
    {
    	clickByXpath("//label[text()='Yes']");
    	return new RegistrationPage();
    }
    public RegistrationPage clickCopyOfficeAddressNo()
    {
    	clickByXpath("//label[text()='No']");
    	return new RegistrationPage();
    }
    public RegistrationPage enterOfficeFlatNo(String data)
    {
    	enterByXpath("//input[@id='offAddress1']", data);
    	return new RegistrationPage();
    }
    public RegistrationPage enterOfficeStreet(String data)
    {
    	enterByXpath("//input[@id='offAddress2']", data);
    	return new RegistrationPage();
    }
    public RegistrationPage enterOfficeArea(String data)
    {
    	enterByXpath("//input[@id='offAddress3']", data);
    	return new RegistrationPage();
    	
    }
    public RegistrationPage enterOfficePinCode(String data)
    {
    	enterByXpath("//input[@id='offPinCode']", data);
    	return new RegistrationPage();
    }
    public RegistrationPage enterOfficeState(String data)
    {
    	enterByXpath("//input[@id='offState']", data);
    	return new RegistrationPage();
    }
    public RegistrationPage selectOfficeCity(String data)
    {
    	selectVisibileTextByXpath("//option[text()='Office Select city']/parent::select", data);
    	return new RegistrationPage();
    }
    public RegistrationPage selectOfficePost(String data)
    {
    	selectVisibileTextByXpath("//option[text()='Office Select a Post Office']/parent::select", data);
    	return new RegistrationPage();
    }
    public RegistrationPage enterOfficephone(String data)
    {
    	enterByXpath("//input[@id='offPhone']", data);
    	return new RegistrationPage();
    }
    public RegistrationPage clickTermAndConditions()
    {
    	clickByXpath("//input[@formcontrolname='termCondition']");
    	return new RegistrationPage();
    }
    
    
    
    
}
