package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeyword {
	
	static void readData() throws FileNotFoundException {
		FileReader file = new FileReader("");
		BufferedReader fp = new BufferedReader(file);
		throw new FileNotFoundException();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Begin!");
		try {
			readData();
		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		System.out.println("End!");
	}

}
