package com.implementingSeleniumFunctionalities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class UploadingFiles {

	@Test
	public void UploadFile() throws Throwable {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/mail/u/0/#inbox");  
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("bachate.abhijeet5@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).click(); 
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("7588585873");
		driver.findElement(By.xpath(".//*[@id='passwordNext']/div[2]")).click();
	    driver.manage().window().maximize();   
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
		driver.findElement(By.xpath(".//*[@id=':iw']/div/div")).click();
		driver.findElement(By.xpath(".//*[@id=':q1']")).click();
		
		Pattern p1 = new Pattern("‪C:\\Users\\Abhijeet_Bachate\\Desktop\\OpenButtonGmail.PNG");
		
		Screen s = new Screen();
		s.type("C:\\Users\\Abhijeet_Bachate\\Desktop\\Demo.txt");
		s.click(p1);
		
	}
}
