package Assignments;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.Scanner;

public class FileAssignment4 {
	
	public static void main(String[] args) {
		
		File f = new File("Hey.txt");
		Scanner sc = new Scanner(System.in);
		//String s = sc.next();
		//Files.writeString(f, s);
		try {
			FileWriter fw = new FileWriter(f);
			System.out.println("Enter The Data To Store:");
			String s = sc.nextLine();
			//Files.writeString(f , s);
			for(int i = 0 ; i <=s.length(); i++) {
				fw.write(i);
			}
			//fw.write(s);
			//fw.append(s);
			System.out.println("Entry Succesfull");
		}catch(Exception ex) {
			System.out.println("File Not Found");
		}
		
	}

}
