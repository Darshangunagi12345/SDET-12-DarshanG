package com.Vtiger_Generics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtility {
	
	/**
	 * @author Darshan
	 * used to maximise the window
	 * @param driver
	 */
	
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();	
	}
	
	/**
	 * @author Darshan
	 * used for implicitWait
	 * @param driver
	 */
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Constants.implicittime,TimeUnit.SECONDS);
	}
	
	/**
	 * @author Darshan
	 * get data from dropdown
	 * @param ele
	 * @param index
	 */
	public void getDropdown(WebElement ele,int index) {
		
		Select s=new Select(ele);
		s.selectByIndex(index);
	}
	
	/**
	 * Switch to desired windows
	 * @param driver
	 * @param windowtitleexp
	 */
	public void switchtowindow(WebDriver driver, String windowtitleexp) 
	{
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it = set.iterator();

		while(it.hasNext()) 
		{
			String winid = it.next();
			driver.switchTo().window(winid);
			String acttitle = driver.getTitle();
			if(acttitle.contains(windowtitleexp)) 
			{
				break;
			}
		}
	}
	/**
	 * @author Darshan
	 * get mouse over actions
	 * @param driver
	 * @param target
	 */
	
	public void getmouseOver(WebDriver driver,	WebElement target) {
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
	}
	
}
