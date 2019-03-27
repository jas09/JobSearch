package com.qa.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest {
	
	@Test
	public void sum() {
		System.out.println("Sum");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void Sub() {
		System.out.println("Sub");
		int a=10;
		int b=20;
		Assert.assertEquals(10, b-a);
	}
	
	@Test
	public void Div() {
		System.out.println("Div");
		int a=10;
		int b=20;
		Assert.assertEquals(2, b/a);
	}
}
