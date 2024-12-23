package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider_OnGooglesearch {
	WebDriver w;
	@Test (/*dataProviderClass = GoogleSearchData.class, dataProvider = "GoogleData"*/)
	public void Googlesearch(String data)
	{
		w = new ChromeDriver();
		w.get("http://www.google.com/");
		w.findElement(By.name("q")).sendKeys(data,Keys.ENTER);
	}

}
