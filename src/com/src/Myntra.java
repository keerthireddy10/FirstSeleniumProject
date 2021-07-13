package com.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		 

		System.setProperty("webdriver.chrome.driver", "C:\\selenium software\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();

			driver.get("https://www.myntra.com/"); 
			
			driver.manage().window().maximize();//to maximise the screen

			 //Mouse hovers on profile 
			Actions action=new Actions(driver); 

			WebElement option1=driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div")); 

		action.moveToElement(option1).perform(); 

			Thread.sleep(5000); 

			//Selects login 

			

			driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]")).click(); 

			

			//Enter Mobile Number

			driver.findElement(By.xpath("//*[@type=\"tel\"]")).sendKeys("7382554183"); 

			driver.findElement(By.className("submitBottomOption")).click(); 

			 //Click login using Password 

			Thread.sleep(5000); 

			driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div[3]/span")).click();  

			//Enter password  

			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Keerthi@123");;  

			 

			//click on login button 

			driver.findElement(By.xpath("//button[@class='btn primary  lg block submitButton']")).click(); 

			 

			//click on kids 

			Thread.sleep(5000); 
			
			Actions actions=new Actions(driver); 

			actions.moveToElement(driver.findElement(By.xpath("//a[@data-group='kids' and @class='desktop-main']"))).build().perform();  

			 

			//Selects dresses in infants 

			Thread.sleep(5000); 

			driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[3]/div/div/div/div/li[4]/ul/li[5]/a")).click(); 

			 

			 

			//deselect 6M-1Y 

			Thread.sleep(5000); 

			driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[1]/section/div[2]/ul/li[3]/div/label")).click(); 

			 

			//select 0M-6M and deselect 1Y-2Y 

			Thread.sleep(5000); 

			driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[1]/section/div[2]/ul/li[2]/div/label")).click(); 

			 //Mouse hovers on sort-by 

			WebElement option2=driver.findElement(By.className("sort-sortBy")); 

			actions.moveToElement(option2).perform(); 

			 

			//Sort by Popularity  

			driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[1]/section/div[1]/div[1]/div/div/div/ul/li[2]/label")).click(); 

			 

			//Selects 3rd dress 

			Thread.sleep(10000); 

			driver.findElement(By.xpath("//*[@title=\"Wish Karo Girls Burgundy Solid Fit and Flare Dress\"]")).click(); 

			 //closing the driver 
			
			Thread.sleep(8000);

			driver.close(); 

			        

			    } 

			} 


		
		
	


