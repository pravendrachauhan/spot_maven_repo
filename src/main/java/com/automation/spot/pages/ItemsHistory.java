package com.automation.spot.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.automation.spot.OR.ItemsDetailsScreen_OR;

public class ItemsHistory extends BasePage{

	public WebElement getSelectedColoredCircle(){
		return functionLibrary.getElement("Id,"+ItemsDetailsScreen_OR.selectedColorCircle);
	}
	
	
	public void tapOnSaveButton() {
		functionLibrary.clickOnGivenElement(getSaveButton());
	}
	
	public String getTextOfItemText() {
		return functionLibrary.getTextFromGivenElement(functionLibrary.getElement("Id,"+ItemsDetailsScreen_OR.itemNameReadText));
	}

	public void tapOnBackArrow() {
		functionLibrary.clickOnGivenElement(getBackArrow());
	}
	
	public boolean verifyItemDetailsScreen(){
		return functionLibrary.isElementPresent(getBackArrow())
				&& functionLibrary.isElementPresent(getNavigationHeader())
				&& functionLibrary.isElementPresent(getSelectedColoredCircle());
	}
}