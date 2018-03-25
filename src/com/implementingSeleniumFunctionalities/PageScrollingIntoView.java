package com.implementingSeleniumFunctionalities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PageScrollingIntoView {

	@Test
	public void pagescrollingintovieworscrollforelements()
	{
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();  
		driver.get("http://learn-automation.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='menu-item-1744']/a")).click();   
		
		JavascriptExecutor je = (JavascriptExecutor) driver; 
		//JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div[@class='navigation']/preceding::div[@class='alignleft']/a"));
		je.executeScript("argument[0].scrollIntoView(true)", element);
		System.out.println("The element name is: "+element.getText());
		//je.executeScript("arguments[0].scrollIntoView(true);",element);
		//((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
		
	}
}
