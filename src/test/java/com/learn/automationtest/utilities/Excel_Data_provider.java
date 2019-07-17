package com.learn.automationtest.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Data_provider {
	
	XSSFWorkbook wb;
	public Excel_Data_provider()  {
		//System.out.println("in excel data");
		File src=new File("./TestData/Test_data.xlsx");
		System.out.println("File loaded");
		try {
		FileInputStream fis=new FileInputStream(src);
		
		wb=new XSSFWorkbook(fis);
		//System.out.println("worksheet loaded");
		}
		
		catch(Exception e) {
			System.out.println("UNABLE TO READ EXCEL FILE "+e.getMessage());
		}
	}
	
	public String getStringData(String sheetName,int row,int column) {                              //method overloading
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	public String getStringData(int sheetName,int row,int column) {
		System.out.println("call to get string data");
		return wb.getSheetAt(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getNumericData(String sheetName,int row,int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
	
	

}
