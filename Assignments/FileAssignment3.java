package Assignments;

import java.io.FileOutputStream;

public class FileAssignment3 {
	public static void main(String[] args) {
		try {
			FileOutputStream f = new FileOutputStream("logs.txt");
			//System.out.println();
			f.write(50);
			f.write(50);
			f.close();
			System.out.println("Success...");
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
