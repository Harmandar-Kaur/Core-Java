package FileHandling;

import java.io.File;
import java.io.FileWriter;

public class Example1 {
	
	public static void main(String[] args) {
		
		File f = new File("Info.txt");
		System.out.println("File Created!!! "+ "\n" + f.getAbsolutePath());
		System.out.println(f.getName());
		
		try {
			FileWriter w = new FileWriter(f);
			w.write("Welcome To Java - File Handling!!! ");
			System.out.println("Written into file successfully!!");
			w.close();
		} catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("File Not Found Error!!");
		}
	}

}
