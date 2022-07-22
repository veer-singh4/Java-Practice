package sa.entity;

import java.util.ArrayList;
import java.util.List;

public class Iteration {
	
	private int itrationNo;
	private String goal;
	private Course course;
	private List<Assessment> assessments=new ArrayList<Assessment>();
	public Iteration(int itrationNo, String goal) {
		super();
		this.itrationNo = itrationNo;
		this.goal = goal;
	}
	public int getItrationNo() {
		return itrationNo;
	}
	public void setItrationNo(int itrationNo) {
		this.itrationNo = itrationNo;
	}
	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public List<Assessment> getAssessments() {
		return assessments;
	}
	public void setAssessments(List<Assessment> assessments) {
		this.assessments = assessments;
	}
	
	

}
