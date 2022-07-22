package lab1;

import java.io.File;
import java.io.IOException;

public class create_file {

	public static void main(String[] args) {
	
		File file = new File("abc.txt");  
		try {
			boolean result = file.createNewFile();
			if(result==true)
				System.out.println("File created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("file found: "+file.exists());
		System.out.println("filename: "+file.getName());
		System.out.println("file path: "+file.getAbsolutePath());
		System.out.println("file directory: "+file.isDirectory());
		System.out.println("file: "+file.isFile());	
		 
	}
}
