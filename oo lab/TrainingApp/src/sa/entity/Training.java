package sa.entity;

import java.util.ArrayList;
import java.util.List;

public class Training {
	
	private long id;
	private String name;
	
	private Trainer trainer;
	
	private List<Trainee> trainees = new ArrayList<Trainee>();
	
	private Course course;

	public Training(long id, String name, Trainer trainer, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.trainer = trainer;
		this.course = course;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public List<Trainee> getTrainee() {
		return trainees;
	}

	public void setTrainee(List<Trainee> trainee) {
		this.trainees = trainee;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public int getNumberOfTrainees() {
		return trainees.size();
	}
	
	public String getTrainingOrganizationName() {
		return trainer.getOrganization().getName();
	}
	
	public int getDurationInHrs() {
		List<Module> modules = new ArrayList<Module>();
		modules=getCourse().getModules();
		int durationInHrs=0;
		for(Module module : modules) {
			for(Unit unit : module.getUnits()) {
				durationInHrs += unit.getDurationHrs();
			}
		}
		return durationInHrs;
	}
	

}
