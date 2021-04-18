package com.Vtiger_ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//a[text()='Organizations']") private WebElement orgTab;
	@FindBy(xpath="//a[text()='Contacts']") private WebElement ContactTab;
	@FindBy(xpath="//img[@style='padding: 0px;padding-left:5px']") private WebElement logoutMouseover;
	@FindBy(xpath="//a[text()='Sign Out']") private WebElement signoutbtn;
	@FindBy(xpath="//img[@style='width:16px;height:16px;']") private WebElement homeBtn;
	public WebElement getHomeBtn() {
		return homeBtn;
	}

	public WebElement getSignoutbtn() {
		return signoutbtn;
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getLogoutMouseover() {
		return logoutMouseover;
	}

	public WebElement getOrgTab() {
		return orgTab;
	}

	public WebElement getContactTab() {
		return ContactTab;
	}

}
