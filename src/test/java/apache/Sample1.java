package apache;

import java.io.File;
import java.io.PrintWriter;

public class Sample1 {

		public static void main(String[] args) {
			try {
				  PrintWriter pw= new PrintWriter(new File("C:\\Users\\TG1689\\Desktop\\Project/Data.csv"));
				  StringBuilder sb=new StringBuilder();
				  sb.append("FirstName");
				  sb.append(",");
				  sb.append("LastName");
				  sb.append(",");
				  sb.append("Age");
				  sb.append(",");
				  sb.append("Empid");
				  sb.append("\r\n");
				  sb.append("Chandra");
				  sb.append(",");
				  sb.append("Sekhar");
				  sb.append(",");
				  sb.append("22");
				  sb.append(",");
				  sb.append("01");
	              sb.append("\r\n");
				  sb.append("Chaitanya");
				  sb.append(",");
				  sb.append("Katta");
				  sb.append(",");
				  sb.append("23");
				  sb.append(",");
				  sb.append("02");
				  sb.append("\r\n");
				  sb.append("Lakshman");
				  sb.append(",");
				  sb.append("Durga");
				  sb.append(",");
				  sb.append("26");
				  sb.append(",");
				  sb.append("13");
				  sb.append("\r\n");
				  pw.write(sb.toString());
				  pw.close();
				  System.out.println("finished");
				  } catch (Exception e) {
				     // TODO: handle exception
				  }

		}

	
}
