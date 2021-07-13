package com.src;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeBrowserEx {

	public static void main(String args[]) throws InterruptedException
	{
		
	
	System.setProperty("webdriver.ie.driver", "C:\\selenium software\\IEDriverServer.exe");
	WebDriver driver= new InternetExplorerDriver();
	driver.get("http://WWW.google.com");
	Thread.sleep(3000);
     driver.close();
}
}

