package pom.indianfrro.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.indianfrro.pages.FrroFormCHomePage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC006";
		testCaseDescription="To verify new user registration for the IndianFrro";
		author="Brenese";
		category="smoke";
		browserName="chrome";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		sheetName="TC006";
		
	}
	@Test(dataProvider = "fetchdata1")

	public void indianFrroReg(String u_id,String u_pwd,String u_repwd,String u_secques,String u_secans,String u_name,String u_gender,String u_dob,String u_designation,String u_emailid,String u_mobile,String u_phone,String u_nationality,String name,String capacity,String address,String state,String city_distr,String acco_type,String star_rat,String email,String mcontact,String contact,String name_o,String address_o,String state_o,String dist,String emailid_o,String phoneno_o,String mobile_o,String name_o1,String address_o1,String state_o1,String dist1,String emailid_o1,String phoneno_o1,String mobile_o1,String name_o2,String address_o2,String state_o2,String dist2,String emailid_o2,String phoneno_o2,String mobile_o2)
	{
		new FrroFormCHomePage()
		
		.clickSignUpReg()
		.enterUserID(u_id)
		.enterPassword(u_pwd)
		.enterConfirmPassword(u_repwd)
		.selectSecurityQuestion(u_secques)
		.enterAnswer(u_secans)
		.enterName(u_name)
		.selectGender(u_gender)
		.enterDob(u_dob)
		.enterDesignation(u_designation)
		.enterEmail(u_emailid)
		.enterMobileNo(u_mobile)
		.enterPhoneNo(u_phone)
		.selectNationality(u_nationality)
		.enterName1(name)
		.enterCapacity(capacity)
		.enterAddress(address)
		.selectState(state)
		.waitproperty()
		.selectCity(city_distr)
		.selectAccomodationType(acco_type)
		.selectAccomodationGrade(star_rat)
		.enterEmail1(email)
		.enterMobileNo1(mcontact)
		.enterContact1(contact)
		.enterName2(name_o)
		.enterAddress1(address_o)
		.selectState1(state_o)
		.waitproperty()
		.selectCity1(dist)
		.enterEmailId(emailid_o)
		.enterPhoneNo1(phoneno_o)
		.enterMobileNo2(mobile_o)
		.clickAdd()
		.waitproperty()
		.enterName2(name_o1)
		.enterAddress1(address_o1)
		.selectState1(state_o1)
		.selectCity1(dist1)
		.enterEmailId(emailid_o1)
		.enterPhoneNo1(phoneno_o1)
		.enterMobileNo2(mobile_o1)
		.waitproperty()
		.enterName2(name_o2)
		.enterAddress1(address_o2)
		.selectState1(state_o2)
		.selectCity1(dist2)
		.enterEmailId(emailid_o2)
		.enterPhoneNo1(phoneno_o2)
		.enterMobileNo2(mobile_o2)
		.clickAdd()
		;
		
	}

}
