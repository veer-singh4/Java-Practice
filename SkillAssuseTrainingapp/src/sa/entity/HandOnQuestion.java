package sa.entity;

public class HandOnQuestion extends Question {
	private String questionDesc;
	private String refrenceDocuments;
	
	public HandOnQuestion(int marks, String questionDesc, String refrenceDocuments) {
		super(marks);
		this.questionDesc = questionDesc;
		this.refrenceDocuments = refrenceDocuments;
	}

	public String getQuestionDesc() {
		return questionDesc;
	}

	public void setQuestionDesc(String questionDesc) {
		this.questionDesc = questionDesc;
	}

	public String getRefrenceDocuments() {
		return refrenceDocuments;
	}

	public void setRefrenceDocuments(String refrenceDocuments) {
		this.refrenceDocuments = refrenceDocuments;
	}
	
}
