package pom.ssc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.ssc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC009";
		testCaseDescription="To verify new user registration for SSC";
		author="Brenese";
		category="smoke";
		browserName="chrome";
		url="https://ssc.nic.in/";
		sheetName="TC009";
		
	}
	@Test(dataProvider = "fetchdata1")

	public void sscRegistration(String AadharNumber,String VerifyAadharNumber,String Name,String VerifyName,String NewName,String FatherName,String VerifyFatherName,String MotherName,String VerifyMotherName,String DateOfBirth,String VerifyDateOfBirth,String EducationBoard,String ddlEducationBoard,String SecondaryRollNum,String VerifySecondaryRollNum,String Yearofpassing,String ddlYearofpassing,String Levelofeducationqualification,String MobileNum,String VerifyMobileNum,String EmailID,String VerifyEmailID,String OriginState )
	{
	
	new HomePage()
	
	.clickRegisterNow()
	.clickHaveAadhaarCardYes()
	.enterAadhaarNumber(AadharNumber)
	.enterVerifyAadhaarNumber(VerifyAadharNumber)
	.enterName(Name)
	.enterVerifyName(VerifyName)
	.clickHaveChangedNameYes()
	.enterNewName(NewName)
	.enterFatherName(FatherName)
	.enterVerifyfatherName(VerifyFatherName)
	.enterMotherName(MotherName)
	.enterVerifyMotherName(VerifyMotherName)
	.enterDOB(DateOfBirth)
	.enterVerifyDOB(VerifyDateOfBirth)
	.selectEducationBoard(EducationBoard)
	.selectVerifyEducationBoard(ddlEducationBoard)
	.enterRollNo(SecondaryRollNum)
	.enterVerifyRollNo(VerifySecondaryRollNum)
	.selectYearPassing(Yearofpassing)
	.selectVerifyYearPassing(ddlYearofpassing)
	.clickMale()
	.clickVerifyMale()
	.selectEductionQualification(Levelofeducationqualification)
	.enterMobileNo(MobileNum)
	.enterVerifyMobileNo(VerifyMobileNum)
	.enterEmailID(EmailID)
	.enterVerifyEmailID(VerifyEmailID)
	.selectState(OriginState)
	
	;
 }
	
}
