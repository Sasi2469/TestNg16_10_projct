package org.demoproj;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.remote.server.handler.MaximizeWindow;
import org.openqa.selenium.remote.server.handler.SetScriptTimeout;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OmayoLeft extends BaseClass {

	
	
	@BeforeClass
	public void beforeClass() throws IOException {

		browserLaunch("chrome");
		launchURL(excelReader("Book1",0,2, 1));
		maximize();
		implicitWait();
		classExecutionStarted(this.toString());
			}

	@AfterClass
	public void afterClass() {
		classExecutionEnded(this.toString());
		quit();

	}

	@BeforeMethod
	public void beforeMethod() {
		Startingtime();
       
	}

	@AfterMethod
	public void afterMethod() {
		Endingtime();

	}
	
	@Parameters({"car1","car2"})
	@Test( groups="leftomayo")
	public void Test1(String car1, String car2) {
		OmayoPOMClass o = new OmayoPOMClass();
		selectByVisibleText(o.getCars(), car1);
		selectByVisibleText(o.getCars(), car2);
		
}
	@Test( groups="leftomayo")
	public void Test2() {
		OmayoPOMClass o = new OmayoPOMClass();
		//click(OmayoPOMClass.getInstance().getNewLetters());
		selectByVisibleText(o.getNewLetters(), "doc 2");
		
		
  }
	
	@Test( groups="leftomayo")
	public void Test3() throws AWTException, InterruptedException {
		OmayoPOMClass o = new OmayoPOMClass();
	 chooseFile(o.getFileUpload(),"C:\\Users\\sasik\\eclipse-workspace\\TestNg16_10_projct\\target\\UploadFile\\packages.txt");
          
	}
	
	@Test( groups="leftomayo")
	public void Test4() throws InterruptedException {
		OmayoPOMClass o = new OmayoPOMClass();
		click(o.getCheckthisbtn());
		Thread.sleep(12000);
		click(o.getMrOption());
}
	
	@Test( groups="leftomayo")
	public void Test5() {
		OmayoPOMClass o = new OmayoPOMClass();

		doubleClick(o.getDoubleClickHere());
        simpleAlert();
	}
	
	
	
	
}
