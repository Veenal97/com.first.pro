package com.learn.automationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page {

	WebDriver driver;
	public Login_Page(WebDriver ldriver) {
		this.driver=ldriver;
		
	}

	@FindBy(name="userName") WebElement name;
	@FindBy(name="password") WebElement password;
	@FindBy(name="submit") WebElement login;
	
	public void loginToDemo(String username, String pswd) {
		name.sendKeys(username);
		password.sendKeys(pswd);
		login.click();
		
	}
	
}
