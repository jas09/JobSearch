package com.qa.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest2 {
	
	@Test
	public void sum2() {
		System.out.println("Sum2");
		int a=10;
		int b=40;
		Assert.assertEquals(50, a+b);
	}
	
	@Test
	public void Sub2() {
		System.out.println("Sub2");
		int a=10;
		int b=40;
		Assert.assertEquals(30, b-a);
	}
	
	@Test
	public void Div2() {
		System.out.println("Div2");
		int a=10;
		int b=40;
		Assert.assertEquals(4, b/a);
	}
}
