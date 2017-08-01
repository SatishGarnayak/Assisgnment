package com.practice.mavenproject.Runner;

import java.io.File;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/html/"},features="features",glue={"com.practice.mavenproject.Steps"})

public class Testrun {
   /*@AfterClass
	public static void reportsetup(){
		Reporter.loadXMLConfig(new File("mavenproject/extent-config.xml"));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone",System.getProperty("user.timezone"));
		Reporter.setSystemInfo("64 Bit","Windows 10");
		Reporter.setSystemInfo("3.0.1","Selenium");
		Reporter.setSystemInfo("3.5.0","Maven");
		Reporter.setSystemInfo("1.8.0_121","Java Version");
		Reporter.setTestRunnerOutput("Cucumber JUnit Test Runner");

	}*/
}
