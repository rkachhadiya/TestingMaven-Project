package com.testClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1_RKSony {
	
	@BeforeTest
	public void setUpBrowser(){

		System.out.println("Consider this line changes RKComputer 0624_01");

		System.out.println("Consider this RKSony 0624_01");
		
		System.out.println("Don't consider this RKSony0624_1");
		System.out.println("Consider this RKSony 0624_01");

	}
	
	@Test
	public void testing(){
		System.out.println("Updated by RKComputer under branch 0624_01");
		System.out.println(10/0);
	}

}
