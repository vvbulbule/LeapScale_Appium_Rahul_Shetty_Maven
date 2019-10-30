package LeapScaleRuhulShettyAppium.LeapScaleRuhulShettyAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {


	// Created this method so that we can call this from anywhere in the program
	// Return Type of this method is driver so use AndroidDriver<AndroidElement>
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub


		DesiredCapabilities cap = new DesiredCapabilities();//Class name 
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5");//We can put emulator name here to open required emulator


		/*File f= new File("src");//location of Apk file present in folder ideally keep apk file in project only just copy paste
		File fs= new File (f,"app_name.apk");// give the app apk file name
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());// Copy past the APK in our project 
		 */		

		
		// Imp -----  If we have the apk file then we don't need appActivity & AppPackage name to open the App but we don't have it so using the below lines
		cap.setCapability("udid","04d9520d03285620");
		cap.setCapability("platformName", "Android"); 
		cap.setCapability("platformVersion","6.0.1" );
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		// Open the Server
		AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		//this ip addess is got from Appium Desktop client or just type appium in cmmd 
		//0.0.0.4723 is similar to the 127.0.0.1.4723 
		// import java.net.URL then add the throws declaration
		
		
		// If we open the session then it will be active for 60 sec after that it will terminate automatically but in middle if we execute the another test it will fail the execution saying that seeion is already running
		// session takes 60 sec to close (We can force fully terminate the session by pressing ctrl+C on appium console logs then again start the session by typing appium / using appium desktop client
		
		return driver;
		

	}

}
