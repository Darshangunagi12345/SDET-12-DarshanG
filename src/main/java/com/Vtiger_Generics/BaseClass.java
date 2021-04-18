package com.Vtiger_Generics;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.Vtiger_ObjectRepo.HomePage;
import com.Vtiger_ObjectRepo.LoginPage;

public class BaseClass {
	propertyFileUtility pf=new propertyFileUtility();
	WebdriverUtility w=new WebdriverUtility();
	
public	WebDriver driver;
/**
 * 
 * @throws FileNotFoundException
 * @throws IOException
 */
	@BeforeClass
	public void launchBrowser() throws FileNotFoundException, IOException {
		String browser = pf.getPropertyfile(Constants.propertyFile,"url");
		if(browser.equalsIgnoreCase("firefox")) {
			
			driver=new FirefoxDriver();
		}
		
		else {
			driver=new ChromeDriver();
		}
		w.maximizeWindow(driver);
		String urll = pf.getPropertyfile(Constants.propertyFile,"url");
		driver.get(urll);
		w.implicitWait(driver);
		
	}
	/**
	 * @author Darshan
	 * close the browser
	 */
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	/**
	 * @author Darshan
	 * used to provide login credentialls
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@BeforeMethod
		public void loginApp() throws FileNotFoundException, IOException {
		String userN = pf.getPropertyfile(Constants.propertyFile,"username");
		String pass=pf.getPropertyfile(Constants.propertyFile,"password");
		LoginPage l=new LoginPage(driver);
		l.getUsernametb().sendKeys(userN);
		l.getPasswordtb().sendKeys(pass);
		l.getLoginbtn().click();
		
		}
	
	
	@AfterMethod
	public void logoutApp() {
		HomePage h=new HomePage(driver);
		h.getHomeBtn().click();
		WebElement target = h.getLogoutMouseover();
		w.getmouseOver(driver, target);
		h.getSignoutbtn().click();
		
	}
	}


