package com.Vtiger_TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Vtiger_Generics.BaseClass;
import com.Vtiger_Generics.Constants;
import com.Vtiger_Generics.javaUtility;
import com.Vtiger_Generics.propertyFileUtility;
import com.Vtiger_ObjectRepo.HomePage;
import com.Vtiger_ObjectRepo.createContactPage;

public class EditContact extends BaseClass{
	
	
	@Test
	public void editContact() throws FileNotFoundException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		h.getContactTab().click();
		javaUtility j=new javaUtility();
		propertyFileUtility p=new propertyFileUtility();
		createContactPage c=new createContactPage(driver);
		String Contactname = p.getPropertyfile(Constants.propertyFile,"ContactName");
		j.getName(driver,Contactname);
		c.getEditTab().click();
		
		
		
	}
}
