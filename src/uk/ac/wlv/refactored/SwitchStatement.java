package uk.ac.wlv.refactored;

import java.util.ArrayList;
import java.util.List;

import uk.ac.wlv.refactored.Employee;

public class SwitchStatement {

	public static double[] calculateEmployeeBonuses(List<Employee> employees) {
		double[] bonuses = new double[employees.size()];
		for (Employee employee : employees) {
			bonuses[employees.indexOf(employee)] = employee.calculateBonus();
		}
		return bonuses;
	}
	
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>() {{
			add(Employee.create(Employee.ENGINEER, "Matthew Howell", 10000, 5));
			add(Employee.create(Employee.TECHNICIAN, "Joe Bloggs", 15000, 3));
			add(Employee.create(Employee.MANAGER, "Jane Doe", 25000, 10));
		}};
		
		double[] bonuses = calculateEmployeeBonuses(employees);
		for(Employee employee : employees) {
			String name = employee.getName();
			double bonus = bonuses[employees.indexOf(employee)];
			System.out.println(name + "\tbonus = " + bonus);
		}	
	}
}