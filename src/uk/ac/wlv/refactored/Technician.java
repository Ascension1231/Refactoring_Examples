package uk.ac.wlv.refactored;

public class Technician extends Employee {

	public Technician(String name, double salary, int tenure) {
		this.name = name;
		this.tenure = tenure;
		this.salary = salary;
	}

	public int getType() {
		return Employee.TECHNICIAN;
	}
	
	@Override
	public double calculateBonus() {
		return (salary * 0.10) + (tenure * 350);
	}
}
