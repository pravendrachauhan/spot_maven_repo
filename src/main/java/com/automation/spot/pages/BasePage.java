package com.automation.spot.pages;

import org.openqa.selenium.WebElement;

import com.automation.spot.OR.BasePage_OR;
import com.automation.spot.OR.ItemsDetailsScreen_OR;
import com.automation.spot.utils.FunctionLibrary;

public class BasePage
{
	FunctionLibrary functionLibrary;
	public BasePage(){
		if(functionLibrary==null)
		functionLibrary=new FunctionLibrary();
	}
	
	public WebElement getBackArrow(){
		return functionLibrary.getElement("Id,"+ItemsDetailsScreen_OR.backArrow);
	}
	
	public WebElement getCloseLeftIcon(){
		return functionLibrary.getElement("Id,"+ItemsDetailsScreen_OR.closeLeftIcon);
	}

	public WebElement getSaveButton(){
		return functionLibrary.getElement("Id,"+ItemsDetailsScreen_OR.saveButton);
	}

	public WebElement getNavigationHeader(){
		return functionLibrary.getElement("Id,"+ItemsDetailsScreen_OR.navigationHeader);
	}
	
	public WebElement getRightNavigation(){
		return functionLibrary.getElement("Id,"+BasePage_OR.rightNavigation);
	}
	
	public WebElement getRightNavigationButton(){
		return functionLibrary.getElement("Id,"+BasePage_OR.rightNavigationButton);
	}
	
	public WebElement getPlacesOption(){
		
		return functionLibrary.getElementList("Id,"+"com.verizon.npd.spot:id/menu_name").get(0);
//		return functionLibrary.getElement("Name,"+"Places");
	}
	
	public WebElement getInventoryOption(){
		return functionLibrary.getElementList("Id,"+"com.verizon.npd.spot:id/menu_name").get(1);
//		return functionLibrary.getElement("Name,"+"Inventory");
	}
	
	
	public void tapOnRightNavigation() {
		functionLibrary.clickOnGivenElement(getRightNavigation());
	}
	
	public void tapOnThreeVerticalDots() {
		functionLibrary.clickOnGivenElement(functionLibrary.getElement("Id,"+BasePage_OR.Three_Vertical_Dots));
	}
	
	public void tapOnRightNavigationButton(){
		functionLibrary.clickOnGivenElement(getRightNavigationButton());
	}
	
	
	public void tapOnPlacesOption() {
		functionLibrary.clickOnGivenElement(getPlacesOption());
	}
	
	public void tapOnInventoryOption() {
		functionLibrary.clickOnGivenElement(getInventoryOption());
	}
	
	public void tapOnBackArrow() {
		functionLibrary.clickOnGivenElement(getBackArrow());
	}
	
	public void tapOncloseLeftIcon() {
		functionLibrary.clickOnGivenElement(getCloseLeftIcon());
	}
	
	
	
	public void tapOnSaveButton() {
		functionLibrary.clickOnGivenElement(getSaveButton());
	}
	
	public void performAndroidBack() {
		functionLibrary.pressAndroidBack();
	}
	
	public void clickOnGotItButton() {
		if(functionLibrary.getElement("Id,"+"com.verizon.npd.spot:id/got_it_text_view").isDisplayed())
			functionLibrary.clickOnGivenElement(functionLibrary.getElement("Id,"+"com.verizon.npd.spot:id/got_it_text_view"));
	}

	public void tapOnCancelButton() {
		functionLibrary.clickOnGivenElement(functionLibrary.getElement(BasePage_OR.cancelButtonOnPoup));
	}
	
	public void tapOnDeleteButton() {
		functionLibrary.clickOnGivenElement(functionLibrary.getElement(BasePage_OR.deleteButtonOnPoup));
	}
	
}
