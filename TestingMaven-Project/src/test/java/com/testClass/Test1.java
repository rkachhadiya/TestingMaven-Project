package com.testClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	@BeforeTest
	private void setUpDriver(){
		System.out.println("Testing class of RKsony 2306");
		/*WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");*/
	}
	

	@Test
	private void testingMethod(){
		System.out.println("Working on testing");
	}
	@AfterTest
	private void tearDown(){
		System.out.println("Driver is stoped under RKSony 0624_01");

	}
}
