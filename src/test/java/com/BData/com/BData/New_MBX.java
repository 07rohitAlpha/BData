package com.BData.com.BData;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class New_MBX {

	WebDriver driver;
//       @BeforeClass
	@Test
	    public static void URL() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://37.120.234.16:3005/");
//		boolean img= driver.findElement(By.xpath("//img[@alt='mailboxLogo']")).isDisplayed();
//		Assert.assertTrue(img);
		Thread.sleep(3000);
       
//       @Test(priority=1)
//		public void logintest() throws InterruptedException{
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("amit");  // put the Username
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456"); // put the password
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click(); // click the login  button
		Thread.sleep(3000);
//		boolean img1=driver.findElement(By.xpath("//img[@alt='mailboxLogo']")).isDisplayed();
//		Assert.assertTrue(img1);
//		Thread.sleep(1000);
	  
		WebElement comp= driver.findElement(By.xpath("//span[@class='sidebar-name']"));
		comp.click();
		Thread.sleep(2000);
		WebElement To= driver.findElement(By.xpath("//input[@placeholder='To']"));
		To.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='branch-1302']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("welcome to");
		Thread.sleep(5000);
		//to perform Scroll on application using Selenium
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "//iframe[@id='mytextarea_ifr']");
		Thread.sleep(2000);
		
			
		
		WebElement img= driver.findElement(By.xpath("//em[@class='icon ni ni-clip-v']"));
		img.click();
		Thread.sleep(1000);
		img.clear();

	
}
}