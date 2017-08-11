package uk.ac.wlv.refactored;

public class Manager extends Employee {

	public Manager(String name, double salary, int tenure) {
		this.name = name;
		this.tenure = tenure;
		this.salary = salary;
	}

	public int getType() {
		return Employee.MANAGER;
	}
	
	@Override
	public double calculateBonus() {
		return (salary * 0.25) + (tenure * 500);
	}
}
