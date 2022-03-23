package com.java.testng.basics.copyForExecution;

import org.testng.annotations.Test;

public class CarLoan {
	@Test
	public void applyViaMobileApp() {
		System.out.println("appliedCarLoanViaMobileApp");
	}

	@Test
	public void applyViaWeb() {
		System.out.println("appliedCarLoanViaWeb");
	}

	@Test
	public void applyViaBroker() {
		System.out.println("appliedCarLoanViaBroker");
	}
}
