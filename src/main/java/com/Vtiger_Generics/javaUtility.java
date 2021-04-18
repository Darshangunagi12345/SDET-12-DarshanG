package com.Vtiger_Generics;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javaUtility {
	
	/**
	 * @author Darshan
	 * this method provide random number
	 * @return random number
	 */
	public int getRandomnum() {
		Random r=new Random();
		int randomNum = r.nextInt(10000);
		return randomNum;
	}
	
	public void getName(WebDriver driver,String ContactName) {
		List<WebElement> firstName = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[3]/a"));
		for(WebElement b:firstName) {
			String text = b.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase(ContactName)) {
				driver.findElement(By.xpath("//a[text()='Darshan']")).click();
			}
		
	}
	}	

}
