package com.automation.spot.pages;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.automation.spot.OR.DashboardScreen_OR;
import com.automation.spot.OR.ItemsScreen_OR;
import com.automation.spot.OR.LaunchScreen_OR;
import com.automation.spot.OR.PlacesScreen_OR;


public class PlacesScreen extends BasePage{
	public WebElement getPlusIconToAddPlaces(){
		return functionLibrary.getElement("Id,"+PlacesScreen_OR.plusIconToAddMore);
	}
	
	public WebElement getSearchBox(){
		return functionLibrary.getElement("Id,"+PlacesScreen_OR.searchBox);
	}
	public WebElement getEditSearchBox(){
		functionLibrary.getElement("Id,"+PlacesScreen_OR.searchBox).click();
		return functionLibrary.getElement("Id,"+PlacesScreen_OR.editSearchBox);
	}
	
	
	public List<? extends WebElement> getQuickPlacesSet(){
		return functionLibrary.getElementList("Id,"+PlacesScreen_OR.quickPlaceSetTag);
	}
	
	public List<? extends WebElement> getQuickPlacesUnSet(){
		return functionLibrary.getElementList("Id,"+PlacesScreen_OR.quickPlaceUnsetTag);
	}


	public void tapOnPlusIcon() throws Exception {
		functionLibrary.clickOnGivenElement(getPlusIconToAddPlaces());
	}
	
	public void clickOnAddSchoolUnsetTag() throws InterruptedException {
		for(WebElement el: getQuickPlacesUnSet()){
			if(el.getText().equalsIgnoreCase("ADD SCHOOL")){
				el.click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void clickOnAddHomeUnsetTag() throws InterruptedException {
		for(WebElement el: getQuickPlacesUnSet()){
			if(el.getText().equalsIgnoreCase("ADD HOME")){
				el.click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void clickOnAddWorkUnsetTag() throws InterruptedException {
		for(WebElement el: getQuickPlacesUnSet()){
			if(el.getText().equalsIgnoreCase("ADD WORK")){
				el.click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void enterAddressIntoSearchBox(String address) throws Exception{
		functionLibrary.enterTextIntoGivenTextBox(getEditSearchBox(), address);
		tapOnBackArrow();
	}


	//	public boolean verifyLaunchScreen(){
	//		return functionLibrary.isElementPresent(getLoginButton())
	//				&& functionLibrary.isElementPresent(getSignUpButton());
	//	}
}