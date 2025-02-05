package org.demoproj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.apache.commons.lang3.exception.UncheckedReflectiveOperationException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver ; 
	
	
     public static WebDriver browserLaunch(String browser) {
    	 
    //DriverManager.getInstance().browserLanuch(browser);
    	 	
    	ChromeOptions co = new ChromeOptions();
    			co.addArguments("Headless");
    			switch(browser) {
    			
    			case"chrome":
    				WebDriverManager.chromedriver().setup();
    			driver= new ChromeDriver(co);
    			break;
    			
    			case"firefox":
    					WebDriverManager.firefoxdriver().setup();
    				driver= new FirefoxDriver(co);
    					break;
    					
    					default:
    					System.out.println("invalid browser");
    			}
    			
    			return driver; 	
     }
	
     public static void launchURL(String url) {
		driver.get(url);
        
	}
     
     public static void maximize() {
	driver.manage().window().maximize();

	}
     
     public static void clear(WebElement e ) {
    		e.clear();

 	}
     public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
     
     public static void quit() {
		driver.quit();

	}
     
	public static  void click(WebElement e) {
		e.click();
	}
	public static void sendKeys(WebElement e,String txt) {
		
		e.sendKeys(txt);
		
	}
	
	
	public static void classExecutionStarted(String classname) {
		System.out.println("Class "+classname+" execution started");

	}
	
	public static void classExecutionEnded(String classname) {
		System.out.println("Class "+classname+" execution ended");

	}
	
	public static  String getText(WebElement e) {
		return e.getText();
	}
	
	public static  void clearTxt(WebElement e) {
		e.clear();
	}
	
	public static  void selectByVisibleText(WebElement e,String txt) {
		Select s = new Select(e);
		s.selectByVisibleText(txt);
	}
	
	public static  void selectByValue(WebElement e,String txt) {
		Select s = new Select(e);
		s.selectByValue(txt);
	}
	public static  void selectByIndex(WebElement e,int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
	}
	
	public static  void doubleClick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick(e).perform();
	}
	
	public static  void contextClick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e).perform();
	}
	
	
	public static  void downloadFile(WebElement e,String loc) {
	 	ChromeOptions co = new ChromeOptions();
		Map<String, Object> mp = new LinkedHashMap();
		mp.put("profile.default_content_settings.popups", 0);
		mp.put("download.default_directory", loc);
		co.setExperimentalOption("prefs", mp);
	}
	
	
	
	public static void chooseFile(WebElement e,String fileLocation) throws AWTException, InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		Thread.sleep(5000);
		e.click();
			Thread.sleep(10000);
		StringSelection si = new StringSelection (fileLocation);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(si, null);
        
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
	}
	
	public static void switchToFrame(WebElement e) {
		driver.switchTo().frame(e);
}
	
	public static void switchToFrame(int in) {
		driver.switchTo().frame(in);
	}
	
	public static void switchToParentFrame() {
		driver.switchTo().parentFrame();
}
	
	public static void windowsHandling(int windowNumber) {
Set<String> windowHandles = driver.getWindowHandles();
		
		int count = 1 ;
		for (String string : windowHandles) {
			if(count==windowNumber) {
				driver.switchTo().window(string);
			}
			count++;
		}}
	
	public static void simpleAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public static void promptAlertConfirm(String text) {
		Alert alert = driver.switchTo().alert();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		alert.sendKeys(text);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alert.accept();
	}
	
	public static void promptAlertCancel() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	

	public static void ConfirmationAlertCancel() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	public static void ConfirmationAlertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public static void Startingtime() {
		
Date t  = new Date();
		
		long time = t.getTime();
		SimpleDateFormat s = new SimpleDateFormat("MMM-DD-hh-mm-ss");
		String format = s.format(time);
		System.out.println("TestCase staring time: "+format);
	}
	
	public static void Endingtime() {
		
		Date t  = new Date();
				
				long time = t.getTime();
				SimpleDateFormat s = new SimpleDateFormat("MMM-DD-HH-mm-ss");
				String format = s.format(time);
				System.out.println("TestCase ending time: "+format);
			}
	
	public static String excelReader(String filename, int sheetNo , int rowNo , int cellNo) throws IOException {
		
	//	File f = new File("C:\\Users\\sasik\\eclipse-workspace\\TestNg16_10_projct\\Excelfile\\"+filename+".xlsx");
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Excelfile\\"+filename+".xlsx");
		FileInputStream fi = new FileInputStream(f);
		
	 Workbook w = new XSSFWorkbook(fi);
		
		Sheet sheetAt = w.getSheetAt(sheetNo);
		
		Row row = sheetAt.getRow(rowNo);
		
		Cell cell = row.getCell(cellNo);
		
		int cellType = cell.getCellType();
		
	//	System.out.println(cellType);
		
		if(cellType==1) {
			String value = cell.getStringCellValue();
			
			return value;
			
		}
		else {
			return null ;
		}
	}
	
	public static String propertyFileReader(String PropertyfileName, String keyProperty) throws IOException {
		
		Properties p = new Properties();
		File f = new File("C:\\Users\\sasik\\eclipse-workspace\\TestNg16_10_projct\\src\\test\\resources\\propertyfile\\"+PropertyfileName+".properties");
		     FileInputStream fi = new FileInputStream(f);
			p.load(fi);
			String string = (String) p.get(keyProperty);
			return string;
	}
	
	public static void linkValidation(WebElement e) throws IOException {
		
		
		String attribute = e.getAttribute("href");
		
		URL u = new URL(attribute);
		 URLConnection openConnection = u.openConnection();
		 
		 HttpURLConnection hc = (HttpURLConnection)openConnection ;
		 
		 int responseCode = hc.getResponseCode();
		 
		 if(responseCode>=400 && responseCode<=500 ) {
			 System.out.println(attribute+"link is broken link");
		 }
		 
		 else {
			 System.out.println(attribute+"-statusCode :"+ responseCode+"link is ok");
		 }
		 
		

	}
	
	 public static void imageValidation(WebElement e) throws IOException {
		 String attribute = e.getAttribute("src");
			
			URL u = new URL(attribute);
			 URLConnection openConnection = u.openConnection();
			 
			 HttpURLConnection hc = (HttpURLConnection)openConnection ;
			 
			 int responseCode = hc.getResponseCode();
			 
			 if(responseCode>=400 && responseCode<=500 ) {
				 System.out.println(attribute+"img is broken link");
				 System.out.println("image status code is "+responseCode);
			 }
			 
			 else {
				 System.out.println(attribute+"-imgStatuscode :"+ responseCode+"img is ok");
			 }

	}
	
	public void javascriptBackPage() {
		
		JavascriptExecutor js =  (JavascriptExecutor)driver ;
		js.executeScript("window.history.go(-1);");
			
		

	}
public void javascriptFrontPage() {
		
		JavascriptExecutor js =  (JavascriptExecutor)driver ;
		js.executeScript("window.history.go(1);");
			
		

	}
	
}
