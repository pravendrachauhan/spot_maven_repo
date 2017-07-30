package com.automation.spot.utils;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FunctionLibrary extends DriverInit{

	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public boolean isElementPresent(WebElement e) {
		for(int abc=0;abc<10;abc++){
			try {
				if(e.isDisplayed())
					return true;
				else 
					waitTime(1000);
			} catch (Exception e1) {
				waitTime(1000);
			}
		}
		return false;
	}

	public List<? extends WebElement> getElementList(String locatorName) {

		//		String locatorKeyVal = env.getProperty(locatorName);
		String locatorStrategy = locatorName.split(",")[0];
		String locatorValue = locatorName.split(",")[1];
		List<? extends WebElement> elementList = null;

		if (locatorStrategy.equalsIgnoreCase("AccessibilityID")) {
			elementList = driver.findElements(MobileBy.AccessibilityId(locatorValue));
		}
		else if(locatorStrategy.equalsIgnoreCase("Class")){
			elementList = driver.findElements(MobileBy.className(locatorValue));
		}
		else if(locatorStrategy.equalsIgnoreCase("Xpath")){
			elementList = driver.findElementsByXPath(locatorValue);
		}
		else if(locatorStrategy.equalsIgnoreCase("AndroidUIAutomator")){
			elementList = driver.findElements(MobileBy.AndroidUIAutomator(locatorValue));
		}
		else if(locatorStrategy.equalsIgnoreCase("Css")){
			elementList = driver.findElements(MobileBy.cssSelector(locatorValue));
		}
		else if(locatorStrategy.equalsIgnoreCase("Id")){
			elementList = driver.findElementsById(locatorValue);
		}
		else if(locatorStrategy.equalsIgnoreCase("Tag")){
			elementList = driver.findElements(MobileBy.tagName(locatorValue));
		}
		else if(locatorStrategy.equalsIgnoreCase("LinkText")){
			elementList = driver.findElements(MobileBy.linkText(locatorValue));
		}
		return elementList;
	}

	public WebElement getElement(String locatorName) {

		//		String locatorKeyVal = env.getProperty(locatorName);
		String locatorStrategy = locatorName.split(",")[0];
		String locatorValue = locatorName.split(",")[1];
		WebElement element = null;

		if(locatorStrategy.equalsIgnoreCase("AccessibilityID")) {
			element=driver.findElementByAccessibilityId(locatorValue);
		}
		else if(locatorStrategy.equalsIgnoreCase("Class")) {
			element=driver.findElementByClassName(locatorValue);
		} 
		else if(locatorStrategy.equalsIgnoreCase("Xpath")) {
			element=driver.findElementByXPath(locatorValue);
		}
		else if(locatorStrategy.equalsIgnoreCase("Css")) {
			element=driver.findElementByCssSelector(locatorValue);
		}
		else if(locatorStrategy.equalsIgnoreCase("Id")) {
			element=driver.findElementById(locatorValue);
		}
		else if(locatorStrategy.equalsIgnoreCase("Name")) {
			element=driver.findElementByName(locatorValue);
		}
		else if(locatorStrategy.equalsIgnoreCase("Tag")) {
			element=driver.findElementByTagName(locatorValue);
		}
		else if(locatorStrategy.equalsIgnoreCase("LinkText")) {
			element=driver.findElementByLinkText(locatorValue);
		}
		else if(locatorStrategy.equalsIgnoreCase("PartialLinkText")) {
			element=driver.findElementByPartialLinkText(locatorValue);
		}
		return element;
	}

//	private WebElement FindElement(By locator){
//		WebElement element = null;
//		for(int i=0;i<10;i++){
//			try{
//				element = driver.findElement(locator);
//				break;
//			}
//			catch(NoSuchElementException e){
//				continue;
//			}
//		}
//		return element;
//	}

	public void takeScreenShot(String fileName) {
		// TODO Auto-generated method stub
		File file = new File(fileName + ".png");
		File tmpFile = driver
				.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(tmpFile, file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getTextFromGivenElement(WebElement ele){
		System.out.println(ele.getText());
		return ele.getText();
	}


	public void clickOnGivenElement(WebElement ele){
		ele.click();
		waitTime(5000);
	}

	public void selectTheValueFromDropdown(WebElement ele, String value) {
		Select select=new Select(ele);
		select.selectByVisibleText(value);
	}

	public void enterTextIntoGivenTextBox(WebElement ele, String text){
		ele.clear();
		ele.sendKeys(text);
		try{
		driver.hideKeyboard();
		}
		catch(Exception e){
			
		}
	}

	public void selectOptionFromDropdown(WebElement ele, String option) {
		for(int i=0;i<10;i++){
			try{
				Select select=new Select(ele);
				select.selectByVisibleText(option);
				waitTime(1000);
				break;
			}
			catch(Exception e){
				continue;
			}
		}
	}

	public void getSourceOfScreen() {
		System.out.println("source: "+driver.getPageSource());
	}
	
	public void swipeUpOnGivenElement(WebElement ele) {
		int x=ele.getLocation().getX();
		int y=ele.getLocation().getY();
		driver.swipe(x, y, x, y-30, 1000);
		waitTime(3000);
	}

	public void tapOnMiddleOfTheScreen() {
		Dimension dimensions = driver.manage().window().getSize();
		int x = dimensions.getWidth();
		int y = dimensions.getHeight();
		TouchAction swipe = new TouchAction(driver);
		swipe.tap(x/2, y/2).perform();
		System.out.println("source: "+driver.getPageSource());

	}
	
	public void pressAndroidBack(){
		driver.navigate().back();
	}
}
