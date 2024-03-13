package com.BData.com.BData;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class old_MBX {
	
	WebDriver driver ;
	WebElement select,Box,comp,subj,text, fileupload ,rb ;
	@Test()
	//WebElement comp = //input[@placeholder='To'];
	//List<WebElement> elements = driver.findElements(By.xpath("//input[@placeholder='To']"))
     public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Sveltetech\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
	
		driver.get("http://37.120.234.16:3002");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='default-01']")).sendKeys("tejas");  // put the Username
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456"); // put the password
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click(); // click the login  button
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//em[@class='icon-circle icon ni ni-plus']")).click(); // click the compose mail 
//      Thread.sleep(2000);
        
        WebElement comp =driver.findElement(By.xpath("//ul[@class='nk-ibx-head-tools g-1']//li[1]")); // click To select the station 
		comp.click();
		Thread.sleep(1000);
		
     }
}

	


