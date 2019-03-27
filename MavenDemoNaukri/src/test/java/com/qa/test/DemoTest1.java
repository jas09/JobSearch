package com.qa.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest1 {
	
	@Test
	public void sum1() {
		System.out.println("Sum1");
		int a=10;
		int b=30;
		Assert.assertEquals(40, a+b);
	}
	
	@Test
	public void Sub1() {
		System.out.println("Sub1");
		int a=10;
		int b=30;
		Assert.assertEquals(20, b-a);
	}
	
	@Test
	public void Div1() {
		System.out.println("Div");
		int a=10;
		int b=30;
		Assert.assertEquals(3, b/a);
	}
}
