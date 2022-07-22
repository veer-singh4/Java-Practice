package com.ge.exceptiondemo.app;


import com.ge.exceptiondemo.mycollection.MyCollection;
import com.ge.exceptiondemo.myexception.StackEmptyException;
import com.ge.exceptiondemo.myexception.StackFullException;

public class TestMain {
	public static void main(String[] args) {
		MyCollection ob=new MyCollection();
		
			try {
				ob.push(5);
			} catch (StackFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				ob.pop();
			}catch(StackEmptyException e) {
				e.printStackTrace();
			}
			
			try {
				ob.display();
			} catch (StackEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
