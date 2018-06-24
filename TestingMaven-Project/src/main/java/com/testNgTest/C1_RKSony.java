package com.testNgTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1_RKSony {
	
	@BeforeTest
	public void setUpBrowser(){

		System.out.println("This line has been updated by RKSony 0624_01");

		System.out.println("This is code from RKSony 0624_01");
		
		System.out.println("Added boolean by branch RKSony 0624_01");

	}
	
	@Test
	public void testing(){
		System.out.println("Updated by RKComputer under branch 2306_1");
	}

}
