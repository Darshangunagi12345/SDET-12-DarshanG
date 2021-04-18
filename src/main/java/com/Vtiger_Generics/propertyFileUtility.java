package com.Vtiger_Generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class propertyFileUtility {
	/**
	 * @author Darshan
	 * @return 
	 * @return  url
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public String getPropertyfile(String path,String key) throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		String value = p.getProperty(key);
		return value;
	}
	
	
}
