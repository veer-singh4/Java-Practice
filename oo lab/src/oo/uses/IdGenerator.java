package oo.uses;

public class IdGenerator {

	private static int custId = 100;
	private static int empId = 300;
	
	
	public static int getCustId() {
		return custId++;
	}
	public static int getEmpId() {
		return empId++;
	}
	
	
}
