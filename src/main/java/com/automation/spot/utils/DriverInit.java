package com.automation.spot.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverInit {
	public static AppiumDriver<WebElement> driver;
//	static String deviceName="Android Emulator";
//	static String deviceName="Moto";
//	static String deviceName="Samsung Note";
	static String deviceName="Sony";

	public static void startDriver()
	{
		try {
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), setCapabilities(deviceName));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( "Driver is started successfully.." );
		waitTime(10000);
	}
	
	public static void closeDriver()
	{
		driver.closeApp();
		waitTime(3000);
	}
	
	public static void reLaunchApp()
	{
		driver.launchApp();
		waitTime(6000);
	}
	
	
	
	public static DesiredCapabilities setCapabilities(String deviceName){
	//	String build_Number=System.getProperty("Job_Number");
	//	if(build_Number.isEmpty() ||build_Number==null)
	//		build_Number="1723";
		String apkName="Spot.apk";
		String appPackage="com.verizon.npd.spot";
		String appActivity="com.verizon.npd.spot.views.ItemsActivity";
//		String appWaitActivity ="com.verizon.npd.spot.views.IntroductionActivity";
		DesiredCapabilities capabilities = null;
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "//testdata/apk");
		File app = new File(appDir, apkName);
		if(deviceName.equalsIgnoreCase("Android Emulator")){
			capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); 
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.0");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
			capabilities.setCapability("locale", "US");
			capabilities.setCapability("deviceReadyTimeout", "450");  //Timeout in seconds while waiting for device to become ready
			capabilities.setCapability("newCommandTimeout", "600000");		
			capabilities.setCapability("app", app.getAbsolutePath());
//			capabilities.setCapability("app", "https://bamboo.verizon.com/artifact/DC-DCB/JOB1/build-1723/Spot/spot-release.apk");
			
//			/abs/path/to/my.apk or http://myapp.com/app.ipa
			capabilities.setCapability("appPackage", appPackage);
			capabilities.setCapability("appActivity", appActivity);
		}
		else if(deviceName.equalsIgnoreCase("Moto")){
			capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); 
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto G4");
			capabilities.setCapability(MobileCapabilityType.UDID, "ZY223832QR");
			capabilities.setCapability("locale", "US");
			capabilities.setCapability("deviceReadyTimeout", "6000");  //Timeout in seconds while waiting for device to become ready
			capabilities.setCapability("newCommandTimeout", "600000");		
			//capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("app", "https://bamboo.verizon.com/artifact/DC-DCB/JOB1/build-1723/Spot/spot-release.apk");
			
			capabilities.setCapability("appPackage", appPackage);
			capabilities.setCapability("appActivity", appActivity);
//			capabilities.setCapability("appWaitActivity", appWaitActivity);
		}
		else if(deviceName.equalsIgnoreCase("Samsung J")){
			capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); 
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
			capabilities.setCapability(MobileCapabilityType.UDID, "4200b756da2cb285");
			capabilities.setCapability("locale", "US");
			capabilities.setCapability("deviceReadyTimeout", "6000");  //Timeout in seconds while waiting for device to become ready
			capabilities.setCapability("newCommandTimeout", "600000");		
			//capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("app", "https://bamboo.verizon.com/artifact/DC-DCB/JOB1/build-1723/Spot/spot-release.apk");
			
			capabilities.setCapability("appPackage", appPackage);
			capabilities.setCapability("appActivity", appActivity);
//			capabilities.setCapability("appWaitActivity", appWaitActivity);
		}
		else if(deviceName.equalsIgnoreCase("Samsung Note")){
			capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); 
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
			capabilities.setCapability(MobileCapabilityType.UDID, "031603441f342e04");
			capabilities.setCapability("locale", "US");
			capabilities.setCapability("deviceReadyTimeout", "6000");  //Timeout in seconds while waiting for device to become ready
			capabilities.setCapability("newCommandTimeout", "600000");		
			capabilities.setCapability("app", app.getAbsolutePath());
//			capabilities.setCapability("app", "https://bamboo.verizon.com/artifact/DC-DCB/JOB1/build-1723/Spot/spot-release.apk");
			capabilities.setCapability("appPackage", appPackage);
			capabilities.setCapability("appActivity", appActivity);
//			capabilities.setCapability("appWaitActivity", appWaitActivity);
		}
		else if(deviceName.equalsIgnoreCase("Sony")){
			capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); 
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Sony");
			capabilities.setCapability(MobileCapabilityType.UDID, "EP73208D0N");
			capabilities.setCapability("deviceReadyTimeout", "6000");  //Timeout in seconds while waiting for device to become ready
			capabilities.setCapability("newCommandTimeout", "600000");		
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", appPackage);
			capabilities.setCapability("appActivity", appActivity);
//			capabilities.setCapability("appWaitActivity", appWaitActivity);
		}
		return capabilities;
	}
	public static void waitTime(long time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void startDriverForMimicApp() throws MalformedURLException
	{
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), setCapabilitiesForMimicApp(deviceName));
		System.out.println( "Mimic app Driver is started successfully.." );
		waitTime(10000);
	}
	
	public static void closeDriverForMimicApp() throws MalformedURLException
	{
		driver.closeApp();
		waitTime(3000);
	}
	
	public static DesiredCapabilities setCapabilitiesForMimicApp(String deviceName){
		String apkName="mimicapp.apk";
		String appPackage="com.verizon.npd.mimicapp";
		String appActivity="com.verizon.npd.mimicapp.LocationActivity";
//		String appWaitActivity ="com.verizon.npd.spot.views.IntroductionActivity";
		DesiredCapabilities capabilities = null;
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "\\testdata\\apk");
		File app = new File(appDir, apkName);
		if(deviceName.equalsIgnoreCase("Android Emulator")){
			capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); 
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.0");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
			capabilities.setCapability("locale", "US");
			capabilities.setCapability("deviceReadyTimeout", "450");  //Timeout in seconds while waiting for device to become ready
			capabilities.setCapability("newCommandTimeout", "600000");		
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", appPackage);
			capabilities.setCapability("appActivity", appActivity);
		}
		else if(deviceName.equalsIgnoreCase("Moto")){
			capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); 
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto G4");
			capabilities.setCapability(MobileCapabilityType.UDID, "ZY223832QR");
			capabilities.setCapability("locale", "US");
			capabilities.setCapability("deviceReadyTimeout", "6000");  //Timeout in seconds while waiting for device to become ready
			capabilities.setCapability("newCommandTimeout", "600000");		
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", appPackage);
			capabilities.setCapability("appActivity", appActivity);
//			capabilities.setCapability("appWaitActivity", appWaitActivity);
		}
		else if(deviceName.equalsIgnoreCase("Samsung J")){
			capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); 
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Le 1s");
			capabilities.setCapability(MobileCapabilityType.UDID, "4200b756da2cb285");
//			capabilities.setCapability(MobileCapabilityType.UDID, "8LS4SC8PHQ4PKJW4");
			
			capabilities.setCapability("locale", "US");
			capabilities.setCapability("deviceReadyTimeout", "6000");  //Timeout in seconds while waiting for device to become ready
			capabilities.setCapability("newCommandTimeout", "600000");		
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", appPackage);
			capabilities.setCapability("appActivity", appActivity);
//			capabilities.setCapability("appWaitActivity", appWaitActivity);
		}
		else if(deviceName.equalsIgnoreCase("Sony")){
			capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); 
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Sony");
			capabilities.setCapability(MobileCapabilityType.UDID, "EP73208D0N");
			capabilities.setCapability("deviceReadyTimeout", "6000");  //Timeout in seconds while waiting for device to become ready
			capabilities.setCapability("newCommandTimeout", "600000");		
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", appPackage);
			capabilities.setCapability("appActivity", appActivity);
//			capabilities.setCapability("appWaitActivity", appWaitActivity);
		}
		return capabilities;
	}
}
