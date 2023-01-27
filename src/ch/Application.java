package ch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) throws IOException {
		List<Double>numbers=new ArrayList<>();
		numbers.add(25.50);
		numbers.add(45.0);
		numbers.add(690.2);
		numbers.add(44.8);
		
		
		test t=new test(numbers);
		t.printElement();

		List<Double> lines = new ArrayList<Double>(numbers);
		
		
//		BufferedReader br = new BufferedReader(new FileReader("table.csv"));
//		// skip the first line:
//		br.readLine();
//		String line = null;
//		// populate data from next line onwards
//		while ((line = br.readLine()) != null) {
//			lines.add(line);
//		}
//		
//		System.out.println(lines.get(1));

	}

}
