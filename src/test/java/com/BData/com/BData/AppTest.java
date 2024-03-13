package com.BData.com.BData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;




public class AppTest {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Sveltetech\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://192.168.15.109:4200");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	
	driver.findElement(By.id("exampleInputEmail1")).sendKeys("test");
	driver.findElement(By.id("exampleInputPassword1")).sendKeys("qwerty");
	driver.findElement(By.xpath("//button[@class= 'btn my-btn mt-3 d-block m-auto']")).click();
	Thread.sleep(6000);
	
	
	driver.findElement(By.xpath("//a[@ng-reflect-router-link='/register']")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abc");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("paper@jkpolice.in");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Paper");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("puri");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("abcde12345");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("abcde12345");
    Thread.sleep(2000);
    
    
    WebElement ddown = driver.findElement(By.xpath("//select[@id='selectuser']"));
    Select select = new Select(ddown);
    Thread.sleep(3000);
    select.selectByValue("SectionOfficer");
    Thread.sleep(3000);
    
   driver.findElement(By.xpath("//a[@id='ssphrtab']")).click();
   Thread.sleep(3000);
    
   WebElement radio = driver.findElement(By.xpath("(//label[normalize-space()='Select All'])[1]"));
   radio.click();
   Thread.sleep(6000);
    
    
   driver.findElement(By.xpath("//button[normalize-space()='Create User']")).click();
   Thread.sleep(3000);
    
   driver.findElement(By.xpath("//button[normalize-space()='List']")).click();
   Thread.sleep(3000);
   
   driver.findElement(By.xpath("(//button[normalize-space()='Master Module'])[1]"));
   Thread.sleep(2000);
   driver.findElement(By.xpath("//a[@routerlink= '/add_act']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//input[@placeholder='Act']")).sendKeys("Berlin");
   Thread.sleep(2000);
   driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//button[normalize-space()='List']")).click();
   
   
   
   
   
    
    
    

	
	
	
    }
}
