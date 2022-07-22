package com.ge.exceptiondemo.mycollection;

import java.util.*;

import com.ge.exceptiondemo.myexception.StackEmptyException;
import com.ge.exceptiondemo.myexception.StackFullException;

public class MyCollection {
	private int top=0;
	private int value,i;
	int[] arr=new int[5];
	
	
	
	public void push(int value) throws StackFullException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of elements");
		value=sc.nextInt();
		try {		
		{
			for(i=0;i<value;i++) {
				arr[top]=sc.nextInt();
				top++;
				if(top>=value)
					throw new StackFullException("The stack is full");
			}
		}}catch(Exception e)
		{
			System.out.println(e);
		}

	}
	
	public void pop() throws StackEmptyException
	{
		
		try{
			top--;
			if(top<=0) {
				throw new StackEmptyException(" Stack is Empty");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.print("Pop Element is:" +arr[top]+"\n");
			
	}
	
	public void display() throws StackEmptyException{
		for(i=top-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
}
