package com.testPackage;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import com.frameworkPackage.BrowserFactory;

public class BaseClass {
	public  static WebDriver driver;

	public BaseClass() {
	}

	@BeforeAll
	public static  void beforeClass() {
		System.out.println("in @BeforeClass");
	}

	@BeforeEach
	public  void beforeMethodClass() {
		System.out.println("in @BeforeMethod");
		driver = BrowserFactory.getDriver("chrome");

	}

	@AfterEach
	public  void close() {
		// this.driver.close();
	}

	@AfterAll
	public static void afterSuite() throws IOException {

		driver.quit();
	}
}
