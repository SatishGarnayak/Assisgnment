package com.practice.mavenproject.Steps;
import java.net.MalformedURLException;

import com.practice.mavenproject.driverutils.Utils;
import com.practice.mavenproject.pages.Homepage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class stepDefs extends Utils{
	 
	
	@Given("^user launches app$")
	public void launchApp() throws MalformedURLException {
		Utils utils=new Utils();
   driver=utils.initCapability(driver);
	  }
	
	@When("^user select mobiles from mainmenu$")
	    public void userSelectMobileFromMainmenu() throws InterruptedException {
		Homepage homepage=new Homepage(driver);
		    homepage.verifyElement("mainmenu");
		    homepage.clickOnElement("mainmenu",driver);
		    homepage.verifyElement("submenu");
		    homepage.clickOnElement("submenu",driver); 
		    homepage.clickOnElement("mobiles",driver);    
	  }
	@And("^user click on view all$")
	public void clickOnViewall() throws InterruptedException{
		Utils utils=new Utils();
		Homepage homepage=new Homepage(driver);
		Thread.sleep(6000);
		  utils.swipeTo("BottomToTop");
		 homepage.clickOnElement("view all",driver); 
		
	}
    

	
	
	
	
	@When("^user login with\"(.*)\" and \"(.*)\"$")
    public void userDoLogin(String username,String password) {
    	
    	
	  
  }
}
