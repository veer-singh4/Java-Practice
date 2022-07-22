package sa.entity;



public class SkillAssureTrainingModel {
	
	private String clientName ;
	
	private Iteration[] iteration=new Iteration[3];

	public SkillAssureTrainingModel(String clientName) {
		super();
		this.clientName = clientName;
		iteration[0]=new Iteration(1, "get" );
		iteration[1] =new Iteration(2, "get" );
		iteration[2]=new Iteration(3, "get" );
		
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	public Iteration getInstanceOfZerothIteration(){
		return iteration[0];
	}
	public Iteration getInstanceOfFirstIteration(){
		return iteration[1];
	}
	public Iteration getInstanceOfSecondIteration(){
		return iteration[2];
	}
	

	public int getTotalAssessmentsInTheTraining() {
		int totalassessment=0;
		for(Iteration iteration: iteration) {
			totalassessment+=iteration.getAssessments().size();
		}
	
		return totalassessment;
		
	}
	
	public int getMcqTotalMarks() {
		int mcqmarks=0;
		for(Iteration iteration: iteration) {
			for(Assessment assessment: iteration.getAssessments()) {
				for(Question question: assessment.getQuestions()) {
					if(question instanceof McqQuestion) {
						mcqmarks++;
					}
				}
			}
		}
		return mcqmarks;	
	}
	
	public int getHandOnTotalMarks() {
		int handonmarks=0;
		for(Iteration iteration: iteration) {
			for(Assessment assessment: iteration.getAssessments()) {
				for(Question question: assessment.getQuestions()) {
					if(question instanceof HandOnQuestion) {
						handonmarks++;
					}
				}
			}
		}
		return handonmarks;
	}

	
}
