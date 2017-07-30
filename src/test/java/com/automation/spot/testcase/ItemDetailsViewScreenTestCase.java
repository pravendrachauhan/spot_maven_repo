package com.automation.spot.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ItemDetailsViewScreenTestCase extends BaseTestCase
{
	@Test(priority=501)
	public void verifyItemViewScreen() throws Exception{
		loginIntoApp(emailId, password);
		//tap on center of screen, will change the logic later on
		dashboardScreen.tapOnMiddleLocation();
		//tap up on Item link
		dashboardScreen.tapOnItemLink("AUTOMATION");

		dashboardScreen.tapOnSpecificItemLink();

		itemsScreen.tapOnNewNotificationLink();

		//verification part for details
		Assert.assertTrue(itemsScreen.getNavigationHeader().getText().equalsIgnoreCase("NEW NOTIFICATION"));
	}

	@Test(priority=502)
	public void verifyCrossIconPresence(){
		Assert.assertTrue(itemsScreen.getBackArrow().isDisplayed());
	}
	
	@Test(priority=503)
	public void verifyNotifyMeText(){
		Assert.assertTrue(itemsScreen.getNotifyMeHeaderTxtElement().getText().contains("Notify me if"));
	}
	
	@Test(priority=504)
	public void verifyIsAtPlaceNotificationPresence(){
		Assert.assertTrue(itemsScreen.getAddNotificationIconList().get(0).getText().equalsIgnoreCase("IS AT A PLACE"));
	}
	
	@Test(priority=505)
	public void verifyIsAwayFromPlaceNotificationPresence(){
		Assert.assertTrue(itemsScreen.getAddNotificationIconList().get(1).getText().equalsIgnoreCase("IS AWAY FROM A PLACE"));
	}
	
	@Test(priority=506)
	public void verifyChangesLocationNotificationPresence(){
		Assert.assertTrue(itemsScreen.getAddNotificationIconList().get(2).getText().equalsIgnoreCase("CHANGES LOCATION"));
	}
	
	@Test(priority=507)
	public void verifyIsAwayFromHomeSuggestionPresence(){
		Assert.assertTrue(itemsScreen.getSuggestionNotificationIconList().get(0).getText().contains("is away from Home"));
	}
	
	@Test(priority=508)
	public void verifyIsAtWorkSuggestionPresence(){
		Assert.assertTrue(itemsScreen.getSuggestionNotificationIconList().get(1).getText().contains("is at Work"));
	}
	
	@Test(priority=509)
	public void verifyChangesLocationSuggestionPresence(){
		Assert.assertTrue(itemsScreen.getSuggestionNotificationIconList().get(2).getText().contains("changes location"));
	}

	@Test(priority=510)
	public void verifyIsAtPlaceNotificationScreen(){
		itemsScreen.getAddNotificationIconList().get(0).click();
//		waitTime(5000);
//		boolean isAtAPlaceDropDown=;
//		boolean duringATimeDropDown=;
	}
}
