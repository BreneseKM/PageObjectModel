package pom.w3schoolalert.pages;

import wrappers.GenericWrappers;

public class W3SchoolsAlertPage extends GenericWrappers {
	
	public W3SchoolsAlertPage switchToFrame()
	{
		switchToframeXpath("//iframe[@id='iframeResult']");
		return new W3SchoolsAlertPage();
	}
	
	public AlertActionsPage clickTryIt()
	{
		clickByXpathNoSnap("//button[text()='Try it']");
		return new AlertActionsPage();
	}
	public HomePage clickHome()
	{
		clickByXpath("//a[@id='tryhome']");
		return new HomePage();
	}
	public W3SchoolsAlertPage clickRefresh()
	{
			refresh();
			return new W3SchoolsAlertPage();
	}
	public W3SchoolsAlertPage switchToDefaultContent()
	{
		switchTodefault();
		return new W3SchoolsAlertPage();
	}
	public W3SchoolsAlertPage verifyTextOk(String data)
	{
		verifyTextContainsByXpath("//p[text()='You pressed OK!']", data);
		return new W3SchoolsAlertPage();
	}
	public W3SchoolsAlertPage verifyTextCancel(String data)
	{
		verifyTextContainsByXpath("//p[text()='You pressed Cancel!']", data);
		return new W3SchoolsAlertPage();
	}
	public W3SchoolsAlertPage verifyTextName(String data)
	{
		verifyTextContainsByXpath("//p[text()='Hello Brenese! How are you today?']", data);
		return new W3SchoolsAlertPage();
	}
	public W3SchoolsAlertPage verifyTextNameCancel(String data)
	{
		verifyTextContainsByXpath("//p[text()='User cancelled the prompt.']", data);
		return new W3SchoolsAlertPage();
	}
	public W3SchoolsAlertPage waitProperty()
	{
		waitproperty(5000);
		return new W3SchoolsAlertPage();
	}
	public W3SchoolsAlertPage waitproperty()
	{
		waitproperty(9000);
		return new W3SchoolsAlertPage();
	}
    
}
