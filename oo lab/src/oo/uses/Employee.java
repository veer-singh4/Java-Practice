package oo.uses;

public class Employee {

	private int empId;

	public Employee() {
	
		this.empId = IdGenerator.getEmpId();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
}
