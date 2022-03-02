package apache;
import java.io.File;
import java.io.PrintWriter;
public class CsvFile1 {

	public static void main(String[] args) {
		try {
			  PrintWriter pw= new PrintWriter(new File("C:\\Users\\TG1689\\Desktop\\Project\\Cric.csv"));
			  StringBuilder sb=new StringBuilder();
			  sb.append("Name");
			  sb.append(",");
			  sb.append("JNO");
			  sb.append(",");
			  sb.append("AGE");
			  sb.append(",");
			  sb.append("HSCORE");
			  sb.append(",");
			  sb.append("ROLE");
			  sb.append("\r\n");
			  sb.append("DHONI");
			  sb.append(",");
			  sb.append("7");
			  sb.append(",");
			  sb.append("40");
			  sb.append(",");
			  sb.append("183");
			  sb.append(",");
			  sb.append("WK");
			  sb.append("\r\n");
			  sb.append("VIRAT");
			  sb.append(",");
			  sb.append("18");
			  sb.append(",");
			  sb.append("33");
			  sb.append(",");
			  sb.append("183");
			  sb.append(",");
			  sb.append("BAT");
			  sb.append("\r\n");
			  sb.append("YUVI");
			  sb.append(",");
			  sb.append("12");
			  sb.append(",");
			  sb.append("39");
			  sb.append(",");
			  sb.append("150");
			  sb.append(",");
			  sb.append("ALL");
			  sb.append("\r\n");
			  sb.append("JADDU");
			  sb.append(",");
			  sb.append("8");
			  sb.append(",");
			  sb.append("30");
			  sb.append(",");
			  sb.append("120");
			  sb.append(",");
			  sb.append("ALL");
			  sb.append("\r\n");
			  pw.write(sb.toString());
			  pw.close();
			  System.out.println("finished");
			  } catch (Exception e) {
			     // TODO: handle exception
			  }
	}

}
