package pom.w3schoolalert.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.w3schoolalert.pages.W3SchoolsAlertPage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers{
	

	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC011";
		testCaseDescription="To verify ConfirmationAlert";
		author="Brenese";
		category="smoke";
		browserName="chrome";
		url="http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
		sheetName="TC011";
	}
	@Test

	public void Confirmation()

	{
		new W3SchoolsAlertPage()
		.switchToFrame()
		.clickTryIt()
		.getTextFromAlert()
		.acceptTheAlert()
		.verifyTextOk("Ok")
		.clickTryIt()
		.getTextFromAlert()
		.acceptTheAlert()
		.clickRefresh()
		.waitProperty()
		.switchToFrame()
		.clickTryIt()
		.dismissTheAlert()
		.verifyTextCancel("Cancel")
		.switchToDefaultContent()
		.clickHome()
		;
		
	}
}
