package com.automation.spot.testcase;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryTagTestCase extends BaseTestCase
{
	//	private String homeAddress="";

	@Test(priority=501)
	public void launchInventoryScreen() throws Exception{
		loginIntoApp(emailId, password);
		getInventoryScreen();
		Assert.assertTrue(inventoryScreen.getNavigationHeader().getText().equalsIgnoreCase("INVENTORY"));
	}

	@Test(priority=502)
	public void verifyBackArrowPresence(){
		Assert.assertTrue(inventoryScreen.getBackArrow().isDisplayed());
	}
	
	@Test(priority=503)
	public void verifyTagsTabClickable() throws InterruptedException{
		inventoryScreen.clickOnTagsTab();
		Assert.assertTrue(inventoryScreen.getTagItemText().get(0).getText().contains("Tag"));
	}
	
	@Test(priority=504)
	public void verifySpotSomethingElsePresence() throws Exception{
		boolean status=false;
		inventoryScreen.tapOnThreeVerticalDots();
		for(WebElement el: inventoryScreen.getListOfOptionsInVerticalDot()){
			if(el.getText().equalsIgnoreCase("Spot Something Else")){
				status=true;
				break;
			}
		}
		Assert.assertTrue(status);
	}
	
	@Test(priority=505)
	public void verifyDeleteTagPresence() throws Exception{
		boolean status=false;
		for(WebElement el: inventoryScreen.getListOfOptionsInVerticalDot()){
			if(el.getText().equalsIgnoreCase("Delete Tag")){
				status=true;
				break;
			}
		}
		Assert.assertTrue(status);
	}

	@Test(priority=506)
	public void verifyDeleteTagFunctionality() throws Exception{
		for(WebElement el: inventoryScreen.getListOfOptionsInVerticalDot()){
			if(el.getText().equalsIgnoreCase("Delete Tag")){
				el.click();
				break;
			}
		}
		//verify text
		Assert.assertTrue(inventoryScreen.getTextOnPopup().contains("Are you sure you want to delete"));
//		inventoryScreen.tapOnCancelButton();
	}
	
}
