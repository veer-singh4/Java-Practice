package Lab3;
//import java.lang.*;
public class Student implements Comparable<Student>{
	
	private int studentId ;
	private String studentName;
	private int studentScore;
	
	public Student() {
		super();
	}
	
	public Student(int studentId, String studentName, int studentScore) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentScore = studentScore;
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentScore() {
		return studentScore;
	}
	public void setStudentScore(int studentScore) {
		this.studentScore = studentScore;
	}

	public int compareTo(Student st) {
		if(studentId==st.studentId) {
			return 0;
		}
		else if(studentId>st.studentId) {
			return 1;
		}
		else
			return -1;
		
	
	}
	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentScore=" + studentScore
				+ "]";
	}
	
	


}
