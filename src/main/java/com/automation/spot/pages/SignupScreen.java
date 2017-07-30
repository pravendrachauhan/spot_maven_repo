package com.automation.spot.pages;

import org.openqa.selenium.WebElement;

import com.automation.spot.OR.LaunchScreen_OR;
import com.automation.spot.OR.LoginScreen_OR;
import com.automation.spot.OR.SignupScreen_OR;


public class SignupScreen extends BasePage{
	public WebElement getEmailField(){
		return functionLibrary.getElement("Id,"+SignupScreen_OR.EmailTxtBox);
	}
	
	public WebElement getPasswordField(){
		return functionLibrary.getElement("Id,"+SignupScreen_OR.PasswordTxtBox);
	}
	
	public WebElement getConfirmPasswordField(){
		return functionLibrary.getElement("Id,"+SignupScreen_OR.ConfirmPasswordTxtBox);
	}
	
	public WebElement getCreateAccountBtn(){
		return functionLibrary.getElement("Id,"+SignupScreen_OR.CreateAccount_Button);
	}
	
	public void enterTextIntoEmailField(String emailId){
		functionLibrary.enterTextIntoGivenTextBox(getEmailField(), emailId);
	}
	
	public void enterTextIntoPasswordField(String password){
		functionLibrary.enterTextIntoGivenTextBox(getPasswordField(), password);
	}
	
	public void enterTextIntoConfirmPasswordField(String password){
		functionLibrary.enterTextIntoGivenTextBox(getConfirmPasswordField(), password);
	}
	
	public void tapOnCreateAccount(){
		functionLibrary.clickOnGivenElement(getCreateAccountBtn());
		functionLibrary.waitTime(15000);
	}
	
	public boolean verifySignupScreen(){
		return functionLibrary.isElementPresent(getEmailField())
				&& functionLibrary.isElementPresent(getPasswordField())
					&& functionLibrary.isElementPresent(getConfirmPasswordField())
						&& functionLibrary.isElementPresent(getCreateAccountBtn());
	}
	
	//Verification screen
	
	public WebElement getVerificationTextElement(){
		return functionLibrary.getElement("Id,"+SignupScreen_OR.VerificationText);
	}
	
	public WebElement getResendEmailBtn(){
		return functionLibrary.getElement("Id,"+SignupScreen_OR.ResendEmail_Button);
	}
	
	public WebElement getSignInBtn(){
		return functionLibrary.getElement("Id,"+SignupScreen_OR.Signin_Button);
	}
	
	public String getVerificationText(){
		return functionLibrary.getTextFromGivenElement(getVerificationTextElement());
	}
	
	public void tapOnResendEmailButton(){
		functionLibrary.clickOnGivenElement(getResendEmailBtn());
	}
	
	public void tapOnSignInButton(){
		functionLibrary.clickOnGivenElement(getSignInBtn());
	}
	
		
}