package com.Vtiger_Generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelUtility {
	
	
	public String getDataFromExcel(String sheetName,int rownum,int cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream f=new FileInputStream(Constants.excelFile);
		Workbook wb = WorkbookFactory.create(f);
		String excelData = wb.getSheet(sheetName).getRow(rownum).getCell(cellnum).getStringCellValue();
		return excelData;
	}

}
