package com.comcast.CRM.generic.webdriverutility;

import java.util.concurrent.ThreadPoolExecutor;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public class Utilityobject {
	public static ThreadLocal<ExtentTest>  test=new ThreadLocal<ExtentTest>();
	public static ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	
	public static ExtentTest gettest()
	{
		return test.get();
	}
	public static void settest(ExtentTest actTest)
	{
		test.set(actTest);
	}
	public static WebDriver getdriver()
	{
		return driver.get();
	}
	public static void setdriver(WebDriver actdriver)
	{
		driver.set(actdriver);
	}

	

}
