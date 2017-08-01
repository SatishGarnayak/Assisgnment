package com.practice.mavenproject.capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

public class GetCapability {
	
	public void initCapability(){
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability("platformName", "Android");
	  cap.setCapability("browserName", "Browser");
	  cap.setCapability("deviceName", "emulator-5554");

}
}