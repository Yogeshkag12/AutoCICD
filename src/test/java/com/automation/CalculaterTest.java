package com.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculaterTest {
	Calculater cal = new Calculater();

	@Test
	public void addtion() {
		Assert.assertEquals(cal.addtion(10, 20), 30);
	}

	@Test
	public void subtraction() {
		Assert.assertEquals(cal.subtraction(20, 10), 10);
	}
	@Test
	public void multilication() {
		Assert.assertEquals(cal.multipilcation(20, 10), 200);
	}
	@Test
	public void division() {
		Assert.assertEquals(cal.divisio(20, 10), 3);
	}
}
