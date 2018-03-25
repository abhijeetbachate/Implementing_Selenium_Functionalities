package com.implementingSeleniumFunctionalities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void validatename() {
		
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		//System.setProperty("webdriver.firefox.marrionette", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Abhijeet_Bachate/Desktop/HandlingFrames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//a[@id='123']"));
		System.out.println("The text is " + ele.getText());
	}

}
