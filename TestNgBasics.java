package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;



public class TestNgBasics {
	
	@BeforeSuite
	public void setUp()
	{
		System.out.println("setup system property for chrome");
	}
	
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("Launch chrome browser");
	}
	@BeforeClass
	public void login()
	{
	System.out.println("login");	
	}
	
	@BeforeMethod
	public void enterUrl()
	{
		System.out.println("enter url");
	}
	
	@Test
	@Parameters({"userid"})
	public void googleTitle(String userid)
	{
		System.out.println("google title test");
		System.out.println(userid);
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout");
	}
	@AfterTest
	public void deleteallcookies()
	{
		System.out.println("delete all cookies");
	}
	@AfterClass
	public void closebrowser()
	{
		System.out.println("close browser");
	}
	@AfterSuite
	public void generateTestrepote()
	{
		System.out.println("generateTestrepote");
	}

}
