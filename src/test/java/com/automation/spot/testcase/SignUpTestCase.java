package com.automation.spot.testcase;


import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTestCase extends BaseTestCase
{
	@Test(priority=601)
	public void verifySignUpScreenOnTappingOnSignUp(){
			Assert.assertTrue(launchScreen.verifyLaunchScreen());
			launchScreen.tapOnSignupButton();
			Assert.assertTrue(signupScreen.verifySignupScreen());
	}
	
	@Test(priority=602)
	public void verifyCreateAccountBySignUp(){
			signupScreen.enterTextIntoEmailField(newemailId);
			System.out.println("going to created id: "+newemailId);
			signupScreen.enterTextIntoPasswordField(password);
			signupScreen.enterTextIntoConfirmPasswordField(confirmPassword);
			signupScreen.tapOnCreateAccount();
			String verificationTextOnScreen=signupScreen.getVerificationText();
			String expectedVerificationText="Verification has been sent to "+newemailId;
			Assert.assertTrue(verificationTextOnScreen.equalsIgnoreCase(expectedVerificationText));
			System.out.println("created id: "+newemailId);
	}

	@Test(priority=603, dependsOnMethods={"verifyCreateAccountBySignUp"})
	public void verifySignInIntoAppUsingCreatedAccount(){
			signupScreen.tapOnSignInButton();
			loginScreen.enterTextIntoEmailField(newemailId);
			loginScreen.enterTextIntoPasswordField(password);
			loginScreen.tapOnLogin();
			Assert.assertTrue(loginScreen.getDashboardScreenSource());
	}
}
