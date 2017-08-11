package uk.ac.wlv.refactored;

public class Engineer extends Employee {

	public Engineer(String name, double salary, int tenure) {
		this.name = name;
		this.tenure = tenure;
		this.salary = salary;
	}

	public int getType() {
		return Employee.ENGINEER;
	}

	@Override
	public double calculateBonus() {
		return (salary * 0.15) + (tenure * 200);
	}
}
