package lab3;

import java.io.*;

public class OutputStreamlab {
public static void main(String[] args) {
	String data="hey how are you";
	try {
		OutputStream os= new FileOutputStream("C:\\java\\abc.txt");
		byte[] databyte=data.getBytes();
		os.write(databyte);
		os.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
