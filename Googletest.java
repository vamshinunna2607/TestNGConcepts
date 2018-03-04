package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Googletest {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vamsh\\eclipse-workspace\\SeleniumDemo\\Lib\\geckoDriver\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	@Test(priority=2,groups="B")
	public void googleTitleTest()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=1,groups="A")
	public void googleLogoTest() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean b = driver.findElement(By.xpath(".//*[@id='hplogo']/a/img")).isDisplayed();
		System.out.println(b);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
