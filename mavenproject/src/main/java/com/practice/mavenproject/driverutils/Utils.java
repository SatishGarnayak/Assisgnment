package com.practice.mavenproject.driverutils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Utils {
  
	public static AndroidDriver<MobileElement> driver;
	public  AndroidDriver<MobileElement> initCapability(AndroidDriver<MobileElement> driver) throws MalformedURLException {

		 DesiredCapabilities cap=new DesiredCapabilities();
		  cap.setCapability("platformName", "Android");
		  cap.setCapability("browserName", "Browser");
		  cap.setCapability("deviceName", "emulator-5554");
		  driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		  driver.get("http://m.flipkart.com");

		return driver;
	}
  public void closeApp() {
	  driver.quit();
  }

 public void swipeTo(String swipeType){
	 Dimension size=driver.manage().window().getSize();
	 switch (swipeType) {
	case "TopToBottom":
		 driver.swipe((size.width / 2), (int) (size.height * 0.20), (size.width / 2), (int) (size.height * 0.80), 2000);
		break;
    case "BottomToTop":
    	 driver.swipe((size.width / 2), (int) (size.height * 0.80), (size.width / 2), (int) (size.height * 0.20), 2000);

		break;
    case "LeftToRight":
    	driver.swipe((int)(size.width*0.30), (size.height/2), (int)(size.width*0.70), (size.height/2), 2000);
	
	    break;
    case "RightToLeft":
	   driver.swipe((int) (size.width*0.70), size.height/2, (int)(size.width*0.30), (size.height/2), 2000);
	    break;

	default:
		break;
	}
	 
 }


  
  
}
