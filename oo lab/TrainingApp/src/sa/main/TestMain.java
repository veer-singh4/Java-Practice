package sa.main;

import java.util.ArrayList;
import java.util.List;

import sa.entity.*;
import sa.entity.Module;

public class TestMain {

	public static void main(String[] args) {
		
		Organization org=new Organization("virtusa");
		
		Trainer tr1 =  new Trainer(1, "varun", org);
		
		Course course = new Course(1, "java");
		
		Trainee t1 = new Trainee(1, "ashoka", tr1);
		Trainee t2 = new Trainee(2, "ashoka", tr1);
		Trainee t3 = new Trainee(3, "ashoka", tr1);
		
		Training trn1 = new Training(1, "java training", tr1, course);
		
		List<Trainee> trainees = new ArrayList<Trainee>();
		trainees.add(t1);
		trainees.add(t2);
		trainees.add(t3);
		
		trn1.setTrainee(trainees);
		
		Module m1 = new Module(1, "basic");
		Module m2 = new  Module(2, "OOPs");
		
		List<Module> modules = new ArrayList<Module>();
		modules.add(m1);
		modules.add(m2);
		
		course.setModules(modules);
		
		Unit u1 = new Unit(30);
		Unit u2 = new Unit(54);
		
		List<Unit> units = new ArrayList<Unit>();
		units.add(u1);
		units.add(u2);
		
		m1.setUnits(units);
		m2.setUnits(units);
		
		Topic topic1 = new Topic("fundamentals");
		Topic topic2 = new Topic("OOP Relationships");
		
		List<Topic> topics = new ArrayList<Topic>();
		topics.add(topic1);
		topics.add(topic2);
		
	
		u1.setTopics(topics);
		u2.setTopics(topics);
		
		System.out.println("Number of Trainees : " + trn1.getNumberOfTrainees());
		System.out.println("Org Name : " + trn1.getTrainingOrganizationName());
		System.out.println("Training Duration in Hrs : " + trn1.getDurationInHrs());

	}

}
