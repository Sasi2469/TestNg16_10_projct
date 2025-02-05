package org.demoproj;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class OmayoRight extends BaseClass{
	
	
	@BeforeClass
	public void beforClass() throws IOException {
		
		browserLaunch("chrome");
		launchURL(excelReader("Book1", 0, 2, 1));
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

	@Test(groups="rightomayo")
	public void Test1() throws IOException {
		OmayoPOMClass o = new OmayoPOMClass();

		imageValidation(o.getImageElement());

	}
	
	@Test(groups="rightomayo")
	public void Test2() {
		OmayoPOMClass o = new OmayoPOMClass();
       
		sendKeys(o.getSearchThisBlog(), "https://omayo.blogspot.com/");
		click(o.getSearchThisBlogBtn());
	}
	
	@Test(groups="rightomayo")
	public void Test3() {
		OmayoPOMClass o = new OmayoPOMClass();
	click(o.getMaleBtn());
	}
	
	@Test(groups="rightomayo")
	public void Test4() {
		OmayoPOMClass o = new OmayoPOMClass();
		click(o.getAlertDemobtn());
         simpleAlert();
	}
	
	@Test(groups="rightomayo")
	public void Test5() {
		OmayoPOMClass o = new OmayoPOMClass();
           click(o.getOrangeCheckbox());
		click(o.getOrangeCheckbox());
	}
	
	@Test(groups="rightomayo")
	public void Test6() throws InterruptedException {
		OmayoPOMClass o = new OmayoPOMClass();
		click(o.getGetPromptAlertbtn());
		Thread.sleep(3000);
		promptAlertConfirm("sasikumar");
	}
	
	@Test(groups="rightomayo")
	public void Test7()  {
		OmayoPOMClass o = new OmayoPOMClass();
	click(o.getGetConfirmationbtn());
	ConfirmationAlertAccept();
	}
	
	@Test(groups="rightomayo")
	public void Test8()  {
		OmayoPOMClass o = new OmayoPOMClass();
          click(o.getBikeRadioBtn());
          
	}
	
	@Test(groups="rightomayo")
	public void Test9()  {
		OmayoPOMClass o = new OmayoPOMClass();
          click(o.getBookMultiSelectBtn());
          click(o.getBagMultiSelectBtn());
          click(o.getPenMultiSelectBtn());
	}
	
	@Test(groups="rightomayo")
	public void Test12() throws InterruptedException  {
		OmayoPOMClass o = new OmayoPOMClass();
		doubleClick(o.getDoubleClickButn());
		List<WebElement> delayeddropDown = o.getDelayeddropDown();
		
		for (int i=0 ; i< delayeddropDown.size() ; i++) {
			if(delayeddropDown.get(i).isDisplayed()) {
				delayeddropDown.get(i).click();
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(2000);
				javascriptBackPage();
				Thread.sleep(5000);
			}
			
			else {
				doubleClick(o.getDoubleClickButn());
				delayeddropDown.get(i).click();
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(2000);
				javascriptBackPage();
				Thread.sleep(5000);
			}
			

		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
