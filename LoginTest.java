package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void loginwithemail()
	{
		System.out.println("inside test login with email");
	}
	@Test
	public void loginwithfacebook()
	{
		System.out.println("inside test login with facebook");
		Assert.assertEquals("A", "A1");
	}
	
}
