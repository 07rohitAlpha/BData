package com.BData.com.BData;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SSP_A {


		private static int i;

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Sveltetech\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://192.168.15.109:4200");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.id("exampleInputEmail1")).sendKeys("test");
			driver.findElement(By.id("exampleInputPassword1")).sendKeys("qwerty");
			driver.findElement(By.xpath("//button[@class= 'btn my-btn mt-3 d-block m-auto']")).click();
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//i[@class='fas fa-bars fontNav mt-1']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//button[normalize-space()='SSP (A)'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[normalize-space()='ATM Robbery Cases in J&K']")).click();
			Thread.sleep(2000);
			
			
			// one Case select the date from the DatePicker 
			
		WebElement sendate = driver.findElement(By.xpath("//input[@placeholder='date']"));
		    sendate.sendKeys("02-11-2022");
		    
		   //dropdowsn 
		   driver.findElement(By.xpath("//input[@id='bankid']")).click();
		   Thread.sleep(1000);
		   List<WebElement> list= driver.findElements(By.xpath("//datalist[@id='banklist']//option"));
		   System.out.println("Number of dropdown:"+list.size());
		   
//		   for(i=0;i<list.size();i++) {
//			   System.out.println(list.get(i).getText());
//			   if(list.get(i).getText().contains("J&K")) {
//				   list.get(i).click();
//				   break;
//		   }
//		   }
		   for (WebElement type:list) {
			   if(type.getText().equals("SBI")) {
				   type.click();
				   break;
			   }
		   }
		   
		   
	
		 // select.selectByVisibleText("SBI");
			
		     
		    
//		    driver.findElement(By.xpath("//input[@placeholder='date']")).click()
//			Date d = new Date(1);
//			SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
//			String date = formatter.format(d);
//			String splitter[] = date.split("-");
//			String month_year = splitter[1];
//			String day = splitter[0]; 
//			System.out.println(month_year);
//			System.out.println(day);

	}

		private static Select Select(WebElement ddwon) {
			// TODO Auto-generated method stub
			return null;
		}

}
