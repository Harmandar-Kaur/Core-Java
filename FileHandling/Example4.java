package FileHandling;

import java.io.File;

public class Example4 {
	
	public static void main(String[] args) {
		
		File f = new File("Info.txt");
		if(f.delete()) {
			System.out.println("The deleted file is: " + f.getName());
		} else {
			System.out.println("Failed to delete the file...");
		}
	}

}
