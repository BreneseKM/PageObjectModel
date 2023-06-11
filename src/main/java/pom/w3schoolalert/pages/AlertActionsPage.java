package pom.w3schoolalert.pages;

import wrappers.GenericWrappers;

public class AlertActionsPage extends GenericWrappers{
	
	public static String alertText = null;
	
	public W3SchoolsAlertPage acceptTheAlert() {
		acceptAlert();
		return new W3SchoolsAlertPage();
	}
	
	public W3SchoolsAlertPage dismissTheAlert() {
		dismissAlert();
		return new W3SchoolsAlertPage();
	} 
	
	public AlertActionsPage enterTheDataInAlert(String data) {
		enterDataInToAlert(data);
		return new AlertActionsPage();
	}

	
   public AlertActionsPage getTextFromAlert() {
		alertText = getAlertText();
		System.out.println(alertText);
		return new AlertActionsPage();
	}
	
}
