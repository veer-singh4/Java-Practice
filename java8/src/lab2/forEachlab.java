package lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class forEachlab {
	public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("ajay");
	list.add("ankita");
	list.add("yogi");
	list.add("suma");

	list.forEach((n)->System.out.print(n+","));
	System.out.println("\n"+"print Value start from s");
	
	Stream<String> starts=list.stream().filter(l->l.startsWith("s"));
	 System.out.println(starts.collect(Collectors.toList()));
	 
	 System.out.println("\n"+"print Value start from a");
	 Stream<String> starts2=list.stream().filter(l->l.endsWith("a"));
	 System.out.println(starts2.collect(Collectors.toList()));
	 
	 System.out.println("\n"+"print Value start from uppercase");
	 Stream<String> starts3=list.stream();
	 System.out.println(starts3.collect(Collectors.toList()).toString().toUpperCase()+"\n");
	 
	}}