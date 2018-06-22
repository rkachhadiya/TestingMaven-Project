package com.testNgTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestrunofTestNG {
	WebDriver driver;
	@BeforeTest
	public void setUpBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	}
	
	
	@Test
	public void testMethod() throws Exception{
		System.out.println("Chrome launched sucessfully");
		Thread.sleep(10000);
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	

}
