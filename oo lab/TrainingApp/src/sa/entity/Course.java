package sa.entity;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private long id;
	private String name;
	
	private List<Training> trainings = new ArrayList<Training>();
	//course has many training
	private List<Module> modules = new ArrayList<Module>();
	//course has many module
	public Course(long id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public List<Training> getTrainings() {
		return trainings;
	}
	public void setTrainings(List<Training> trainings) {
		this.trainings = trainings;
	}
	public List<Module> getModules() {
		return modules;
	}
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	
	

}
