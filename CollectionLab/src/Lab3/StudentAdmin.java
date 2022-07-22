package Lab3;


import java.util.Collections;
import java.util.List;

public class StudentAdmin {
	
	void createStudent(List<Student> list) {
	
	 Student student1=new Student(1001, "G", 80);
	 Student student2=new Student(1000, "D", 70);
	 Student student3=new Student(1003, "S", 75);
	 Student student4=new Student(1008, "L", 60);
	 Student student5=new Student(1005, "R", 65);
	 Student student6=new Student(1006, "M", 77);
	 
	 list.add(student1);
	 list.add(student2);
	 list.add(student3);
	 list.add(student4);
	 list.add(student5);
	 list.add(student6);
	 
	 
	}
	
	void sortStudents(List<Student> list) {
		 Collections.sort(list);
		 for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i));
			 }
		 
	}

	

}
