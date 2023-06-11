package pom.w3schoolalert.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.w3schoolalert.pages.W3SchoolsAlertPage;
import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC012";
		testCaseDescription="To verify promptAlert";
		author="Brenese";
		category="smoke";
		browserName="chrome";
		url="http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		sheetName="TC012";
	}
	@Test
	
	public void prompt()
	{
		new W3SchoolsAlertPage()
		.switchToFrame()
		.clickTryIt()
		.enterTheDataInAlert("Brenese")
		.getTextFromAlert()
		.acceptTheAlert()
		.verifyTextName("Brenese")
		.clickRefresh()
		.waitProperty()
		.switchToFrame()
		.clickTryIt()
		.enterTheDataInAlert("Brenese")
		.getTextFromAlert()
		.dismissTheAlert()
		.verifyTextNameCancel("Brenese")
		.switchToDefaultContent()
		.clickHome()
		;
		
	}

}
