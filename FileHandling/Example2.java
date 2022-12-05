package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example2 {
	
	public static void main(String[] args) {
		
		try {
			File f = new File("Info.txt");
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
			System.out.println("File Not Found Error!!");
		}
	}

}
