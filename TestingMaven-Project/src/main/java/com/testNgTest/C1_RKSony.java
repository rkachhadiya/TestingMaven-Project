package com.testNgTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1_RKSony {
	
	@BeforeTest
	public void setUpBrowser(){
		System.out.println("This is code from rk sony computer");
		
		System.out.println("Added boolean by RKSony under branch 2306_01");
	}
	
	@Test
	public void testing(){
		System.out.println("Created test by RKsony in Branch 2306");
	}

}
