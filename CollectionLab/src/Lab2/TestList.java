package Lab2;

public class TestList {
	public static void main(String[] args) {
		LinkListDemo demo=new LinkListDemo();
		demo.createList1();
		demo.createList2();
		boolean flag =demo.checkEquality();
		
		if(flag) {
			System.out.println("List1...");
			demo.displayList(flag);
			System.out.println("List2..");
			demo.displayList(flag);
		}
		else {
			demo.mergeList();
			System.out.println("ResultList..");
			demo.displayList(flag);
			
		}
	}

}
