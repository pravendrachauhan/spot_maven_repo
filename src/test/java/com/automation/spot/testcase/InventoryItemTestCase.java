package com.automation.spot.testcase;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryItemTestCase extends BaseTestCase
{
	//	private String homeAddress="";

	@Test(priority=401)
	public void launchPlacesScreen(){
		loginIntoApp(emailId, password);
		getInventoryScreen();
		Assert.assertTrue(inventoryScreen.getNavigationHeader().getText().equalsIgnoreCase("INVENTORY"));
	}

	@Test(priority=402)
	public void verifyBackArrowPresence(){
		Assert.assertTrue(inventoryScreen.getBackArrow().isDisplayed());
	}

	@Test(priority=403)
	public void verifyTagInfoOptionPresence() throws Exception{
		boolean status=false;
		inventoryScreen.tapOnThreeVerticalDots();
		for(WebElement el: inventoryScreen.getListOfOptionsInVerticalDot()){
			if(el.getText().equalsIgnoreCase("Tag Info")){
				status=true;
				break;
			}
		}
		Assert.assertTrue(status);
	}

	@Test(priority=404)
	public void verifySwapTagOptionPresence(){
		boolean status=false;
		for(WebElement el: inventoryScreen.getListOfOptionsInVerticalDot()){
			if(el.getText().equalsIgnoreCase("Swap Tag")){
				status=true;
				break;
			}
		}
		Assert.assertTrue(status);
	}

	@Test(priority=405)
	public void verifyDeleteItemOptionPresence(){
		boolean status=false;
		for(WebElement el: inventoryScreen.getListOfOptionsInVerticalDot()){
			if(el.getText().equalsIgnoreCase("Delete person")){
				status=true;
				break;
			}
		}
		Assert.assertTrue(status);
	}
	
	@Test(priority=406)
	public void verifyDeleteItemOptionFunctionality() throws Exception{
		inventoryScreen.clickOnDeleteItemOption();
		//verify text
		Assert.assertTrue(inventoryScreen.getTextOnPopup().contains("Are you sure you want to delete person?"));
//		inventoryScreen.tapOnCancelButton();
	}
	

}
