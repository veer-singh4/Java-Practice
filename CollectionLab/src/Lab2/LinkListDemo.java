package Lab2;

import java.util.Collections;
import java.util.LinkedList;

public class LinkListDemo {
	private LinkedList<Integer> list1=new LinkedList<Integer>();
	private LinkedList<Integer> list2=new LinkedList<Integer>();
	private LinkedList<Integer> resultList=new LinkedList<Integer>();
	public LinkListDemo() {
		super();
	}
	
	
	public LinkedList<Integer> getList1() {
		return list1;
	}
	public void setList1(LinkedList<Integer> list1) {
		this.list1 = list1;
	}
	public LinkedList<Integer> getList2() {
		return list2;
	}
	public void setList2(LinkedList<Integer> list2) {
		this.list2 = list2;
	}
	public LinkedList<Integer> getResultList() {
		return resultList;
	}


	public void setResultList(LinkedList<Integer> resultList) {
		this.resultList = resultList;
	}


	void createList1() {
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
	}
	void createList2() {
		list2.add(10);
		list2.add(12);
		list2.add(40);
		list2.add(50);
		list2.add(60);
	}
	
	boolean checkEquality() {
		if(list1==list2){
			return true;
		}
		else 
			return false;
	}
	
	void mergeList() {
		if(list1!=list2) {
			resultList.addAll(list1);
			resultList.addAll(list2);
			Collections.sort(resultList);
		}
	}
	
	void displayList(boolean flag) {
		if(flag==true) {
			System.out.print(list1);
		}
		else
			System.out.print(resultList);
			
	}
	
}
