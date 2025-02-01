package org.demoproj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	
	@Test
	public void test1() throws AWTException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		
		driver.findElement(By.id("prompt")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("sasikumar");
		Thread.sleep(4000);
		alert.accept();
//		
//		
//		WebElement textbox = driver.findElement(By.id("ta1"));
//		textbox.sendKeys("sasikumar");
//		
//		WebElement upfi = driver.findElement(By.xpath("//form[@action='demo_form.asp']"));
//		
//		Actions a = new Actions(driver);
//		a.moveToElement(upfi).perform();
//		Thread.sleep(5000);
//		
//		upfi.click();
//		Thread.sleep(10000);
//		
//		StringSelection s = new StringSelection ("C:\\Users\\sasik\\eclipse-workspace\\TestNg16_10_projct\\src\\test\\resources\\UploadFile\\Screenshot (659).png");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
//        
//		Robot r = new Robot();
//		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		Thread.sleep(3000);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
//		Thread.sleep(3000);
//
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
		
//		driver.get("https://www.flipkart.com/");
//		
//		WebElement serc = driver.findElement(By.xpath("//input[@type='text']"));
//		serc.sendKeys("iphone 15 plus");
//		
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(4000);
//		
////		Robot r = new Robot();
////		
////		r.keyPress(KeyEvent.VK_ENTER);
////		r.keyPress(KeyEvent.VK_ENTER);
////		
////		Thread.sleep(4000);
//		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[2]")).click();
//	Thread.sleep(4000);
//		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[3]")).click();
//		Thread.sleep(4000);
//////		
//////		Thread.sleep(6000);
////		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[4]")).click();
//		
//		Thread.sleep(10000);
//		System.out.println(driver.getTitle());
//		
//		Set<String> windowHandles = driver.getWindowHandles();
//		
//		int count = 1 ;
//		for (String string : windowHandles) {
//			if(count==4) {
//				driver.switchTo().window(string);
//				Thread.sleep(2000);
//			}
//			Thread.sleep(2000);
//			count++;
//		}
//		Thread.sleep(4000);
//		System.out.println(driver.getTitle());
//	System.out.println(driver.findElement(By.xpath("//span[@class='VU-ZEz']")).getText());
////	
////driver.findElement(By.xpath("(//div[@class='slAVV4 qt3Pmj'])[2]")).click();
////
////Set<String> windowHandless = driver.getWindowHandles();
////int counts = 1 ;
////for (String string2 : windowHandless) {
////	if(counts==3) {
////		driver.switchTo().window(string2);
////		
////	}
////	counts++;
////}
////Thread.sleep(4000);
////
////System.out.println(driver.getTitle());	

	}
	
}
