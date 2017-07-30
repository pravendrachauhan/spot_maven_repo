package com.automation.spot.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GetDirectionsTestCase extends BaseTestCase
{
	@Test(priority=701)
	public void verifyGetDirectionButton() throws InterruptedException{
		loginIntoApp(emailId, password);
		//tap on center of screen, will change the logic later on
		Thread.sleep(5000);
		dashboardScreen.tapOnMiddleLocation();
		
		//verification part
		Assert.assertTrue(locationScreen.getGetDirectionButton().getText().equalsIgnoreCase("GET\nDIRECTIONS"));
	}

	@Test(priority=702)
	public void verifyCloseIconPresence(){
		Assert.assertTrue(locationScreen.getCloseIconOnSpotMap().isDisplayed());
	}
	
	@Test(priority=703)
	public void verifyMyLocationDotPresence(){
		Assert.assertTrue(locationScreen.getMyLocationDotOnSpotMap().isDisplayed());
	}
	
	
	@Test(priority=704)
	public void verifyGetDirectionOpenMaps(){
		locationScreen.tapOnGetDirectionButton();
		Assert.assertTrue(locationScreen.getGoogleMapItem().isDisplayed());
		locationScreen.performAndroidBack();
	}
	

}
