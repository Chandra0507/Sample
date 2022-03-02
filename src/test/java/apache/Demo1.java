package apache;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import fr.opensagres.poi.xwpf.converter.pdf.PdfConverter;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;

public class Demo1 {

	public static void main(String[] args) {
		try {
			InputStream docFile = new FileInputStream(new File("C:/Users/TG1689/Desktop/Table/chan.docx"));
		XWPFDocument doc = new XWPFDocument(docFile);
		PdfOptions pdfoptions = PdfOptions.create();
		OutputStream out = new FileOutputStream(new File("C:/Users/TG1689/Desktop/Table/chan.pdf"));
		PdfConverter.getInstance().convert(doc, out, pdfoptions);
		doc.close();
		out.close();
		System.out.println("done");
		}
		catch(Exception e){
			e.printStackTrace();
		}
    	System.out.println("pdf generate go and check your location");

	}

}
