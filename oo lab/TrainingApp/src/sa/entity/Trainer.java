package sa.entity;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
	
	private long id;
	private String name;

	private Organization organization;//trainer has one organization
	//Trainer has many trainee
	private List<Trainee> trainees = new ArrayList<Trainee>();
	//trainer has many training
	private List<Training> trainings = new ArrayList<Training>();
	
	
	public Trainer(long id, String name, Organization organization) {
		super();
		this.id = id;
		this.name = name;
		this.organization = organization;
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
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	public List<Trainee> getTrainee() {
		return trainees;
	}
	public void setTrainee(List<Trainee> trainee) {
		this.trainees = trainees;
	}
	public List<Training> getTraining() {
		return trainings;
	}
	public void setTraining(List<Training> training) {
		this.trainings = trainings;
	}
	
	
}
