package sa.testmain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import sa.entity.Assessment;
import sa.entity.Course;
import sa.entity.HandOnQuestion;
import sa.entity.McqQuestion;
import sa.entity.Question;
import sa.entity.SkillAssureTrainingModel;

public class TestMain {
	public static void main(String[] args) {
		
		SkillAssureTrainingModel samt=new SkillAssureTrainingModel("virtusa");
		
		Course course1=new Course("1", "java");
		Course course2=new Course("2", "java");
		Course course3=new Course("3", "java");
		
		samt.getInstanceOfZerothIteration().setCourse(course1);
		samt.getInstanceOfFirstIteration().setCourse(course2);
		samt.getInstanceOfSecondIteration().setCourse(course3);
		
		Date date=new Date(System.currentTimeMillis());
		System.out.println(date);
		
		Assessment a1=new Assessment(1, "a", 2, 1121333, null);
		Assessment a2=new Assessment(2, "b", 3, 1121333, null);
		
		List<Assessment> assessments=new ArrayList<Assessment>();
		assessments.add(a1);
		assessments.add(a2);
		
		
		HandOnQuestion q1= new HandOnQuestion(2, "py", "pys");
		HandOnQuestion q2= new HandOnQuestion(3, "ey", "eys");
		McqQuestion q3=new McqQuestion(5, "name", "a", "b", "c", "d", "b");
		McqQuestion q4=new McqQuestion(3, "name", "a", "b", "c", "d", "c");
		
		List<Question> questions=new ArrayList<Question>();
		questions.add(q1);
		questions.add(q2);
		questions.add(q3);
		questions.add(q4);
	
		a1.setQuestions(questions);
		a2.setQuestions(questions);
		
		samt.getInstanceOfZerothIteration().setAssessments(assessments);
		
		
		
		System.out.println("Total Marks: "+a1.getTotalMarks());
		System.out.println("Total Assessments: "+samt.getTotalAssessmentsInTheTraining());
		System.out.println("Total McqQuestion: "+samt.getMcqTotalMarks());
		System.out.println("Total HandOnQuestion: "+samt.getHandOnTotalMarks());
		
		
		
	}

}
