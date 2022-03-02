package com.apchepoi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelFile {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet();

		sheet1.createRow(0);
		sheet1.getRow(0).createCell(0).setCellValue("CSK");
		sheet1.getRow(0).createCell(1).setCellValue("RCB");
		sheet1.getRow(0).createCell(2).setCellValue("MI");
		sheet1.getRow(0).createCell(3).setCellValue("DC");
		sheet1.getRow(0).createCell(4).setCellValue("KKR");
		sheet1.getRow(0).createCell(5).setCellValue("SRH");

		sheet1.createRow(1);
		sheet1.getRow(1).createCell(0).setCellValue("MSD");
		sheet1.getRow(1).createCell(1).setCellValue("FAF");
		sheet1.getRow(1).createCell(2).setCellValue("ROHIT");
		sheet1.getRow(1).createCell(3).setCellValue("PANT");
		sheet1.getRow(1).createCell(4).setCellValue("IYER");
		sheet1.getRow(1).createCell(5).setCellValue("KANE");


		File file = new File("C:\\Users\\TG1689\\Desktop\\Tools\\Test.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
	}

}
