package com.Wordfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class ReadWordFile {
	
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fis = new FileInputStream("C:\\\\Users\\\\TG1689\\\\Desktop\\\\Tools\\\\file.docx");
			XWPFDocument docx = new XWPFDocument(fis);
			List<XWPFParagraph> plist = docx.getParagraphs();
			
			for(XWPFParagraph par : plist) {
				System.out.println(par.getText());
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	}
