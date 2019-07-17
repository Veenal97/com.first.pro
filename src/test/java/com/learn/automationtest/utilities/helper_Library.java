package com.learn.automationtest.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class helper_Library {
	//Screenshot, alerts, windows, javascriptexecutor,
	
	public static String captureScreenshot(WebDriver driver) {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshot_path= System.getProperty("user.dir")+"Screenshots/FreeCrm"+getCurrentDateTime()+".png";
		try {
			FileHandler.copy(file, new File(screenshot_path));
			System.out.println("screenshot done");
		} catch (IOException e) {
			System.out.println("unable to print screenshot"+e.getMessage());
		}
		return screenshot_path;
	}
	
	public static String getCurrentDateTime() {
		DateFormat customFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");  // cpaital MM, HH
		Date currentDate=new Date();
		return customFormat.format(currentDate);
	}
	public void handleframe() {
		
	}
public void  handle() {
	
}
}
