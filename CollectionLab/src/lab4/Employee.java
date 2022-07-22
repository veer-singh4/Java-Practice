package lab4;

import java.util.Comparator;

import Lab3.Student;

public class Employee implements Comparable<Employee>,Comparator {
	int employeeId;
	String name;
	int age;
	long salary;
	
	public Employee(int employeeId, String name, int age, long salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
		this.salary = salary;
				
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		if(employeeId==o.employeeId) {
			return 0;
		}
		else if(employeeId>o.employeeId) {
			return 1;
		}
		else
			return -1;
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		Employee e=(Employee)o1;
		Employee em=(Employee)o2;
		
		if(e.name==em.name || e.salary==em.salary) {
			return 1;
		}
	
		
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	
	

}
