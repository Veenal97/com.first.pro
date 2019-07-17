package com.learn.automationtest.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser_factory {
	
	public static WebDriver driver;

	public static WebDriver startApplication(String browserNAme, String appurl)  {
		
		if(browserNAme.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		
		}
		else if(browserNAme.equals("Firefox")) {
			
			System.out.println("firefox driver missing");
		}
		
		else if(browserNAme.equals("IE")) {
			System.out.println("IE driver missing");
			
		}
		else {
			System.out.println("we do not support this browser");
		}
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get(appurl);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		return driver;
		
	}

public static void quitbrowser() {
	driver.quit();
}	
}
