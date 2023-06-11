package pom.ssc.pages;

import wrappers.GenericWrappers;

public class SscRegistrationPage extends GenericWrappers {
	
	public SscRegistrationPage clickHaveAadhaarCardYes()
	{
		clickByXpath("//input[@id='rbAadharYes']");
		return new SscRegistrationPage();
	}
	public SscRegistrationPage clickHaveAadhaarNo()
	{
		clickByXpath("//input[@id='rbAadharNo']");
		return new SscRegistrationPage();
	}
	public SscRegistrationPage enterAadhaarNumber(String data)
	{
		enterByXpath("//input[@id='AadharNumber']", data);
		return new SscRegistrationPage();
	}
	public SscRegistrationPage enterVerifyAadhaarNumber(String data)
	{
		enterByXpath("//input[@id='VerifyAadharNumber']", data);
		return new SscRegistrationPage();
	}
    public SscRegistrationPage selectTypeOfId(String data)
    {
    	selectVisibileTextByXpath("//select[@id='TypeofID']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage enterIdNumber(String data)
    {
    	enterByXpath("//input[@id='IDnumber']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage enterName(String data)
    {
    	enterByXpath("//input[@id='Name']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage enterVerifyName(String data)
    {
    	enterByXpath("//input[@id='VerifyName']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage clickHaveChangedNameNo() 
    {
    	clickByXpath("//input[@id='rbHaveEverChangedNameNo']");
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage clickHaveChangedNameYes()
    {
    	clickByXpath("//input[@id='rbHaveEverChangedNameYes']");
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage enterNewName(String data)
    {
    	enterByXpath("//input[@id='NewName']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage enterFatherName(String data)
    {
    	enterByXpath("//input[@id='FatherName']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage enterVerifyfatherName(String data)
    {
    	enterByXpath("//input[@id='VerifyFatherName']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage enterMotherName(String data)
    {
    	enterByXpath("//input[@id='MotherName']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage enterVerifyMotherName(String data)
    {
    	enterByXpath("//input[@id='VerifyMotherName']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage enterDOB(String data)
    {
    	enterByXpath("//input[@id='DateOfBirth']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage enterVerifyDOB(String data)
    {
    	enterByXpath("//input[@id='VerifyDateOfBirth']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage selectEducationBoard(String data)
    {
    	selectVisibileTextByXpath("//select[@id='EducationBoard']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage selectVerifyEducationBoard(String data)
    {
    	selectVisibileTextByXpath("//select[@id='ddlEducationBoard']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage enterRollNo(String data)
    {
    	enterByXpath("//input[@id='SecondaryRollNum']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage  enterVerifyRollNo(String data)
    {
    	enterByXpath("//input[@id='VerifySecondaryRollNum']", data);
    	return new SscRegistrationPage();
    }
 
    public SscRegistrationPage selectYearPassing(String data)
    {
    	selectVisibileTextByXpath("//select[@id='Yearofpassing']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage selectVerifyYearPassing(String data)
    {
    	selectVisibileTextByXpath("//select[@id='ddlYearofpassing']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage clickMale()
    {
    	clickByXpath("//input[@id='rbMale']");
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage clickFeMale()
    {
    	clickByXpath("//input[@id='rbFeMale']");
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage clickTransgender()
    {
    	clickByXpath("//input[@id='rbOthers']");
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage clickVerifyMale()
    {
    	clickByXpath("//input[@id='rbVerifyMale']");
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage clickVerifyFemale()
    {
    	clickByXpath("//input[@id='rbVerifyFeMale']");
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage clickVerifyTransgender()
    {
    	clickByXpath("//input[@id='rbVerifyOthers']");
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage selectEductionQualification(String data)
    {
    	selectVisibileTextByXpath("//select[@id='Levelofeducationqualification']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage enterMobileNo(String data)
    {
    	enterByXpath("//input[@name='MobileNum']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage enterVerifyMobileNo(String data)
    {
    	enterByXpath("//input[@name='VerifyMobileNum']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage enterEmailID(String data)
    {
    	enterByXpath("//input[@id='EmailID']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage enterVerifyEmailID(String data) 		
    {
    	enterByXpath("//input[@id='VerifyEmailID']", data);
    	return new SscRegistrationPage();
    }
    public SscRegistrationPage selectState(String data)
    {
    	selectVisibileTextByXpath("//select[@id='OriginState']", data);
    	return new SscRegistrationPage();
    }
}
