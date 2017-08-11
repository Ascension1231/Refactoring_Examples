package uk.ac.wlv.smells;

public class Employee {
	public static final int ENGINEER = 0;
	public static final int TECHNICIAN = 1;
	public static final int MANAGER = 2;

	int type;
	int tenure;
	String name;
	double salary;
	
	public Employee(int type, String name, double salary, int tenure) {
		this.type = type;
		this.name = name;
		this.salary = salary;
		this.tenure = tenure;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getType() {
		return this.type;
	}
	
	public int getTenure() {
		return this.tenure;
	}
}
