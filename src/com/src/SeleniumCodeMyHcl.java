package com.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCodeMyHcl {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium software\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://WWW.myhcl.com");
		
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("input[name=\"loginfmt\"]")).sendKeys("naramreddy.keerthi@hcl.com");
		
		driver.findElement(By.cssSelector("input[id=\"idSIButton9\"]")).click();
		
		Thread.sleep(4000);
		
        driver.findElement(By.cssSelector("input[name=\"passwd\"]")).sendKeys("Hi@123");
        
        driver.findElement(By.cssSelector("input[id=\"idSIButton9\"]")).click();
		
		//driver.findElement(By.cssSelector("input[name=\"passwd\"]")).submit();
		
		
		
	}
	
}
