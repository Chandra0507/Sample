package com.Wordfile;
/**
 * 
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class CreateWordFile {
	public static void main(String[] args) throws IOException {
		XWPFDocument doc = new XWPFDocument();
		XWPFParagraph paragraph = doc.createParagraph();
		XWPFRun tmpRun = paragraph.createRun();
		tmpRun.setText("Chennai Super Kings");
			FileOutputStream out = new FileOutputStream(new File("C:\\Users\\TG1689\\Desktop\\Tools\\file.docx"));
			
			XWPFTable table = doc.createTable();
			
			XWPFTableRow tablerow = table.getRow(0);
			tablerow.getCell(0).setText("Row 1");
			tablerow.addNewTableCell().setText("Row 2");
			tablerow.addNewTableCell().setText("Row 3");
	
			XWPFTableRow tablerow2 = table.createRow();
			tablerow2.getCell(0).setText("1");
			tablerow2.getCell(1).setText("2");
			tablerow2.getCell(2).setText("3");
			doc.write(out);
			doc.close();
		}
	}

