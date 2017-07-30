package com.automation.spot.testcase;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.automation.spot.pages.ActivateTagScreen;
import com.automation.spot.pages.DashboardScreen;
import com.automation.spot.pages.InventoryScreen;
import com.automation.spot.pages.ItemsDetailsScreen;
import com.automation.spot.pages.ItemsScreen;
import com.automation.spot.pages.LaunchScreen;
import com.automation.spot.pages.LocationScreen;
import com.automation.spot.pages.LoginScreen;
import com.automation.spot.pages.MiminAppScreen;
import com.automation.spot.pages.PlacesScreen;
import com.automation.spot.pages.SignupScreen;
import com.automation.spot.utils.DriverInit;



public class BaseTestCase {
	static AppiumDriverLocalService serviceClient;
	LaunchScreen launchScreen;
	LoginScreen loginScreen;
	SignupScreen signupScreen;
	DashboardScreen dashboardScreen;
	
	ItemsDetailsScreen itemsDetailsScreen;
	PlacesScreen placesScreen;
	InventoryScreen inventoryScreen;
	MiminAppScreen miminAppScreen;
	ActivateTagScreen activateTagScreen;
	LocationScreen locationScreen;
	ItemsScreen itemsScreen;

	String emailId="spot1@verizon.com";
	String password="Qwer.1234";
	String confirmPassword="Qwer.1234";
	String newemailId=String.valueOf(Calendar.getInstance().getTimeInMillis())+"@dakota.com";
	static int first=1;

	@BeforeSuite
	public void beforeSuite() throws MalformedURLException{
		startAppium();
		System.out.println( "Starting suite" );
		if(first==1){
			DriverInit.startDriver();
			first=first+1;
		}

	}

	//	@AfterSuite
	//	public void afterSuite() throws MalformedURLException{
	//		serviceClient.stop();
	//		System.out.println( "Stopping suite" );
	//	}

	@BeforeClass
	public void initScreens() throws MalformedURLException{
		//start driver
		//		DriverInit.startDriver();
		if(first!=2){
			DriverInit.reLaunchApp();
		}
		else
			first=first+1;
		
		if(launchScreen==null)
			launchScreen=new LaunchScreen();
		if(loginScreen==null)
			loginScreen=new LoginScreen();
		if(signupScreen==null)
			signupScreen=new SignupScreen();
		if(dashboardScreen==null)
			dashboardScreen=new DashboardScreen();
		
		if(itemsDetailsScreen==null)
			itemsDetailsScreen=new ItemsDetailsScreen();
		if(placesScreen==null)
			placesScreen=new PlacesScreen();
		if(inventoryScreen==null)
			inventoryScreen=new InventoryScreen();
		if(miminAppScreen==null)
			miminAppScreen=new MiminAppScreen();
		if(activateTagScreen==null)
			activateTagScreen=new ActivateTagScreen();
		if(locationScreen==null)
			locationScreen=new LocationScreen();
		if(itemsScreen==null)
			itemsScreen=new ItemsScreen();
		
		
	}

	@AfterClass
	public void afterClassCase(){
		DriverInit.closeDriver();
	}


	public static void startAppium() {
		String osName = System.getProperty("os.name").toLowerCase();

		String nodePath = null;
		String appiumPath = null;
		System.out.println(osName);
		if (osName.contains("mac")) {
			//            mac path
			nodePath = "/Applications/Appium.app/Contents/Resources/node/bin/node";
			appiumPath = "/Applications/Appium.app/Contents/Resources/node_modules/appium/bin/appium.js";
		} else if (osName.contains("linux")) {
			//      linux path
			nodePath = System.getenv("HOME") + "/.linuxbrew/bin/node";
			appiumPath = System.getenv("HOME") + "/.linuxbrew/lib/node_modules/appium/build/lib/main.js";
		}
		else if(osName.contains("windows")){
			//          windows path
//			nodePath = "C:\\Program Files (x86)\\Appium\\node.exe";
			nodePath = "C:\\Program Files\\nodejs\\node.exe";
//			appiumPath = "C:\\Users\\pravendra\\AppData\\Local\\Programs\\appium-desktop\\resources\\app\\node_modules\\appium\\lib\\server\\main.js";
			
			appiumPath = "C:\\Users\\pravendra\\AppData\\Local\\Programs\\appium-desktop\\resources\\app\\node_modules\\appium\\build\\lib\\main.js";
		}
		
		serviceClient = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
		.usingDriverExecutable(new File(nodePath))
		.usingPort(4723)
		.withAppiumJS(new File(appiumPath)));

		serviceClient.start();
	}

	public void loginIntoApp(String email, String password){
		launchScreen.tapOnLoginButton();
		loginScreen.enterTextIntoEmailField(email);
		loginScreen.enterTextIntoPasswordField(password);
		loginScreen.tapOnLogin();
		Assert.assertTrue(loginScreen.getDashboardScreenSource());
	}

	public void getPlacesScreen(){
		dashboardScreen.tapOnRightNavigationButton();
		dashboardScreen.tapOnPlacesOption();

	}
	public void HideGotItIfFound(){
		dashboardScreen.clickOnGotItButton();

	}

	public void getInventoryScreen() {
		dashboardScreen.tapOnRightNavigationButton();
		dashboardScreen.tapOnInventoryOption();	
	}

	public void waitTime(long time){
		try {wait(time);} catch (InterruptedException e) {e.printStackTrace();	}
	}

}