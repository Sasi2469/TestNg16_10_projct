package org.demoproj;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class OmayoCentre extends BaseClass {

	@BeforeClass
	public void beforeClass() throws IOException {

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
     
	
	@Test( groups = "centreomayo")
	public void Test1() {
		OmayoPOMClass o = new OmayoPOMClass();
		sendKeys(o.getTextAreaField1(), "welcome to java class");
		clear(o.getTextAreaField2());
		sendKeys(o.getTextAreaField2(), "welcome to selenium testing");

	}

	@Test( groups = "centreomayo")
	public void Test2() {
		OmayoPOMClass o = new OmayoPOMClass();
		switchToFrame(o.getIframe1());
		System.out.println("text from frame1: " + o.getSeleniumTxt().getText());
		switchToParentFrame();
	}

	@Test( groups = "centreomayo")
	public void Test3() {
		OmayoPOMClass o = new OmayoPOMClass();
		switchToFrame(o.getIframe2());
		System.out.println("text from frame2: " + o.getNextTxt().getText());
		switchToParentFrame();
	}

	
	@Test( groups = "centreomayo", dataProvider="username&password", dataProviderClass=Data2.class)
	public void Test4(String username, String password) {
		OmayoPOMClass o = new OmayoPOMClass();
		sendKeys(o.getHtmlUsername1(), username);
		sendKeys(o.getHtmlpassword1(), password);
		click(o.getHtmlLogIn());
		o.getHtmlUsername1().clear();
		o.getHtmlpassword1().clear();
	}

	@Test( groups = "centreomayo", dataProvider="username&password2", dataProviderClass= Data2.class)
	public void Test5(String username, String password) {
		OmayoPOMClass o = new OmayoPOMClass();
		sendKeys(o.getLoginpageUsername(), username);
		sendKeys(o.getLoginpagePassword(), password);
		click(o.getSimpleLogin());
		simpleAlert();
	}

	@Test( groups = "centreomayo")
	public void Test6() {
		OmayoPOMClass o = new OmayoPOMClass();

		List<WebElement> trValues = o.getTable1().findElements(By.tagName("tr"));
		System.out.println("Table1-Data:");
		for (WebElement webElement : trValues) {
			String text = webElement.getText();

			System.out.println(text);
		}

	}

	@Test(groups = "centreomayo")
	public void Test7() throws IOException {
		System.out.println("PageLink Validation");
		OmayoPOMClass o = new OmayoPOMClass();
              List<WebElement> pageLinks = o.getPageLinks();
		for (WebElement webElement : pageLinks) {
			
			linkValidation(webElement);
		}
		
	}
	
	
	
	
	
	
}
