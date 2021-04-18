package com.Vtiger_ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy(xpath="//input[@name='user_name']") private WebElement usernametb;
	@FindBy(xpath="//input[@name='user_password']") private WebElement passwordtb;
	@FindBy(xpath="//input[@id='submitButton']") private WebElement loginbtn;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	public WebElement getUsernametb() {
		return usernametb;
	}


	public WebElement getPasswordtb() {
		return passwordtb;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}

	
}
