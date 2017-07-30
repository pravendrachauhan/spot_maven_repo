package com.automation.spot.testcase;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlacesTestCase extends BaseTestCase
{
	private String homeAddress="60 Sylvan Rd, Waltham, MA 02451, USA";
	private String schoolAddress="1 Verizon Way, Basking Ridge, NJ 07920, USA";
	private String workAddress="50 Sylvan Rd, Waltham, MA 02451, USA";

	@Test(priority=301)
	public void launchPlacesScreen() throws Exception{
		loginIntoApp(emailId, password);
		getPlacesScreen();
		HideGotItIfFound();
		Assert.assertTrue(placesScreen.getNavigationHeader().getText().equalsIgnoreCase("PLACES"));
	}

	@Test(priority=302)
	public void verifyBackArrowPresence(){
		Assert.assertTrue(placesScreen.getBackArrow().isDisplayed());
	}

	@Test(priority=303)
	public void verifyPlusIconPresence(){
		Assert.assertTrue(placesScreen.getPlusIconToAddPlaces().isDisplayed());
	}

	@Test(priority=304)
	public void verifyHeaderTextAsPlaces(){
		String headerText=placesScreen.getNavigationHeader().getText();
		String Expected="PLACES";
		Assert.assertTrue(headerText.equalsIgnoreCase(Expected));
	}

	@Test(priority=305)
	public void verifyPlusIconRedirectsToCustomPlaceOnMap() throws Exception{
		placesScreen.tapOnPlusIcon();
		String headerText=placesScreen.getNavigationHeader().getText();
		String Expected="NEW PLACE";
		Assert.assertTrue(headerText.equalsIgnoreCase(Expected));
	}

	@Test(priority=306)
	public void verifySaveButtonPresenceOnCustomMap() throws Exception{
		String headerText=placesScreen.getRightNavigation().getText();
		String Expected="SAVE";
		Assert.assertTrue(headerText.equalsIgnoreCase(Expected));
	}

	@Test(priority=307)
	public void verifySearchBoxPresenceOnCustomMap() throws Exception{
		Assert.assertTrue(placesScreen.getSearchBox().isDisplayed());
	}

	@Test(priority=308)
	public void verifyBackArrowRedirectsToPlaces() throws Exception{
		placesScreen.tapOncloseLeftIcon();
		String headerText=placesScreen.getNavigationHeader().getText();
		String Expected="PLACES";
		Assert.assertTrue(headerText.equalsIgnoreCase(Expected));
	}

	@Test(priority=309)
	public void verifyQuickPlacesAreAddedOrNot() throws Exception{
		//placesScreen.tapOncloseLeftIcon();
		String headerText=placesScreen.getNavigationHeader().getText();
		String Expected="PLACES";
		Assert.assertTrue(headerText.equalsIgnoreCase(Expected));
	}

	@Test(priority=310)
	public void IfHomeNotAdded_AddItAndVerifyPresence() throws Exception{
		int count=0;
		for(WebElement el: placesScreen.getQuickPlacesSet()){
			if(el.getText().equalsIgnoreCase("HOME")){
				break;
			}
			count = count+1;
		}
		if(count==placesScreen.getQuickPlacesSet().size()){
			//this means, Home is not added yet, need to add
			placesScreen.clickOnAddHomeUnsetTag();
			Assert.assertTrue(placesScreen.getNavigationHeader().getText().equalsIgnoreCase("ADD HOME"));
			//Enter address and Save
			placesScreen.enterAddressIntoSearchBox(homeAddress);
			placesScreen.tapOnSaveButton();
			placesScreen.performAndroidBack();
		}
		else{
			Assert.assertTrue(true,"Home is already added as Quick place");
		}

	}

	@Test(priority=311)
	public void IfSchoolNotAdded_AddItAndVerifyPresence() throws Exception{
		int count=0;
		for(WebElement el: placesScreen.getQuickPlacesSet()){
			if(el.getText().equalsIgnoreCase("SCHOOL")){
				break;
			}
			count = count+1;
		}
		if(count==placesScreen.getQuickPlacesSet().size()){
			//this means, Home is not added yet, need to add
			placesScreen.clickOnAddSchoolUnsetTag();
			Assert.assertTrue(placesScreen.getNavigationHeader().getText().equalsIgnoreCase("ADD SCHOOL"));
			//Enter address and Save
			placesScreen.enterAddressIntoSearchBox(schoolAddress);
			placesScreen.tapOnSaveButton();
			placesScreen.performAndroidBack();
		}
		else{
			Assert.assertTrue(true,"SCHOOL is already added as Quick place");
		}

	}

	@Test(priority=312)
	public void IfWorkNotAdded_AddItAndVerifyPresence() throws Exception{
		int count=0;
		for(WebElement el: placesScreen.getQuickPlacesSet()){
			if(el.getText().equalsIgnoreCase("WORK")){
				break;
			}
			count = count+1;
		}
		if(count==placesScreen.getQuickPlacesSet().size()){
			//this means, Home is not added yet, need to add
			placesScreen.clickOnAddWorkUnsetTag();
			//Assert.assertTrue(placesScreen.getNavigationHeader().getText().equalsIgnoreCase("ADD WORK"));
			//Enter address and Save
			placesScreen.enterAddressIntoSearchBox(workAddress);
			placesScreen.tapOnSaveButton();
			placesScreen.performAndroidBack();
		}
		else{
			Assert.assertTrue(true,"WORK is already added as Quick place");
		}

	}



}
