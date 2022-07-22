package sa.entity;

import java.util.ArrayList;
import java.util.List;

public class Unit {
	
	private int durationHrs;
	
	private List<Topic> topics=new ArrayList<Topic>();

	public Unit(int durationHrs) {
		super();
		this.durationHrs = durationHrs;
	}

	public int getDurationHrs() {
		return durationHrs;
	}

	public void setDurationHrs(int durationHrs) {
		this.durationHrs = durationHrs;
	}

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	
	

}
