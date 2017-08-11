package uk.ac.wlv.smells;

import java.util.ArrayList;
import java.util.List;

public class SwitchStatement {

	public static double[] calculateEmployeeBonuses(List<Employee> employees) {
		double[] bonuses = new double[employees.size()];
		for(Employee employee : employees) {
			double bonus = 0;
			double salary = employee.getSalary();
			int type = employee.getType();
			switch (type) {
				case 0:
					bonus = salary * 0.15;
					break;
				case 1:
					bonus = salary * 0.12;
					break;
				case 2:
					bonus = salary * 0.25;
			}
			bonuses[employees.indexOf(employee)] = bonus;
		}
		return bonuses;
	}
	
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>() {{
			add(new Employee(Employee.ENGINEER, "Matthew Howell", 10000, 5));
			add(new Employee(Employee.TECHNICIAN, "Joe Bloggs", 15000, 3));
			add(new Employee(Employee.MANAGER, "Jane Doe", 25000, 10));
		}};
		
		double[] bonuses = calculateEmployeeBonuses(employees);
		for(Employee employee : employees) {
			String name = employee.getName();
			double bonus = bonuses[employees.indexOf(employee)];
			System.out.println(name + "\tbonus = " + bonus);
		}	
	}
}
