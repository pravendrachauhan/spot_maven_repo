package com.automation.spot.pages;

import org.openqa.selenium.WebElement;

import com.automation.spot.OR.ActivateTagScreen_OR;
import com.automation.spot.OR.LaunchScreen_OR;
import com.automation.spot.OR.LoginScreen_OR;


public class ActivateTagScreen extends BasePage{
	
	public void tapOnActivateAtagIcon() throws Exception{
		functionLibrary.clickOnGivenElement(functionLibrary.getElement("Id,"+ActivateTagScreen_OR.ActivateaTagIcon));
	}
	
	public void tapOnEnterTagIdManuallyButton() throws Exception{
		functionLibrary.clickOnGivenElement(functionLibrary.getElement("Id,"+ActivateTagScreen_OR.EnterTagIdManuallyButton));
	}
	
	public void enterTextIntoTagField(String tag) throws Exception{
		functionLibrary.enterTextIntoGivenTextBox(functionLibrary.getElement("Id,"+ActivateTagScreen_OR.TagIdTextBox), tag);
	}
	
	public void tapOnEnterButton() throws Exception{
		functionLibrary.clickOnGivenElement(functionLibrary.getElement("Id,"+ActivateTagScreen_OR.EnterButton));
	}
	
	public void tapOnContinueButton() throws Exception{
		functionLibrary.clickOnGivenElement(functionLibrary.getElement("Id,"+ActivateTagScreen_OR.ContinueButton));
	}
	
	public void enterTextIntoBagField(String tag) throws Exception{
		functionLibrary.enterTextIntoGivenTextBox(functionLibrary.getElement("Id,"+ActivateTagScreen_OR.BagTextBoxOnNewBagPage), tag);
	}
	
	public void tapOnDoneButtonOnNewBag() throws Exception{
		functionLibrary.clickOnGivenElement(functionLibrary.getElement("Name,"+"next"));
	}
	
	public void tapOnAddPhotoLaterButtonOnNewBag() throws Exception{
		functionLibrary.clickOnGivenElement(functionLibrary.getElement("Id,"+ActivateTagScreen_OR.AddPhotoLaterButton));
	}
	
	public void tapOnNextButtonOnColorSelection() throws Exception{
		functionLibrary.clickOnGivenElement(functionLibrary.getElement("Id,"+ActivateTagScreen_OR.NextButtonOnColorSelecion));
	}
	
	public void tapOnDoThisLaterButtonAtLast() throws Exception{
		functionLibrary.clickOnGivenElement(functionLibrary.getElement("Id,"+ActivateTagScreen_OR.DoThisLaterAddNotificationButton));
	}
	
	public void tapOnDoneButtonAtFinish() throws Exception{
		functionLibrary.clickOnGivenElement(functionLibrary.getElement("Id,"+ActivateTagScreen_OR.DoneButtonOnActivatedScreen));
	}
	
}