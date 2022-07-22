package sa.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Assessment {
	
	private int assessmentId;
	private String desc;
	private int noQuestion;
	private long dtAssesment;
	Date date=new Date(dtAssesment);
	
	private List<Question> questions=new ArrayList<Question>();
	

	public Assessment(int assessmentId, String desc, int noQuestion, long dtAssesment, Date date) {
		super();
		this.assessmentId = assessmentId;
		this.desc = desc;
		this.noQuestion = noQuestion;
		this.dtAssesment = dtAssesment;
		this.date = date;
	}
	
	
	public int getAssessmentId() {
		return assessmentId;
	}
	public void setAssessmentId(int assessmentId) {
		this.assessmentId = assessmentId;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getNoQuestion() {
		return noQuestion;
	}
	public void setNoQuestion(int noQuestion) {
		this.noQuestion = noQuestion;
	}
	public long getDtAssesment() {
		return dtAssesment;
	}
	public void setDtAssesment(long dtAssesment) {
		this.dtAssesment = dtAssesment;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}


	public List<Question> getQuestions() {
		return questions;
	}


	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	public int getTotalMarks() {
		int totalMarks=0;
		for(Question question: questions) {
			totalMarks+=question.getMarks();
		}
		
		return totalMarks;
		
	}

}
