package lab4;

import java.io.*;
import java.util.Scanner;


public class userInput {
public static void main(String[] args) {

	try {
		Writer w= new FileWriter("C:\\java\\a.txt");
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		w.write(data);
		w.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	try {
		Reader r=new FileReader("C:\\java\\a.txt");
		int d=r.read();
		while(d!=-1) {
			System.out.print((char) d);
			d=r.read();
		}
		r.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
