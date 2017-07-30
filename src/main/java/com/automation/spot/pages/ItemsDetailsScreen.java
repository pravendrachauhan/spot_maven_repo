package com.automation.spot.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.automation.spot.OR.ItemsDetailsScreen_OR;

public class ItemsDetailsScreen extends BasePage{

	public WebElement getSelectedColoredCircle(){
		return functionLibrary.getElement("Id,"+ItemsDetailsScreen_OR.selectedColorCircle);
	}
	
	public List<? extends WebElement> getColoredCircleList(){
		return functionLibrary.getElementList("Id,"+ItemsDetailsScreen_OR.coloredCircleList);
	}

	public WebElement getDiscardButton(){
		return functionLibrary.getElement("Id,"+ItemsDetailsScreen_OR.discardButton);
	}

	public WebElement getCancelButton(){
		return functionLibrary.getElement("Id,"+ItemsDetailsScreen_OR.cancelButton);
	}
	
	public WebElement getEditItemTextElement(){
		return functionLibrary.getElement("Id,"+ItemsDetailsScreen_OR.itemNameEditText);
	}

	public void tapOnSaveButton() {
		functionLibrary.clickOnGivenElement(getSaveButton());
	}
	
	public String getTextOfItemText() {
		return functionLibrary.getTextFromGivenElement(functionLibrary.getElement("Id,"+ItemsDetailsScreen_OR.itemNameReadText));
	}

	public void tapOnItemTextToEdit() throws Exception {
		functionLibrary.clickOnGivenElement(functionLibrary.getElement("Id,"+ItemsDetailsScreen_OR.itemNameReadText));
	}

	public void typeTextIntoEditItemText(String txt) throws Exception {
		functionLibrary.enterTextIntoGivenTextBox(functionLibrary.getElement("Id,"+ItemsDetailsScreen_OR.itemNameEditText),txt);
	}

	public void tapOnBackArrow() {
		functionLibrary.clickOnGivenElement(getBackArrow());
	}
	
	public void tapOnPurpleColoredCircle() throws Exception {
		functionLibrary.clickOnGivenElement(getColoredCircleList().get(0));
	}
	
	public void tapOnOrangeColoredCircle() throws Exception {
		functionLibrary.clickOnGivenElement(getColoredCircleList().get(1));
	}
	
	public void tapOnBlueColoredCircle() throws Exception {
		functionLibrary.clickOnGivenElement(getColoredCircleList().get(2));
	}
	
	public void tapOnMagentaColoredCircle() throws Exception {
		functionLibrary.clickOnGivenElement(getColoredCircleList().get(3));
	}
	
	public void tapOnGreenColoredCircle() throws Exception {
		functionLibrary.clickOnGivenElement(getColoredCircleList().get(4));
	}
	
	public void tapOnRedColoredCircle() throws Exception {
		functionLibrary.clickOnGivenElement(getColoredCircleList().get(5));
	}
	
	public void tapOnYellowColoredCircle() throws Exception {
		functionLibrary.clickOnGivenElement(getColoredCircleList().get(6));
	}

	public boolean verifyItemDetailsScreen(){
		return functionLibrary.isElementPresent(getBackArrow())
				&& functionLibrary.isElementPresent(getNavigationHeader())
				&& functionLibrary.isElementPresent(getSelectedColoredCircle());
	}
}