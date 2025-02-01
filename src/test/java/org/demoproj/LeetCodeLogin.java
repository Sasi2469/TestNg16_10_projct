package org.demoproj;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;
//import  org.demoproj.LeetLoginPageObject;
public class LeetCodeLogin extends BaseClass {

	
	
	@Test
	public void Test1() throws IOException, InterruptedException, AWTException {
		browserLaunch("chrome");
		maximize();
		implicitWait();
		launchURL("https://leetcode.com/accounts/login/");
		
		LeetLoginPageObject ll =new LeetLoginPageObject();
		
		sendKeys(ll.getUsername(), "sasi@gamil.com"); 
		
		sendKeys(ll.getPassword(), "sasi@73664");
		
		Thread.sleep(5000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);
		
	Thread.sleep(2000);
		
		click(ll.getSignInBtn());
		
		String text = getText(ll.getErrorMsg());
		
		
		
		if (text.contains("Too many failed login attempts. Try again later.")) {
			
		//	assertEquals("Error msg "+text+"is shown" ,text,"Too many failed login attempts. Try again later.");
			File screenshotAs = ll.getErrorMsg().getScreenshotAs(OutputType.FILE);
			
			File f = new File("C:\\Users\\sasik\\eclipse-workspace\\TestNg16_10_projct\\target\\Img.jpg");
			 FileUtils.copyFile(screenshotAs, f);
			System.out.println(text);
		}
		
		else if (text.contains("The e-mail address and/or password you specified are not correct.")) {
		//	assertEquals("Error msg "+text+"is shown" ,text,"Too many failed login attempts. Try again later.");
			File screenshotAs = ll.getErrorMsg().getScreenshotAs(OutputType.FILE);
			
			File f = new File("C:\\Users\\sasik\\eclipse-workspace\\TestNg16_10_projct\\target\\img.jpg");
			 FileUtils.copyFile(screenshotAs, f);
			System.out.println(text);
		}
		else {
			System.out.println("Error msg is not shown");
		}
		
	}
	
}
