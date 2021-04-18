package com.Vtiger_TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.Vtiger_Generics.BaseClass;
import com.Vtiger_Generics.Constants;
import com.Vtiger_Generics.WebdriverUtility;
import com.Vtiger_Generics.javaUtility;
import com.Vtiger_Generics.propertyFileUtility;
import com.Vtiger_ObjectRepo.HomePage;
import com.Vtiger_ObjectRepo.createContactPage;

public class TestCase_7 extends BaseClass {
	propertyFileUtility pf=new propertyFileUtility();
	javaUtility j=new javaUtility();
	WebdriverUtility w=new WebdriverUtility();
	@Test
	public void TestCase_7() throws FileNotFoundException, IOException {
		
		HomePage h=new HomePage(driver);
		h.getContactTab().click();
		createContactPage c=new createContactPage(driver);
		c.addButton();
		String lastname = pf.getPropertyfile(Constants.propertyFile,"ContactLastName");
		int random=j.getRandomnum();
		String lnama = lastname+random;
		c.getLastNametb().sendKeys(lnama);
		c.getAddReportbtn().click();
		w.switchtowindow(driver,"Contacts&action");
		c.getChildName().click();
	//	c.getClearBtn().click();
		c.getSaveBtn().click();
	}

}
