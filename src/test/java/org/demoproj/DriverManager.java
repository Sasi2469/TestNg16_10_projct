package org.demoproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public static DriverManager driverManager ;
	
	public static WebDriver driver ;
	
	private DriverManager() {}
	
	
	public  static DriverManager getInstance() {
		
		if(driverManager==null) {
			driverManager = new DriverManager();
			return driverManager ;
		}
		else {
			return driverManager;
		}
	}
	
	public  WebDriver browserLanuch(String browser) {
		
		switch(browser) {
		
		case"chrome":
			WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		break;
		
		case"firefox":
				WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
				break;
				
				default:
				System.out.println("invalid browser");
		}
		
		return driver;
		
		

	
	
}
}