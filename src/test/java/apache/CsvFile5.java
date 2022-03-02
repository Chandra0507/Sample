package apache;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
		
				//Getting Particular Row Data in CSV
public class CsvFile5 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
				new FileReader(new File("C:\\Users\\TG1689\\Desktop\\Project\\Data.csv")));

		String line;
		List<List<String>> allLines = new ArrayList();
		List<String> header = new ArrayList();

		while ((line = reader.readLine()) != null) {
			Collections.addAll(allLines, Arrays.asList(line.split(",")));
			
		}

		System.out.println(allLines);
		
		header = allLines.get(0);
		System.out.println(header);
		

		System.out.println("Please enter the column names\n");
		Scanner sc = new Scanner(System.in);
		String userHeader = sc.nextLine();

		System.out.println(String.format("given headers=%s", userHeader));

		System.out.println("Please enter the data");
		String userData = sc.nextLine();
		System.out.println(String.format("given data=%s", userData));

		List<List<String>> finalData = new ArrayList();
		for (int i = 1; i < allLines.size(); i++) {
			List<String> eachLine = allLines.get(i);
			int headerIndex = header.indexOf(userHeader.trim());
			if (eachLine.get(headerIndex).equals(userData)) {
				finalData.add(eachLine);
			}
		}
		System.out.println(finalData);

	}
}