package lab2;

import java.io.File;

public class renameFile {
public static void main(String[] args) {
	File file=new File("abc.txt");
	
	File rename=new File("bcd.txt");
	
	boolean result=file.renameTo(rename);
	if(result==true) {
	System.out.println(rename.getName());
	}
	file.delete();
}
}
