package com.ict.utilities.jaison;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadUtility {
	
	
	public static XSSFWorkbook excelWBook;
	public static XSSFSheet excelWsheet;
	public static String getCellData(int row,int column) throws IOException 
	{
			
			FileInputStream File = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\EmployeeData.xlsx");
			excelWBook=new XSSFWorkbook(File);
			excelWsheet=excelWBook.getSheetAt(0);
			return excelWsheet.getRow(row).getCell(column).getStringCellValue();
	}

}
