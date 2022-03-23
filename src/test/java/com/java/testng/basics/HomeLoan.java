package com.java.testng.basics;

import org.testng.annotations.Test;

public class HomeLoan {

	@Test
	public void applyViaMobileApp() {
		System.out.println("appliedHomeLoanViaMobileApp");
	}

	@Test
	public void applyViaWeb() {
		System.out.println("appliedHomeLoanViaWeb");
	}

	@Test
	public void applyViaBroker() {
		System.out.println("appliedHomeLoanViaBroker");
	}

}
