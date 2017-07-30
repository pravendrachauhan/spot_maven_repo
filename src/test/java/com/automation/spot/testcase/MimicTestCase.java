package com.automation.spot.testcase;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.spot.utils.DriverInit;

public class MimicTestCase extends BaseTestCase
{
	@Test
	public void mimimTestFlow(){
		try {
			//close spot app and open mimic app
			DriverInit.closeDriver();
			serviceClient.stop();
			startAppium();
			DriverInit.startDriverForMimicApp();

			//perform action on mimic app
			miminAppScreen.tapOnUTprovisionButton();

			miminAppScreen.tapOnCreateUTDeviceButton();
			String imei = miminAppScreen.getTextFromIMEINumberCopyTextBox();
			miminAppScreen.performAndroidBack();

			miminAppScreen.tapOnUploadLocationsButton();

			miminAppScreen.getIMEINumberPasteTextBox().sendKeys(imei);
			miminAppScreen.tapOnFirstLocationRadioButton();
			miminAppScreen.tapOnSendButton();

			serviceClient.stop();
			startAppium();
			DriverInit.startDriver();

			Assert.assertTrue(launchScreen.verifyLaunchScreen());

			launchScreen.tapOnLoginButton();
			Assert.assertTrue(loginScreen.verifyLoginScreen());

			loginScreen.enterTextIntoEmailField(emailId);
			loginScreen.enterTextIntoPasswordField(password);
			loginScreen.tapOnLogin();
	
			activateTagScreen.tapOnActivateAtagIcon();
			activateTagScreen.tapOnEnterTagIdManuallyButton();
			activateTagScreen.enterTextIntoTagField(imei);
			activateTagScreen.tapOnEnterButton();
			
			//verify message remaining
			
			activateTagScreen.tapOnContinueButton();
			
			//click on bag field remaining
			
			activateTagScreen.enterTextIntoBagField("New Bag");
			activateTagScreen.tapOnDoneButtonOnNewBag();

			activateTagScreen.tapOnAddPhotoLaterButtonOnNewBag();
			//choose photo remaining
			
			activateTagScreen.tapOnDoThisLaterButtonAtLast();
			//add notification remaining
			
			activateTagScreen.tapOnDoneButtonAtFinish();
			
			//verify tag activated on dashboard remaining

		} catch (Exception e) {
			System.out.println("In Exception");
		}
	}

}
