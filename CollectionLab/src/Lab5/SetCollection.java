package Lab5;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
	public static void main(String[] args) {
		Set<String> set1=new HashSet<String>();
		set1.add("Apple");
		set1.add("Samsung");
		set1.add("LG");
		set1.add("Nokia");
		set1.add("Micromax");
		
		Set<String> set2=new HashSet<String>();
		set2.add("Sony");
		set2.add("Apple");
		set2.add("Nokia");
		set2.add("HTC");
		set2.add("Spice");
		
		Set<String> union=new HashSet<String>(set1);
		union.addAll(set2);
		
		Set<String> intersection=new HashSet<String>(set1);
		intersection.retainAll(set2);

		Set<String> difference1=new HashSet<String>(set1);
		difference1.removeAll(set2);
		
		Set<String> difference2=new HashSet<String>(set2);
		difference2.removeAll(set1);

		
		System.out.println("set1="+set1);
		System.out.println("set2="+set2);
		System.out.println("union="+union);
		System.out.println("intersection="+intersection);
		System.out.println("difference in set1="+difference1);
		System.out.println("difference in set2="+difference2);
		
		
	}

}
