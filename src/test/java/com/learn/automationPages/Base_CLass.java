package com.learn.automationPages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.learn.automationtest.utilities.Browser_factory;
import com.learn.automationtest.utilities.ConfigDataProvider;
import com.learn.automationtest.utilities.Excel_Data_provider;
import com.learn.automationtest.utilities.helper_Library;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base_CLass {
	public WebDriver driver;
	public Excel_Data_provider excel;
	public ConfigDataProvider config;
    public ExtentReports report;
    public ExtentTest test;
    
	@BeforeSuite

	public void setup_Suite() {
		excel = new Excel_Data_provider();
		config = new ConfigDataProvider();
		 report=new ExtentReports("./Reports/Extentreport"+helper_Library.getCurrentDateTime()+".html");
		 //report=new ExtentReports(System.getProperty("user.dir")+"Reports/Extentreport"+helper_Library.getCurrentDateTime()+".html");
		 
		  
	}

	@BeforeTest

	public void set_up() {

		System.out.println("in base class Before test methopd");
		driver = Browser_factory.startApplication(config.getBrowser(),config.Staging_url());
	}

	@AfterTest
	public void tearDown() {
		Browser_factory.quitbrowser();
	}
	
  @AfterMethod
  public void tearDownMethod(ITestResult result ) {
	  if(result.getStatus()==ITestResult.FAILURE)
{
		  helper_Library.captureScreenshot(driver);
		  
		  test.addScreenCapture(helper_Library.captureScreenshot(driver));
		  
	  }
	  
	  else if(result.getStatus()==ITestResult.SUCCESS) {
		  test.addScreenCapture(helper_Library.captureScreenshot(driver));
	  }
	  report.endTest(test);
		report.flush();
	  
	  
  }
	
	

}
