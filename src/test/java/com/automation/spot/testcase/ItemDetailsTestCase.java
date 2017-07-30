package com.automation.spot.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ItemDetailsTestCase extends BaseTestCase
{
	@Test(priority=201)
	public void verifyItemDetailsScreen(){
		loginIntoApp(emailId, password);
		//tap on center of screen, will change the logic later on
		dashboardScreen.tapOnMiddleLocation();
		//tap up on Item link
		dashboardScreen.tapOnItemLink("AUTOMATION");

		dashboardScreen.tapOnSpecificItemLink();

		itemsScreen.tapOnDetailsLink();

		//verification part for details
		Assert.assertTrue(itemsDetailsScreen.verifyItemDetailsScreen());

	}

	@Test(priority=202)
	public void verifyBackArrowPresence(){
		Assert.assertTrue(itemsDetailsScreen.getBackArrow().isDisplayed());
	}
	
	@Test(priority=203)
	public void verifySaveButtonPresence(){
		Assert.assertTrue(itemsDetailsScreen.getSaveButton().isDisplayed());
	}
	
	@Test(priority=204)
	public void verifySelectedColoredCirclePresence(){
		Assert.assertTrue(itemsDetailsScreen.getSelectedColoredCircle().isDisplayed());
	}
	
	@Test(priority=205)
	public void verifyHeaderColor(){
		String headerColor=itemsDetailsScreen.getNavigationHeader().getCssValue("background-color");
//		String headerColor=itemsDetailsScreen.getNavigationHeader().getAttribute("background-color");
		System.out.println(headerColor);
//		String selectedCircleColor=itemsDetailsScreen.getSelectedColoredCircle().getCssValue("background-color");
		String selectedCircleColor=itemsDetailsScreen.getSelectedColoredCircle().getCssValue("background-color");

		Assert.assertTrue(headerColor.equals(selectedCircleColor));
	}
	
	@Test(priority=206)
	public void verifyTextIsEditableOnTapping() throws Exception{
		itemsDetailsScreen.tapOnItemTextToEdit();
		Assert.assertTrue(itemsDetailsScreen.getEditItemTextElement().isDisplayed());
	}
	
	@Test(priority=207)
	public void verifySaveButtonGetsEnabledOnModifyingText() throws Exception{
		Assert.assertFalse(itemsDetailsScreen.getSaveButton().isEnabled());
		itemsDetailsScreen.typeTextIntoEditItemText("AUTOMATION_NEW");
		Assert.assertTrue(itemsDetailsScreen.getSaveButton().isEnabled());
	}
	
	@Test(priority=208)
	public void verifySaveButtonSavesItemText() throws Exception{
		itemsDetailsScreen.tapOnSaveButton();
		String newText=itemsDetailsScreen.getTextOfItemText();
		Assert.assertTrue(newText.equalsIgnoreCase("AUTOMATION_NEW"));
		//need to reset to previous text
		itemsDetailsScreen.tapOnItemTextToEdit();
		itemsDetailsScreen.typeTextIntoEditItemText("AUTOMATION");
		itemsDetailsScreen.tapOnSaveButton();
	}
	
	@Test(priority=209)
	public void verifyDiscardPopupOnPressingBack() throws Exception{
		itemsDetailsScreen.tapOnItemTextToEdit();
		itemsDetailsScreen.typeTextIntoEditItemText("AUTOMATION1");
		itemsDetailsScreen.tapOnBackArrow();
		Assert.assertTrue(itemsDetailsScreen.getDiscardButton().isDisplayed());
	}
	
	@Test(priority=210)
	public void verifyCancelPopupOnPressingBack() throws Exception{
		Assert.assertTrue(itemsDetailsScreen.getCancelButton().isDisplayed());
	}
	
	@Test(priority=211)
	public void verifyTextOnDiscardPopupOnPressingBack() throws Exception{
//		Assert.assertTrue(itemsDetailsScreen.getCancelButton().isDisplayed());
	}
	
	@Test(priority=212)
	public void verifyPurpleColorIsAbleToSelect() throws Exception{
		itemsDetailsScreen.tapOnPurpleColoredCircle();
		itemsDetailsScreen.tapOnSaveButton();
		String headerColor=itemsDetailsScreen.getNavigationHeader().getCssValue("background-color");
		String selectedCircleColor=itemsDetailsScreen.getSelectedColoredCircle().getCssValue("background-color");
		Assert.assertTrue(headerColor.equals(selectedCircleColor));
	}
	
	@Test(priority=213)
	public void verifyOrangeColorIsAbleToSelect() throws Exception{
		itemsDetailsScreen.tapOnOrangeColoredCircle();
		itemsDetailsScreen.tapOnSaveButton();
		String headerColor=itemsDetailsScreen.getNavigationHeader().getCssValue("background-color");
		String selectedCircleColor=itemsDetailsScreen.getSelectedColoredCircle().getCssValue("background-color");
		Assert.assertTrue(headerColor.equals(selectedCircleColor));
	}
	
	@Test(priority=214)
	public void verifyBlueColorIsAbleToSelect() throws Exception{
		itemsDetailsScreen.tapOnBlueColoredCircle();
		itemsDetailsScreen.tapOnSaveButton();
		String headerColor=itemsDetailsScreen.getNavigationHeader().getCssValue("background-color");
		String selectedCircleColor=itemsDetailsScreen.getSelectedColoredCircle().getCssValue("background-color");
		Assert.assertTrue(headerColor.equals(selectedCircleColor));
	}
	
	@Test(priority=215)
	public void verifyMagentaColorIsAbleToSelect() throws Exception{
		itemsDetailsScreen.tapOnMagentaColoredCircle();
		itemsDetailsScreen.tapOnSaveButton();
		String headerColor=itemsDetailsScreen.getNavigationHeader().getCssValue("background-color");
		String selectedCircleColor=itemsDetailsScreen.getSelectedColoredCircle().getCssValue("background-color");
		Assert.assertTrue(headerColor.equals(selectedCircleColor));
	}
	
	@Test(priority=216)
	public void verifyGreenColorIsAbleToSelect() throws Exception{
		itemsDetailsScreen.tapOnGreenColoredCircle();
		itemsDetailsScreen.tapOnSaveButton();
		String headerColor=itemsDetailsScreen.getNavigationHeader().getCssValue("background-color");
		String selectedCircleColor=itemsDetailsScreen.getSelectedColoredCircle().getCssValue("background-color");
		Assert.assertTrue(headerColor.equals(selectedCircleColor));
	}
	
	@Test(priority=217)
	public void verifyRedColorIsAbleToSelect() throws Exception{
		itemsDetailsScreen.tapOnRedColoredCircle();
		itemsDetailsScreen.tapOnSaveButton();
		String headerColor=itemsDetailsScreen.getNavigationHeader().getCssValue("background-color");
		String selectedCircleColor=itemsDetailsScreen.getSelectedColoredCircle().getCssValue("background-color");
		Assert.assertTrue(headerColor.equals(selectedCircleColor));
	}
	
	@Test(priority=218)
	public void verifyYellowColorIsAbleToSelect() throws Exception{
		itemsDetailsScreen.tapOnYellowColoredCircle();
		itemsDetailsScreen.tapOnSaveButton();
		String headerColor=itemsDetailsScreen.getNavigationHeader().getCssValue("background-color");
		String selectedCircleColor=itemsDetailsScreen.getSelectedColoredCircle().getCssValue("background-color");
		Assert.assertTrue(headerColor.equals(selectedCircleColor));
	}
}
