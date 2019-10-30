package LeapScaleRuhulShettyAppium.LeapScaleRuhulShettyAppium;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		//Data type of driver is AndroidDriver<AndroidElement>
		// Below line executes capabilility method
		AndroidDriver<AndroidElement> driver= capabilities();
		
		// Mostly used Locators are xpath, id ,className, androiduiAutomator 
		/* To write the xpath in appium   
		 * 
		 * //tagName[@attribute='value']....... 
		 * in appium class name is the tag name
		 * 
		 * 
		 * 
		 */
		
		
		//  we want to click on Preferences but resurce id, ClassName, package name is the same so how to idenfy Preference option
		// "Text" attribute "Value" is uniuqe for every element so we can use that
		// Click on Preference
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
		//  we want to click on Preferences but resurce id, ClassName, package name is the same so how to idenfy 3. Preference dependencies
		// "Text" attribute "Value" is uniuqe for every element so we can use that
		// click on 3. Preference dependencies
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		
		// chcking on WiFi Check box
		// On the screen thier is only one check box so we can use the id (No Text is present)
		
		driver.findElementById("android:id/checkbox").click();
		
		Thread.sleep(3000);
		// Identifying unique element if we habe duplicate element using index 
		// now we want to click on wifi settings but their is no text, No id, classname and package name are not unique
		// using xpath we can do that but some change in syntax of xpath
		// (//classname)[ElementIndexNumber]  -----
		//  (//android.widget.RelativeLayout)[2]---- 2 because we want to click on second elemet as we have 2 element in the classname
		
		
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		
		// To enter text into edit box
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
		
		// Clicking on Ok Button
		// If we have the duplicate element then first way is using Xpath - Index and second way is bellow
		// Get all the elements and then select the second element
		driver.findElementsByClassName("android.widget.Button").get(1).click(); 
		
	}

}
