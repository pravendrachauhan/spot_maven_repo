package com.automation.spot.pages;

import org.openqa.selenium.WebElement;

import com.automation.spot.OR.LaunchScreen_OR;
import com.automation.spot.OR.LoginScreen_OR;
import com.automation.spot.OR.MimicAppScreen_OR;


public class MiminAppScreen extends BasePage{
	public WebElement getUTprovisionButton(){
		return functionLibrary.getElement("Id,"+MimicAppScreen_OR.UTprovisionButton);
	}
	
	public void tapOnUTprovisionButton() throws Exception{
		functionLibrary.clickOnGivenElement(getUTprovisionButton());
	}
	
	public WebElement getUploadLocationsButton(){
		return functionLibrary.getElement("Id,"+MimicAppScreen_OR.UploadLocationsButton);
	}
	
	public void tapOnUploadLocationsButton() throws Exception{
		functionLibrary.clickOnGivenElement(getUploadLocationsButton());
	}
	
	public WebElement getCreateUTDeviceButton(){
		return functionLibrary.getElement("Id,"+MimicAppScreen_OR.CreateUTDeviceButton);
	}
	
	public void tapOnCreateUTDeviceButton() throws Exception{
		functionLibrary.clickOnGivenElement(getCreateUTDeviceButton());
	}
	
	public WebElement getIMEINumberCopyTextBox(){
		return functionLibrary.getElement("Id,"+MimicAppScreen_OR.IMEINumberCopyTextBox);
	}
	
	public String getTextFromIMEINumberCopyTextBox() throws Exception{
		return functionLibrary.getTextFromGivenElement(getIMEINumberCopyTextBox());
	}
	
	public WebElement getIMEINumberPasteTextBox(){
		return functionLibrary.getElement("Id,"+MimicAppScreen_OR.IMEINumberPasteTextBox);
	}
	
	public String getTextFromIMEINumberPasteTextBox() throws Exception{
		return functionLibrary.getTextFromGivenElement(getIMEINumberPasteTextBox());
	}
	
	
	public WebElement getFirstLocationRadioButton(){
		return functionLibrary.getElement("Id,"+MimicAppScreen_OR.FirstLocationRadioButton);
	}
	
	public void tapOnFirstLocationRadioButton() throws Exception{
		functionLibrary.clickOnGivenElement(getFirstLocationRadioButton());
	}
	
	public WebElement getSendButton(){
		return functionLibrary.getElement("Id,"+MimicAppScreen_OR.SendButton);
	}
	
	public void tapOnSendButton() throws Exception{
		functionLibrary.clickOnGivenElement(getSendButton());
	}

	
}