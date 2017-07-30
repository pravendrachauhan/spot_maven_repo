package com.automation.spot.testcase;


import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestCase extends BaseTestCase
{
	@Test
	public void loginIntoApp(){
			Assert.assertTrue(launchScreen.verifyLaunchScreen());
			
			launchScreen.tapOnLoginButton();
			Assert.assertTrue(loginScreen.verifyLoginScreen());
			
			loginScreen.enterTextIntoEmailField(emailId);
			loginScreen.enterTextIntoPasswordField(password);
			loginScreen.tapOnLogin();
			Assert.assertTrue(loginScreen.getDashboardScreenSource());
	}

}
