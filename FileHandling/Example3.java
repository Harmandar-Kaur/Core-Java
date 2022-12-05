package FileHandling;


import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example3 {
	
	public static void main(String[] args) {
		
		File f = new File("Logs.txt");
		try {
			FileWriter w = new FileWriter(f);
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date d = new Date();
			System.out.println("User Logged In At: " + df.format(d));
			//w.append("User Logged In At: " + df.format(d));
			w.write("User Logged In At: " + df.format(d));
			w.close();
			System.out.println("Data Written Successfully!!");
		} catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}

}
