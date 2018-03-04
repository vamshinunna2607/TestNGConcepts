package com.test;

import org.testng.annotations.Test;
import org.testng.internal.ExpectedExceptionsHolder;

public class ExceptionTimeoutTest {
//	@Test(timeOut= 2000, expectedExceptions=NumberFormatException.class)
//	public void infiniteLoopTest()
//	{
//		int i =1;
//		while(i==1)
//		{
//			System.out.println(i);
//		}
//	}
	
	@Test()
	public void test1()
	{
		String s = "100a";
		Integer.parseInt(s);
	}

}
