package com.implementingSeleniumFunctionalities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformingGoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("lst-ib")).sendKeys("Java");  
		//driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("Java");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		System.out.println("The Total related searches are "+list.size());

		for(int i=0; i<=list.size(); i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("java tutorial"))
			{
				list.get(i).click();
				break;
			}
		}
	}
	
}
