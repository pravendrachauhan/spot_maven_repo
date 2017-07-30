package com.automation.spot.pages;

import org.openqa.selenium.WebElement;

import com.automation.spot.OR.LaunchScreen_OR;
import com.automation.spot.OR.LoginScreen_OR;


public class LoginScreen extends BasePage{
	public WebElement getEmailField(){
		return functionLibrary.getElement("Id,"+LoginScreen_OR.EmailTxtBox);
	}
	
	public WebElement getPasswordField(){
		return functionLibrary.getElement("Id,"+LoginScreen_OR.PasswordTxtBox);
	}
	
	public WebElement getLoginBtn(){
		return functionLibrary.getElement("Id,"+LoginScreen_OR.Login_Button);
	}
	
	public void enterTextIntoEmailField(String emailId){
		functionLibrary.enterTextIntoGivenTextBox(getEmailField(), emailId);
	}
	
	public void enterTextIntoPasswordField(String password){
		functionLibrary.enterTextIntoGivenTextBox(getPasswordField(), password);
	}
	
	public void tapOnLogin(){
		functionLibrary.clickOnGivenElement(getLoginBtn());
		functionLibrary.waitTime(5000);
	}
	
	public boolean verifyLoginScreen(){
		return functionLibrary.isElementPresent(getEmailField())
				&& functionLibrary.isElementPresent(getPasswordField())
					&& functionLibrary.isElementPresent(getLoginBtn());
	}
	public boolean getDashboardScreenSource(){
		functionLibrary.getSourceOfScreen();
		return true;
	}
	
}