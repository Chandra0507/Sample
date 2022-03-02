package com.apchepoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataInXl {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\TG1689\\Desktop\\Tools\\Test.xlsx");
		FileInputStream fos = new FileInputStream(file);	
		XSSFWorkbook workbook = new XSSFWorkbook(fos);
		XSSFSheet sheet = workbook.getSheetAt(0);
//	String cellvalue =	sheet.getRow(0).getCell(0).getStringCellValue();
//	System.out.println(cellvalue);
		int rowCount = sheet.getPhysicalNumberOfRows();
	    System.out.println(rowCount);
	    
	    for(int i=0; i<rowCount; i++) {
	    	XSSFRow row = sheet.getRow(i);
	    
	    int cellCount = row.getPhysicalNumberOfCells();
	    for(int j=0; j<cellCount; j++) {
	    	XSSFCell cell = row.getCell(j);
	    	String cellvalue =getCellValue(cell);
	    	System.out.print("||"+cell);
	    }
	    System.out.println();
	    }
		workbook.close();
	    fos.close();
	}
		//This method is used to identify the what type of cell it is
	    public static String getCellValue(XSSFCell cell) { 
	    	switch (cell.getCellType()) {
	    	case NUMERIC:
	    		return String.valueOf(cell.getNumericCellValue());
	    	case STRING:
	    		return cell.getStringCellValue();
	    	default:
	    		return cell.getStringCellValue();
	    	}
	    
	    }
	}


