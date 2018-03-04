package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvocationCountTest {
//@Test(invocationCount=10)
//public void sum()
//{
//	int a =10;
//	int b = 20;
//	int c = a+b;
//	System.out.println("sum is "+ c);
//			
//}
	@DataProvider(name="data")
	public Object[][] getdata()
	{
		Object[][] obj = new Object[3][2];
		
		obj[0][0] = "string1";
		obj[0][1] = 1;
		
		obj[1][0] = "string2";
		obj[1][1] = 2;
		
		obj[2][0] = "string3";
		obj[2][1] = 3;
		
		return obj;
	}
	
	@Test(dataProvider= "data")
	public void test1(String a, int b)
	{
		System.out.println("string="+a+" number="+b);
	}
}
