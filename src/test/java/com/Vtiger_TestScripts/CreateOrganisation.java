package com.Vtiger_TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Vtiger_Generics.BaseClass;
import com.Vtiger_Generics.Constants;
import com.Vtiger_Generics.WebdriverUtility;
import com.Vtiger_Generics.excelUtility;
import com.Vtiger_Generics.javaUtility;
import com.Vtiger_Generics.propertyFileUtility;
import com.Vtiger_ObjectRepo.HomePage;
import com.Vtiger_ObjectRepo.LoginPage;
import com.Vtiger_ObjectRepo.createOrgPage;

public class CreateOrganisation extends BaseClass{
	javaUtility j=new javaUtility();
	WebdriverUtility w=new WebdriverUtility();
	propertyFileUtility pf=new propertyFileUtility();
	
	@Test
	public void testScript01() throws FileNotFoundException, IOException, EncryptedDocumentException, InvalidFormatException {
		int random = j.getRandomnum();
		HomePage h=new HomePage(driver);
		h.getOrgTab().click();
		createOrgPage o=new createOrgPage(driver);
		o.getAddButton();
		excelUtility e=new excelUtility();
		String name = e.getDataFromExcel("Sheet1",0,0);
		String Orgname=name+random;
		o.getOrgName().sendKeys(Orgname);
		String phone=e.getDataFromExcel("Sheet1",1,0);
		o.getPhoneNo().sendKeys(phone);
		o.getSaveBtn().click();
		
	}

}
