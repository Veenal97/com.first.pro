package com.learn.automationtest.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learn.automationPages.Base_CLass;
import com.learn.automationPages.Login_Page;
import com.learn.automationtest.utilities.Browser_factory;
import com.learn.automationtest.utilities.Excel_Data_provider;
import com.learn.automationtest.utilities.helper_Library;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTestCRM extends Base_CLass {
	

	@Test
	public void loginaPP() {
		test=report.startTest("Login to CRM","Description:first test");
		
		test.log(LogStatus.INFO, "Logged in");
		System.out.println(driver.getTitle());
		if(driver.getTitle().equalsIgnoreCase("Welcome: Mercury Tours")) {
			test.log(LogStatus.PASS, "Title Verified");
		}
		else {
			test.log(LogStatus.FAIL, "Title is wrong");
		}
	}
	
	@Test
	
	public void verifyinglogg() {
		test=report.startTest("User check","Description: test");
		test.log(LogStatus.INFO, "verifying crredentials");
		Login_Page loginPage = PageFactory.initElements(driver, Login_Page.class);
		
		loginPage.loginToDemo(excel.getStringData(0, 0, 0), excel.getStringData(0, 0, 1));
		
		
		
		
		test.log(LogStatus.PASS, "test info");
		
		
		
	}
	
	@Test
	
	public void test2() {
		
		ExtentTest test=report.startTest("second test","Description:second test"); 
		test.log(LogStatus.PASS, "test paased");
		test.log(LogStatus.FAIL, "test failed");
		test.log(LogStatus.INFO, "test info");
		//test.addScreenCapture("./Screenshot/Tour"+helper_Library.getCurrentDateTime()+".png");
		//test.addScreencast("./Screenshot/Tour"+helper_Library.getCurrentDateTime()+".png");
		
	
		System.out.println("inside second test");
	}
	/*
	 * @Test public void autoIT() throws IOException, InterruptedException {
	 * System.out.println("autoIT"); WebDriver
	 * driver=Browser_factory.startApplication("Chrome",
	 * "http://demo.guru99.com/test/autoit.html");
	 * driver.findElement(By.xpath(".//*[@id='postjob']")).click();
	 * //Runtime.getRuntime().exec("E:\\AutoIT\\FileUpload.exe");
	 * driver.findElement(By.
	 * xpath("//div[@id='cid_5']/input[@id='input_5' and @type='file']")).click(); }
	 */

}
