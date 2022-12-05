package Assignments;

import java.io.File;

public class FileAssignment1 {
	
	public static void main(String[] args) {

			
			File f = new File("Hey.txt");
			System.out.println("File Created!!! "+ "\n" + f.getAbsolutePath());
			System.out.println(f.getName());
			System.out.println(f.isDirectory());
			System.out.println(f.isFile());
			System.out.println(f.exists());
	}

}
