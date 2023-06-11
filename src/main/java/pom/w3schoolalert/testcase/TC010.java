package pom.w3schoolalert.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.w3schoolalert.pages.HomePage;
import pom.w3schoolalert.pages.W3SchoolsAlertPage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers {
	
	
		@BeforeClass
		public void beforeClass()
		{
			testCaseName="TC010";
			testCaseDescription="To verify simpleAlert";
			author="Brenese";
			category="smoke";
			browserName="chrome";
			url="http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
			sheetName="TC010";
			
		}
		@Test

	public void simpleAlert()
	{
		new W3SchoolsAlertPage()
		.switchToFrame()
		.clickTryIt()
		.getTextFromAlert()
		.acceptTheAlert()
		.switchToDefaultContent()
		.clickHome()
		;
		
		
		
		
	}
	}
