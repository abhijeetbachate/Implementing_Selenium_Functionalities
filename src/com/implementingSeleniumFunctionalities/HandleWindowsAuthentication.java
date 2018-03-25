package com.implementingSeleniumFunctionalities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWindowsAuthentication {

	@Test
	public void handlewindowsauthusingAutoIT() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.engprod-charter.net");
		Runtime.getRuntime().exec("C:\\Users\\Abhijeet_Bachate\\Desktop\\AutoIT Scripts\\HandlingWindowsAuth.exe");
	}
}
