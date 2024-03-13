
package com.BData.com.BData;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MBX {
	
	WebDriver driver ;
	WebElement select,Box,comp,subj,text, fileupload ,rb ;
	
	//WebElement comp = //input[@placeholder='To'];
	//List<WebElement> elements = driver.findElements(By.xpath("//input[@placeholder='To']"));
	@BeforeClass
     public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\com.BData\\Driver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	} 
		@Test(priority=1)
		public void launchapplication() {
		driver.get("http://14.140.15.95:3000/login");
		boolean img= driver.findElement(By.xpath("//h5[@class='nk-block-title text-center']")).isDisplayed();
		Assert.assertTrue(img);
		}
		
		@Test(priority=2)
		public void logintest() throws InterruptedException{
		driver.findElement(By.xpath("//input[@id='default-01']")).sendKeys("tejas");  // put the Username
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456"); // put the password
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click(); // click the login  button
		Thread.sleep(3000);
		boolean img1=driver.findElement(By.xpath("//em[@class='icon ni ni-inbox bg-purple-dim']")).isDisplayed();
		Assert.assertTrue(img1);
		Thread.sleep(1000);
		}
		@Test(priority=3)
		public void currURltest() throws InterruptedException {
		String actualUrl= driver.getCurrentUrl();
		String expectedUrl = "http://37.120.234.16:3004/two-column-view";
		Assert.assertEquals(actualUrl, expectedUrl);
		Thread.sleep(1000);
	    }
		@Test(priority=4)
		public void titletest() throws InterruptedException {
		String actualtitle= driver.getTitle();
		String expectedtitle = "Mail Box";
		Assert.assertEquals(actualtitle, expectedtitle);
		Thread.sleep(2000);
		}
//		@Test(priority=5)
//		public void Composetest() throws InterruptedException {
//	    driver.findElement(By.xpath("//em[@class='icon-circle icon ni ni-plus']")).click(); // click the compose mail 
//		Thread.sleep(2000);
//		
//		WebElement comp =driver.findElement(By.xpath("//input[@placeholder='To']")); // click To select the station 
//		comp.click();
//		Thread.sleep(1000);
//		
//		
//		
//		WebElement ACC=driver.findElement(By.xpath("//div[contains(text(),'ACC')]"));
//		ACC.click();
//		driver.findElement(By.xpath("(//label[@for='branch-72'][normalize-space()='AS-ACC'])[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//label[@for='branch-73'][normalize-space()='GG-ACC'])[2]")).click();
//		ACC.click();
//		Thread.sleep(2000);
		
//		WebElement Admin= driver.findElement(By.xpath("//div[contains(text(),'ADMIN')]"));
//		Admin.click();
//		driver.findElement(By.xpath("(//label[@for='branch-98'][normalize-space()='DD-ADMIN'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-59'][normalize-space()='EE-ADMIN'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-96'][normalize-space()='YY-ADMIN'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-62'][normalize-space()='YY-ADMIN'])[2]")).click();
//		Thread.sleep(3000);
//		Admin.click();
//		Thread.sleep(1000);
//		WebElement AFG = driver.findElement(By.xpath("//div[@class='other-branch-name']//div[contains(text(),'AFG')]"));
//		AFG.click();
//		driver.findElement(By.xpath("(//label[@for='branch-57'][normalize-space()='FF-AFG'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-42'][normalize-space()='YY-AFG'])[2]")).click();
//		Thread.sleep(1000);
//		AFG.click();
//		Thread.sleep(1000);
//		WebElement AND = driver.findElement(By.xpath("//div[contains(text(),'AND')]"));
//		AND.click();
//		driver.findElement(By.xpath("(//label[@for='branch-68'][normalize-space()='DD-AND'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-90'][normalize-space()='OPS-AND'])[2]")).click();
//		Thread.sleep(1000);
//		AND.click();
//		Thread.sleep(1000);
//		WebElement ARM = driver.findElement(By.xpath("//div[contains(text(),'ARM')]"));
//		ARM.click();
//		driver.findElement(By.xpath("(//label[@for='branch-55'][normalize-space()='DS-ARM'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-56'][normalize-space()='HH-ARM'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-97'][normalize-space()='JD-ARM'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-95'][normalize-space()='KK-ARM'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-91'][normalize-space()='US-ARM'])[2]")).click();
//		ARM.click();
//		Thread.sleep(1000);
//		WebElement ATA = driver.findElement(By.xpath("//div[contains(text(),'ATA')]"));
//		ATA.click();
//		driver.findElement(By.xpath("(//label[@for='branch-33'][normalize-space()='EE-ATA'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-74'][normalize-space()='EE-ATA'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-84'][normalize-space()='HH-ATA'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-60'][normalize-space()='YY-ATA'])[2]")).click();
//		Thread.sleep(1000);
//		ATA.click();
//		Thread.sleep(1000);
//		WebElement BB= driver.findElement(By.xpath("//div[@class='other-branch-name']//div[contains(text(),'BBB')]"));
//		BB.click();
//		driver.findElement(By.xpath("(//label[@for='branch-102'][normalize-space()='BB-BBB'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-2'][normalize-space()='BB-BBB'])[2]")).click();
//		Thread.sleep(1000); 
//		BB.click();
//		Thread.sleep(1000);
//		WebElement BEN=driver.findElement(By.xpath("//div[contains(text(),'BEN')]"));
//		BEN.click();
//		driver.findElement(By.xpath("(//label[@for='branch-79'][normalize-space()='SS-BEN'])[2]")).click();
//		BEN.click();
//		Thread.sleep(1000);
//		WebElement BRB= driver.findElement(By.xpath("//div[@class='other-branch-name']//div[contains(text(),'BRB')]"));
//		BRB.click();
//		driver.findElement(By.xpath("(//label[@for='branch-53'][normalize-space()='GG-BRB'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-29'][normalize-space()='GG-BRB'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-44'][normalize-space()='GG-BRB'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-38'][normalize-space()='TT-BRB'])[2]")).click();
//		Thread.sleep(1000);
//		BRB.click();
//		Thread.sleep(1000);
//		WebElement BWA = driver.findElement(By.xpath("//div[contains(text(),'BWA')]"));
//		BWA.click();
//		driver.findElement(By.xpath("(//label[@for='branch-82'][normalize-space()='AS-BWA'])[2]")).click();
//		driver.findElement(By.xpath("(//label[@for='branch-93'][normalize-space()='US-BWA'])[2]")).click();
//		Thread.sleep(1000);
//		BWA.click();
//		Thread.sleep(1000);
//		WebElement CAN= driver.findElement(By.xpath("//div[@class='other-branch-name']//div[contains(text(),'CAN')]"));
//		CAN.click();
//		driver.findElement(By.xpath("(//label[@for='branch-50'][normalize-space()='OPS-CAN'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-61'][normalize-space()='US-CAN'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-75'][normalize-space()='US-CAN'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-49'][normalize-space()='YY-CAN'])[2]")).click();
//		Thread.sleep(1000);
//		CAN.click();
//		
////		WebElement CCC= driver.findElement(By.xpath("//div[@class='other-branch-name']//div[contains(text(),'CCC')]"));
////		CCC.click();
////		driver.findElement(By.xpath("(//label[@for='branch-3'][normalize-space()='CC-CCC'])[2]")).click();
////		Thread.sleep(1000);
////		CCC.click();
//		WebElement CHN = driver.findElement(By.xpath("//div[contains(text(),'CHN')]"));
//		CHN.click();
//		driver.findElement(By.xpath("(//label[@for='branch-71'][normalize-space()='AS-CHN'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-80'][normalize-space()='EE-CHN'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-47'][normalize-space()='FF-CHN'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-43'][normalize-space()='TT-CHN'])[2]")).click();
//		Thread.sleep(1000);
//		CHN.click();
//		WebElement COM= driver.findElement(By.xpath("//div[contains(text(),'COM')]"));
//		COM.click();
//		driver.findElement(By.xpath("(//label[@for='branch-52'][normalize-space()='AS-COM'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-58'][normalize-space()='CC-COM'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-67'][normalize-space()='KK-COM'])[2]")).click();
//		Thread.sleep(1000);
//		COM.click();
//		Thread.sleep(1000);
//		WebElement CUW = driver.findElement(By.xpath("//div[@class='other-branch-name']//div[contains(text(),'CUW')]"));		
//		CUW.click();
//		driver.findElement(By.xpath("(//label[@for='branch-48'][normalize-space()='DD-CUW'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-46'][normalize-space()='SS-CUW'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-40'][normalize-space()='US-CUW'])[2]")).click();
//		Thread.sleep(1000);
//		CUW.click();
//		Thread.sleep(1000);
//		WebElement CYM=driver.findElement(By.xpath("//div[contains(text(),'CYM')]"));
//		CYM.click();
//		driver.findElement(By.xpath("(//label[@for='branch-35'][normalize-space()='AS-CYM'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-70'][normalize-space()='GG-CYM'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-76'][normalize-space()='SS-CYM'])[2]")).click();
//		Thread.sleep(1000);
//		CYM.click();
//		WebElement DEL=driver.findElement(By.xpath("//div[@class='other-branch-name']//div[contains(text(),'DEL')]"));
//		DEL.click();
//		driver.findElement(By.xpath("(//label[@for='branch-27'][normalize-space()='AA-DEL'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-77'][normalize-space()='II-DEL'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-92'][normalize-space()='KK-DEL'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-78'][normalize-space()='OPS-DEL'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-88'][normalize-space()='PS-DEL'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-30'][normalize-space()='US-DEL'])[2]")).click();
//		Thread.sleep(1000);
//		DEL.click();
//		WebElement DIR=driver.findElement(By.xpath("//div[@class='other-branch-name']//div[contains(text(),'DIR')]"));
//		DIR.click();
//		driver.findElement(By.xpath("(//label[@for='branch-36'][normalize-space()='GG-DIR'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-85'][normalize-space()='TT-DIR'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-83'][normalize-space()='YY-DIR'])[2]")).click();
//		Thread.sleep(1000);
//		DIR.click();
//	    WebElement DOM = driver.findElement(By.xpath("//div[@class='other-branch-name']//div[contains(text(),'DOM')]"));
//		DOM.click();
//		driver.findElement(By.xpath("(//label[@for='branch-64'][normalize-space()='FF-DOM'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-54'][normalize-space()='GG-DOM'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-26'][normalize-space()='GG-DOM'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-86'][normalize-space()='KK-DOM'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-66'][normalize-space()='US-DOM'])[2]")).click();
//		Thread.sleep(1000);
//		DOM.click();
//		WebElement DZA= driver.findElement(By.xpath("//div[@class='other-branch-name']//div[contains(text(),'DZA')]"));
//		DZA.click();
//		driver.findElement(By.xpath("(//label[@for='branch-87'][normalize-space()='CC-DZA'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-28'][normalize-space()='KK-DZA'])[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-63'][normalize-space()='OPS-DZA'])[2]")).click();
//		Thread.sleep(1000);
//		DZA.click();
//		Thread.sleep(1000);
//		
//		
//		comp.click();
//		Thread.sleep(1000);
//		comp.sendKeys("yyy");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//label[@for='branch-25'][normalize-space()='YY-YYY'])[2]")).click();
//		Thread.sleep(2000);
//		comp.clear();
//		Thread.sleep(3000);
//		comp.sendKeys("XXX");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//label[@for='branch-24'][normalize-space()='HH-XXX'])[2]")).click();
//		Thread.sleep(2000);
//		comp.clear();
//		Thread.sleep(1000);
//		}
//		@Test(priority=6)
//		public void Subjecttest() throws InterruptedException {
//		WebElement subj=driver.findElement(By.xpath("//input[@id='subject']"));
//		subj.sendKeys("check this mail ");
//		Thread.sleep(3000);
//		}
//		@Test(priority=7)
//		public void Texttest() throws InterruptedException {
//		WebElement text= driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
//		text.sendKeys("please send this mail");
//		Thread.sleep(3000);
//		}
//		@Test(priority=8) 
//		public void Imagetest() throws InterruptedException, AWTException {
//		WebElement imageupload=driver.findElement(By.xpath("//em[@class='icon ni ni-clip-v']"));
//		imageupload.click();
//		Thread.sleep(1000);
//		
//		// creating object of Robot class
//	    Robot rb = new Robot();
//	 
//	    // copying File path to Clipboard
//	    StringSelection file1 = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\1.1.jpg");
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file1, null);
//	    
//	    // press Contol+V for pasting
//	    rb.keyPress(KeyEvent.VK_CONTROL);
//	    rb.keyPress(KeyEvent.VK_V);
//	     Thread.sleep(1000);
//	    // release Contol+V for pasting
//	    rb.keyRelease(KeyEvent.VK_CONTROL);
//	    rb.keyRelease(KeyEvent.VK_V);
//	    Thread.sleep(1000);
//	    // for pressing and releasing Enter
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(20000); 
//		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
//		
//		imageupload.click();
//	    StringSelection file2 = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\2.1.jpg");
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file2, null);
//	    
//	    // press Contol+V for pasting
//	     rb.keyPress(KeyEvent.VK_CONTROL);
//	     rb.keyPress(KeyEvent.VK_V);
//	     Thread.sleep(1000);
//	   // release Contol+V for pasting
//	     rb.keyRelease(KeyEvent.VK_CONTROL);
//	     rb.keyRelease(KeyEvent.VK_V);
//	     Thread.sleep(1000);
//	    // for pressing and releasing Enter
//		 rb.keyPress(KeyEvent.VK_ENTER);
//		 rb.keyRelease(KeyEvent.VK_ENTER);
//		 Thread.sleep(1000);
//		 
		        
//	    StringSelection file3 = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\1.1.jpg");
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file3, null);
//	    
//	 // press Contol+V for pasting
//	     rb.keyPress(KeyEvent.VK_CONTROL);
//	     rb.keyPress(KeyEvent.VK_V);
//	 
//	     // for pressing and releasing Enter
//		    rb.keyPress(KeyEvent.VK_ENTER);
//		    rb.keyRelease(KeyEvent.VK_ENTER);
//		    
//	    StringSelection file4 = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\1.1.jpg");
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file4, null);
//	    
//	 // press Contol+V for pasting
//	     rb.keyPress(KeyEvent.VK_CONTROL);
//	     rb.keyPress(KeyEvent.VK_V);
//	 
//	     // for pressing and releasing Enter
//		    rb.keyPress(KeyEvent.VK_ENTER);
//		    rb.keyRelease(KeyEvent.VK_ENTER);
//		    
//	    StringSelection file5 = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\1.1.jpg");
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file5, null);
//	    
//	 // press Contol+V for pasting
//	     rb.keyPress(KeyEvent.VK_CONTROL);
//	     rb.keyPress(KeyEvent.VK_V);
//	 
//	     // for pressing and releasing Enter
//		    rb.keyPress(KeyEvent.VK_ENTER);
//		    rb.keyRelease(KeyEvent.VK_ENTER);
//		    
//	    StringSelection file6 = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\1.1.jpg");
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file6, null);
//	    
//	 // press Contol+V for pasting
//	     rb.keyPress(KeyEvent.VK_CONTROL);
//	     rb.keyPress(KeyEvent.VK_V);
//	 
//	     // for pressing and releasing Enter
//		    rb.keyPress(KeyEvent.VK_ENTER);
//		    rb.keyRelease(KeyEvent.VK_ENTER);
//		    
//	    StringSelection file7 = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\1.1.jpg");
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file7, null);
//	    
//	 // press Contol+V for pasting
//	     rb.keyPress(KeyEvent.VK_CONTROL);
//	     rb.keyPress(KeyEvent.VK_V);
//	 
//	     // for pressing and releasing Enter
//		    rb.keyPress(KeyEvent.VK_ENTER);
//		    rb.keyRelease(KeyEvent.VK_ENTER);
//		    
//	    StringSelection file8 = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\1.1.jpg");
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file8, null);
//	    
//	 // press Contol+V for pasting
//	     rb.keyPress(KeyEvent.VK_CONTROL);
//	     rb.keyPress(KeyEvent.VK_V);
//	 
//	     // for pressing and releasing Enter
//		    rb.keyPress(KeyEvent.VK_ENTER);
//		    rb.keyRelease(KeyEvent.VK_ENTER);
//		    
//	    StringSelection file9 = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\1.1.jpg");
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file9, null);
//	    
//	 // press Contol+V for pasting
//	     rb.keyPress(KeyEvent.VK_CONTROL);
//	     rb.keyPress(KeyEvent.VK_V);
//	 
//	     // for pressing and releasing Enter
//		    rb.keyPress(KeyEvent.VK_ENTER);
//		    rb.keyRelease(KeyEvent.VK_ENTER);
//		    
//	    StringSelection file10 = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\1.1.jpg");
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file10, null);
//	    
//	 // press Contol+V for pasting
//	     rb.keyPress(KeyEvent.VK_CONTROL);
//	     rb.keyPress(KeyEvent.VK_V);
//	 
//	     // for pressing and releasing Enter
//		    rb.keyPress(KeyEvent.VK_ENTER);
//		    rb.keyRelease(KeyEvent.VK_ENTER);
//		    
	   
		    
//		   }
	     
	     
//	    // release Contol+V for pasting
//	    rb.keyRelease(KeyEvent.VK_CONTROL);
//	    rb.keyRelease(KeyEvent.VK_V);
	 
	    
	

		
		
		
//		}
//		@Test(priority=9)
//		public void Senttest() throws InterruptedException {
//		WebElement send =driver.findElement(By.xpath("//button[normalize-space()='Send']"));
//		send.click();
//		Thread.sleep(2000);
//		}
		
		@Test(priority=10)
		public void AllCheckbox() throws InterruptedException {
		WebElement Box=	driver.findElement(By.xpath("//input[@id='allSelect']"));
		Box.click();
		WebElement select = driver.findElement(By.xpath("(//em[@class='ni ni-downward-alt-fill'])[1]"));
		select.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Mark as Unread']")).click();
		Thread.sleep(5000);
		
		Box.click();
		select.click();
		driver.findElement(By.xpath("//li[normalize-space()='Mark as Read']")).click();
		Thread.sleep(6000);
		
		Box.click();
		select.click();
		driver.findElement(By.xpath("//li[normalize-space()='Move to Archive']")).click();
		}
		
	
//		@Test(priority=11)
//		public void Singlecheckbox() {
//	    driver.findElement(By.xpath("//label[@for='2769']")).click();
//		driver.findElement(By.xpath("//label[@for='2057']")).click();
//		driver.findElement(By.xpath("//label[@for='2693']")).click();
//		driver.findElement(By.xpath("//label[@for='26']")).click();
//		driver.findElement(By.xpath("//label[@for='2673']")).click();
//		driver.findElement(By.xpath("//label[@for='2672']")).click();
//		driver.findElement(By.xpath("//label[@for='2671']")).click();
//		driver.findElement(By.xpath("//label[@for='2670']")).click();
//		driver.findElement(By.xpath("//label[@for='2663']")).click();
//		driver.findElement(By.xpath("//label[@for='2664']")).click();
//		driver.findElement(By.xpath("//label[@for='2664']")).click();
//		driver.findElement(By.xpath("//label[@for='2666']")).click();
//		driver.findElement(By.xpath("//label[@for='2667']")).click();
//		driver.findElement(By.xpath("//label[@for='2668']")).click();
//		driver.findElement(By.xpath("//label[@for='2669']")).click();
//		driver.findElement(By.xpath("//label[@for='2662']")).click();
//		driver.findElement(By.xpath("//label[@for='2658']")).click();
//		driver.findElement(By.xpath("//label[@for='2657']")).click();
//		driver.findElement(By.xpath("//label[@for='2656']")).click();
//		driver.findElement(By.xpath("//label[@for='2655']")).click();
//		}
//		
//        @Test(priority=12)
//		public void Archive() {
//        Box.click();
//		select.click();
//		driver.findElement(By.xpath("//li[normalize-space()='Move to Archive']")).click();
//		}
		
		
		@Test(priority=13)
	    public void Addfolder() {
	    Box.click();
		WebElement folder = driver.findElement(By.xpath("//li[@class='add-to-folder']"));
		folder.click();
		
		
	}
}
		
	

	
	







