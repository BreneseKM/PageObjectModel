package pom.irctc.pages;

import wrappers.GenericWrappers;

public class OtpVerifyHotelPage extends GenericWrappers {
	
	public OtpVerifyHotelPage enterOtp(String data)
	{
		enterByXpath("//input[@name='otp']", data);
		return new OtpVerifyHotelPage();
	}

	public OtpVerifyHotelPage clickVerifyOtp()
	{
		clickByXpath("//button[text()='Verify']");
		return new OtpVerifyHotelPage();
	}
	public OtpVerifyHotelPage verifyOtp(String data)
	{
		verifyTextByXpath("//span[text()='otp is required.']", data);
		return new OtpVerifyHotelPage();
	}
	public OtpVerifyHotelPage waitproperty()
	{
		waitproperty(5000);
		return new OtpVerifyHotelPage();
	}
}
