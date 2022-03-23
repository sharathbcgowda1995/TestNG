package com.java.testng.basics.copyForExecution;

import org.testng.annotations.Test;

public class PersonalLoan {
	@Test
	public void applyViaMobileApp() {
		System.out.println("appliedPersonalLoanViaMobileApp");
	}

	@Test
	public void applyViaWeb() {
		System.out.println("appliedPersonalLoanViaWeb");
	}

	@Test
	public void applyViaBroker() {
		System.out.println("appliedPersonalLoanViaBroker");
	}
}
