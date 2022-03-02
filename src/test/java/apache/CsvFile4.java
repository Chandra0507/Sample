package apache;

import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CsvFile4 {
	
	public static void main(String[] args) throws IOException {
		/*FileInputStream fis = new FileInputStream("C:\\Users\\TG1689\\Desktop\\Project\\EMP.csv");
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("EMP");
	XSSFRow row = sheet.getRow(0);
	XSSFCell cell = null;
	int colNum = -1;
	for(int i=0; i<row.getLastCellNum();i++) {
		if(row.getCell(i).getStringCellValue().trim().equals("col1"))
			colNum = i;
	}
	row.getSheet().getRow(1);
	cell = row.getCell(colNum);
	String col1 = String.valueOf(cell.getStringCellValue());
	System.out.println("value from the excel sheet :"+col1);*/
		String excelpath = "C:\\Users\\TG1689\\Desktop\\Project\\EMP.csv";
	XSSFWorkbook workbook = new XSSFWorkbook(excelpath);
	XSSFSheet sheet = workbook.getSheet("EMP");
	String value = sheet.getRow(1).getCell(0).getStringCellValue();
	System.out.println(value);
	}
		
	}


