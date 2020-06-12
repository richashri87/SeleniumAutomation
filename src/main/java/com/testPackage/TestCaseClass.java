package com.testPackage;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.frameworkPackage.BrowserFactory;

public class TestCaseClass extends BaseClass{
	//public static WebDriver driver;

	public TestCaseClass(){
	}
	 
	@Test
	public void returnTicket() {
	try {
	//System.out.println("in returnTicket");
	//driver = BrowserFactory.getDriver("chrome");
	driver.get("http://newtours.demoaut.com");
	
	} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	 
	}
}
