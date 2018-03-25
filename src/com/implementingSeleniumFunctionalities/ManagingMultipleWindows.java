package com.implementingSeleniumFunctionalities;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ManagingMultipleWindows {

	@Test
	public void managemultiplewindows() throws InterruptedException
	{
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.firefoxdriver.marionette", "geckodriver.exe");
		
		
		//driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.in/");
		String parent = driver.getWindowHandle();
		System.out.println("The name of the parent Window is:"+parent);
		
		driver.findElement(By.xpath(".//*[@id='post-body-6170641642826198246']/a[1]")).click();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath(".//*[@id='post-body-6170641642826198246']/a[2]")).click();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath(".//*[@id='post-body-6170641642826198246']/a[3]")).click();
		driver.switchTo().window(parent);
		
		Set<String> allwindows = driver.getWindowHandles();
		int childwindowscount = allwindows.size();
		System.out.println("The total number of windows open are: "+childwindowscount);
		
		for(String child:allwindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				Thread.sleep(3000);
				driver.close();
			}
		}
		
	}
	
	
}
