package Assignments;

import java.io.File;
import java.util.Scanner;

public class FileAssignment2 {
	
	   public static void main(String[] args) {
		   File oldName = new File("Logs.txt");
		   System.out.println(oldName.getAbsolutePath());
		   System.out.println("Enter a new file name: ");
		   Scanner sc = new Scanner(System.in);
		   String n = sc.nextLine();
		   File newName = new File(n);
		   //File newName = new File("Java.txt");
		   //newName = sc.next();
		   //oldName.renameTo(newName);
	      
		   if(oldName.renameTo(newName)) {
			   System.out.println("renamed");
		   } else {
			   System.out.println("Error");
	      }
	  }
}
