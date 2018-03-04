package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {
	@Test
	public void logintest()
	{
		System.out.println("login Test");
		int i = 9/0;
	}
	@Test(dependsOnMethods="logintest")
	public void homePageTest()
	{
		System.out.println("homePageTest");
	}
	@Test(dependsOnMethods="logintest")
	public void searchPageTest()
	{
		System.out.println("SearchTest");
	}

	@Test(dependsOnMethods="logintest")
	public void regPageTest()
	{
		System.out.println("regPageTest");
	}
}
