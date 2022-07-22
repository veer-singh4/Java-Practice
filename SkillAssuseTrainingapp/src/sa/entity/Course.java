package sa.entity;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private String courseId;
	private String name;
	
	private List<Assessment> assessments=new ArrayList<Assessment>();

	public Course(String courseId, String name) {
		super();
		this.courseId = courseId;
		this.name = name;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Assessment> getAssessments() {
		return assessments;
	}

	public void setAssessments(List<Assessment> assessments) {
		this.assessments = assessments;
	}
	
	

}
