package com.automation.spot.pages;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.automation.spot.OR.DashboardScreen_OR;
import com.automation.spot.OR.InventoryScreen_OR;
import com.automation.spot.OR.ItemsScreen_OR;
import com.automation.spot.OR.LaunchScreen_OR;
import com.automation.spot.OR.PlacesScreen_OR;


public class InventoryScreen extends BasePage{
	
	public List<? extends WebElement> getListOfOptionsInVerticalDot(){
		return functionLibrary.getElementList("Id,"+InventoryScreen_OR.verticalDotOptionList);
	}

//	public void tapOnPlusIcon() throws Exception {
//		functionLibrary.clickOnGivenElement(getPlusIconToAddPlaces());
//	}
	public List<? extends WebElement> getListOfTabs(){
		return functionLibrary.getElementList("Xpath,"+InventoryScreen_OR.tabXpath);
	}
	
	public List<? extends WebElement> getTagItemText(){
		return functionLibrary.getElementList("Id,"+InventoryScreen_OR.archievedItemTagText);
	}
	
	
	public void clickOnTagInfoOption() throws InterruptedException {
		for(WebElement el: getListOfOptionsInVerticalDot()){
			if(el.getText().equalsIgnoreCase("Tag Info")){
				el.click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void clickOnSwapTagOption() throws InterruptedException {
		for(WebElement el: getListOfOptionsInVerticalDot()){
			if(el.getText().equalsIgnoreCase("Swap Tag")){
				el.click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void clickOnDeleteItemOption() throws InterruptedException {
		for(WebElement el: getListOfOptionsInVerticalDot()){
			if(el.getText().contains("Delete")){
				el.click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void clickOnItemsTab() throws InterruptedException {
		for(WebElement el: getListOfTabs()){
			if(el.getText().contains("ITEMS")){
				el.click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void clickOnTagsTab() throws InterruptedException {
		for(WebElement el: getListOfTabs()){
			if(el.getText().contains("TAGS")){
				el.click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public String getTextOnPopup(){
		return functionLibrary.getElement("Id,"+InventoryScreen_OR.messageTextOnPopup).getText();
	}
	
}