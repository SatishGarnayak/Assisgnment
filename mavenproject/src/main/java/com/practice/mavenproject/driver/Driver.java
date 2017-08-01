package com.practice.mavenproject.driver;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Driver {
	
	public  Driver(AndroidDriver<MobileElement> driver){
		PageFactory.initElements(driver,this);
	}

}
