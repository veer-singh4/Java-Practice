package lab4;

import java.util.*;

public class TestMain {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		Employee e1=new Employee(17873, "Meghna Tunga", 21, 150000);
		Employee e2=new Employee(17875, "Swati Suman", 21, 1650000);
		Employee e3=new Employee(17882, "Subhasish", 21, 250000);
		Employee e4=new Employee(17786, "Sanket Dixit", 23, 200000);
		Employee e5=new Employee(17007, "Chandra", 19, 25000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
		}
		
		
	}

}
