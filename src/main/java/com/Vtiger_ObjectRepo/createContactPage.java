package com.Vtiger_ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger_Generics.WebdriverUtility;
import com.Vtiger_Generics.javaUtility;
import com.Vtiger_Generics.propertyFileUtility;

public class createContactPage {
	
	@FindBy(xpath="//input[@type='submit']") private WebElement editTab;
	
	@FindBy(xpath="//img[@alt='Create Contact...']")private WebElement addBtn;
	@FindBy(xpath="//input[@name='lastname']") private WebElement lastNametb;
	@FindBy(xpath="//a[text()='Darshan Gunagi']") private WebElement childName;
	@FindBy(xpath="(//input[@title='Clear'])[2]") private WebElement clearBtn;
	@FindBy(xpath="//input[@name='button']") private WebElement saveBtn;
	@FindBy(xpath="//select[@name='leadsource']") private WebElement leadSourceDD;
	@FindBy(xpath="//input[@type='radio']") private WebElement userRadiobtn;
	@FindBy(xpath="//select[@name='assigned_user_id']") private WebElement admintrationDD;
	@FindBy(xpath="(//input[@type='radio'])[2]") private WebElement groupRadiobtn;
	@FindBy(xpath="//select[@name='assigned_group_id']") private WebElement groupDD;
	@FindBy(xpath="//img[@alt='Export Contacts']") private WebElement exportTab;
	
	public WebElement getExportTab() {
		return exportTab;
	}



	public WebElement getGroupDD() {
		return groupDD;
	}



	public WebElement getGroupRadiobtn() {
		return groupRadiobtn;
	}



	public WebElement getAdmintrationDD() {
		return admintrationDD;
	}



	public WebElement getUserRadiobtn() {
		return userRadiobtn;
	}



	public WebElement getLeadSourceDD() {
		return leadSourceDD;
	}



	public WebElement getSaveBtn() {
		return saveBtn;
	}



	public WebElement getClearBtn() {
		return clearBtn;
	}



	public WebElement getChildName() {
		return childName;
	}



	public WebElement getLastNametb() {
		return lastNametb;
	}

	@FindBy(xpath="(//img[@title='Select'])[2]") private WebElement addReportbtn;
	
	
	public WebElement getAddReportbtn() {
		return addReportbtn;
	}



	public createContactPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}



	public WebElement getEditTab() {
		return editTab;
	}
	
public void addButton() {
	addBtn.click();
}
	
}
