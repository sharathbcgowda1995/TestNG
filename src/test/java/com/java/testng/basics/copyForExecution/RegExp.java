package com.java.testng.basics.copyForExecution;

import org.testng.annotations.Test;

public class RegExp {

	@Test
	public void loginUsingMobile() {
		System.out.println("loginUsingMobile");
	}

	@Test
	public void loginUsingLaptop() {
		System.out.println("loginUsingLaptop");
	}

	@Test
	public void viadesktop() {
		System.out.println("viadesktop");
	}
	
	//whichever we want to run we just can use the reg with the name it used to start with so those can be excluded and included
}
