package apache;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

import org.apache.poi.hpsf.Section;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
		
public class Poi {
				
	public static void main(String[] args)throws Exception {
		String [][] data = {
				{"        TGWeb ", "         Verify " , "    01/09/2022", "         7sec" , "         PASS"	}
		};
		String col1[] = {"Module", "Tct", "Time", "Duration", "Status" };
		JTable table = new JTable(data,col1);
		Font font = new Font("Verdana", Font.PLAIN, 12);
	      table.setFont(font);
	      table.setRowHeight(30);
	      JTableHeader tableHeader = table.getTableHeader();
	      tableHeader.setBackground(Color.ORANGE);
	      JFrame frame = new JFrame();
	      frame.setSize(600, 400);
	      frame.add(new JScrollPane(table));
	      frame.setVisible(true);
		
}
}