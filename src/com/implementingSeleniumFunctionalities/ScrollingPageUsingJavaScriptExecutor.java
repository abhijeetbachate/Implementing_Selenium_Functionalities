package com.implementingSeleniumFunctionalities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollingPageUsingJavaScriptExecutor {

	@Test
	public static void abcd() throws Throwable {
	
		//System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://learn-automation.com/scroll-page-in-selenium-webdriver/");
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("scroll(0,1200)");

	}

}
