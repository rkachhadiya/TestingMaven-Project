package com.testNgTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1_RKSony {
	
	@BeforeTest
	public void setUpBrowser(){

		System.out.println("This line has been updated by RKComputer2306_1 branch");

		System.out.println("This is code from rk sony computer");
		
		System.out.println("updated under branch RKcomp0624_1");

	}
	
	@Test
	public void testing(){
		System.out.println("Updated by RKComputer under branch 0624_01");
	}

}
