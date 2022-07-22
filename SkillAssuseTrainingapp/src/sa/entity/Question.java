package sa.entity;

public abstract class Question {
	
	private int marks;

	public Question(int marks) {
		super();
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	

}
