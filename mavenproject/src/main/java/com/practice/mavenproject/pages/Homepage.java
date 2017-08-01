package com.practice.mavenproject.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.practice.mavenproject.driver.Driver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Homepage extends Driver{

	public  Homepage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}


	@FindBy(css="._3NH1qf:nth-child(1)")
	private WebElement mainmenu;
	
	@FindBy(xpath="//*[@class='_3HhlO3']//ul[@class='_2Z-xwc'][1]/li[1]")
	private WebElement submenu;
	
	@FindBy(xpath="//a[text()='Mobiles']")
	private WebElement mobile;
	
	@FindBy(css="._1cJqpi:nth-child(5) .UjPJen")
	private WebElement viewall;
	
	
	public WebElement getViewall() {
		return viewall;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getSubmenu() {
		return submenu;
	}


	public WebElement getMainmenu() {
		return mainmenu;
	}
   
	public void clickOnElement(String elementName,AndroidDriver<MobileElement> driver) throws InterruptedException{
		 WebDriverWait  wait=new WebDriverWait(driver,30);
		switch (elementName) {
		case "mainmenu":
			  wait.until(ExpectedConditions.elementToBeClickable(getMainmenu())).click();
			break;
        case "submenu":
        	 wait.until(ExpectedConditions.elementToBeClickable(getSubmenu())).click();
			break;
        case "mobiles":
        	 wait.until(ExpectedConditions.elementToBeClickable(getMobile())).click();
			break;
        case "view all":
       	 wait.until(ExpectedConditions.elementToBeClickable(getViewall())).click();
			break;	

		default:
			break;
		}
	}
	

	public void verifyElement(String element){
		switch (element) {
		case "mainmenu":
			Assert.assertTrue("Verified", getMainmenu().isDisplayed());
			break;
        case "submenu":
        	Assert.assertTrue("Verified", getSubmenu().isEnabled());
			break;
        case "mobiles":
        	Assert.assertTrue("Verified",getMobile().isEnabled());
			break;

		default:
			break;
		
	}
	
	}
	



}
