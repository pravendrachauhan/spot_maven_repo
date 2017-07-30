package com.automation.spot.pages;
import org.openqa.selenium.WebElement;

import com.automation.spot.OR.LaunchScreen_OR;
import com.automation.spot.OR.LocationScreen_OR;


public class LocationScreen extends BasePage{
	public WebElement getGetDirectionButton(){
		return functionLibrary.getElement("Id,"+LocationScreen_OR.getDirectionButton);
	}
	public WebElement getCloseIconOnSpotMap(){
		return functionLibrary.getElement("Id,"+LocationScreen_OR.closeIconOnSpotMap);
	}
	public WebElement getMyLocationDotOnSpotMap(){
		return functionLibrary.getElement("Id,"+LocationScreen_OR.myLocationDotOnSpotMap);
	}
	
	public WebElement getGoogleMapItem(){
		return functionLibrary.getElement("Id,"+LocationScreen_OR.googleMapItem);
	}
	
	
	public void tapOnGetDirectionButton(){
		functionLibrary.clickOnGivenElement(getGetDirectionButton());
	}

}