package Lab3;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		StudentAdmin sa=new StudentAdmin();
		sa.createStudent(list);
		
		sa.sortStudents(list);
		
	}


}
