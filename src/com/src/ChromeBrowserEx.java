package com.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\selenium software\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://WWW.facebook.com");
		
		driver.findElement(By.name("email")).sendKeys("keerthinaramreddy@gmail.com");
		
		//driver.findElement(By.cssSelector("email")).sendKeys("keerthinaramreddy@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("keerthi@123");
		
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//Thread.sleep(3000);
		
		
		driver.findElement(By.partialLinkText("password?")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("keerthi@gmail.com");
		
		
		
		driver.close();
		
		
		
	}

}
