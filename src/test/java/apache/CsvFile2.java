package apache;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
			//Reading CSV File Data
public class CsvFile2 {

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
	}

}
