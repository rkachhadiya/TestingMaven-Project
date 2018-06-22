package com.testNgTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestSelenium {
	
	public static void main(String args[]) {
		System.out.println("Testing");
		//System.setProperty("webdriver.firefox.marionette", arg1);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
	}

}
