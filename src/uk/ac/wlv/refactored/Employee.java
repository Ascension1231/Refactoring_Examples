package uk.ac.wlv.refactored;

public abstract class Employee {
	
	static final int ENGINEER = 0;
	static final int TECHNICIAN = 1;
	static final int MANAGER = 2;

	int tenure;
	String name;
	double salary;

	public Employee() { }

	public static Employee create(int type, String name, double salary, int tenure) {
		switch (type) {
		case Employee.ENGINEER:
			return new Engineer(name, salary, tenure);
		case Employee.MANAGER:
			return new Manager(name, salary, tenure);
		case Employee.TECHNICIAN:
			return new Technician(name, salary, tenure);
		default:
			throw new IllegalArgumentException("Invalid type code.");
		}
	}

	public double getSalary() {
		return this.salary;
	}
	
	public String getName() {
		return this.name;
	}

	public int getTenure() {
		return this.tenure;
	}

	public abstract int getType();

	public abstract double calculateBonus();
}
