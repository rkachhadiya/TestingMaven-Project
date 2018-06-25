package com.testNgTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1_RKSony {
	
	@BeforeTest
	public void setUpBrowser(){
		System.out.println("This line has been updated by RKComputer2306_1 branch");
	}
	
	@Test
	public void testing(){
		System.out.println("Updated by RKComputer under branch 2306_1");
	}

}
