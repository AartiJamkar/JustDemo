package com.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

	WebDriver w;
	@Parameters("browser")
	@Test
	public void launchBrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
			w = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			w = new FirefoxDriver();
		}
		
		w.get("http://www.google.com/");
		w.findElement(By.name("q")).sendKeys("shoes",Keys.ENTER);
		
	}
	
}
