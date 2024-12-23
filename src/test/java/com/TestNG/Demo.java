package com.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Demo {

	@Test (priority = 2, invocationCount = 2) 
	public void google() throws Exception
	{
		WebDriver w = new ChromeDriver();
		w.get("https://www.google.com/");
		Thread.sleep(5000);
		w.quit();
	}
	
	@Test (priority = 1, enabled = true)
	public void facebook() throws Exception
	{
		WebDriver w = new ChromeDriver();
		w.get("https://www.facebook.com/");
		Thread.sleep(5000);
		w.quit();
	}
	
}
