package com.Vtiger_ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createOrgPage {
	
	@FindBy(xpath="//img[@alt='Create Organization...']") private WebElement addOrgBtn;
	@FindBy(xpath="//input[@name='accountname']") private WebElement orgName;
	@FindBy(xpath="//input[@name='phone']") private WebElement phoneNo;
	@FindBy(xpath="//input[@name='button']") private WebElement saveBtn;
	
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}


	public createOrgPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	public WebElement getOrgName() {
		return orgName;
	}


	public WebElement getPhoneNo() {
		return phoneNo;
	}


	public void getAddButton() {
		addOrgBtn.click();
	}
}
