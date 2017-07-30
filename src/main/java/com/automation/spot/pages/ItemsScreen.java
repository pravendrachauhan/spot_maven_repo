package com.automation.spot.pages;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.automation.spot.OR.DashboardScreen_OR;
import com.automation.spot.OR.ItemsScreen_OR;
import com.automation.spot.OR.LaunchScreen_OR;


public class ItemsScreen extends BasePage{
	public WebElement getNotifyMeHeaderTxtElement(){
		return functionLibrary.getElement("Id,"+ItemsScreen_OR.notifyMeHeaderTxt);
	}
	
	public List<? extends WebElement> getAddNotificationIconList(){
		return functionLibrary.getElementList("Id,"+ItemsScreen_OR.addNotificationElements);
	}
	
	public List<? extends WebElement> getSuggestionNotificationIconList(){
		return functionLibrary.getElementList("Id,"+ItemsScreen_OR.suggestionNotificationElements);
	}
	

	public void tapOnDetailsLink() {
		WebElement details = functionLibrary.getElement("Id,"+ItemsScreen_OR.detailsLinkOnBottom);
		functionLibrary.clickOnGivenElement(details);
	}
	
	
	public void tapOnNewNotificationLink() throws Exception {
		WebElement newNotification = functionLibrary.getElement("Id,"+ItemsScreen_OR.newNotificationIcon);
		functionLibrary.clickOnGivenElement(newNotification);
	}
	
	

	//	public boolean verifyLaunchScreen(){
	//		return functionLibrary.isElementPresent(getLoginButton())
	//				&& functionLibrary.isElementPresent(getSignUpButton());
	//	}
}