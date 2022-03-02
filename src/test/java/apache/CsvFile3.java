package apache;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CsvFile3 {
	public static void main(String[] args) throws IOException, CsvValidationException {
		CSVReader reader = new CSVReader(new FileReader("C:\\Users\\TG1689\\Desktop\\Project\\CRIC.csv"));
		StringBuffer buffer = new StringBuffer();
		String data[];
		while((data = reader.readNext()) != null) {//csvdatafiles\sample.csv.xlsx
			for(int i =0;i<data.length ;i++) {
				System.out.print(data[i] +" ");
			}
			System.out.println( " ");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the columan name");
		String value = sc.nextLine();
		System.out.println(value);
//		System.out.println("enter the data");
//		String value1 = sc.next();
//		System.out.println(value1);
	}
}
