package uk.ac.wlv.refactored;

public abstract class DuplicateCode {
	
	public abstract int[] getModuleGrades(String module);
	
	public void printAverageModuleGrades() {
		int averageGrade4CS001 = calculateAverageModuleGrade("4CS001");
		int averageGrade6CS002 = calculateAverageModuleGrade("6CS002");
		int averageGrade5CS003 = calculateAverageModuleGrade("5CS003");
		System.out.println("4CS001 Average: " + averageGrade4CS001);
		System.out.println("6CS002 Average: " + averageGrade6CS002);
		System.out.println("5CS003 Average: " + averageGrade5CS003);
	}
	
	public int calculateAverageModuleGrade(String name) {
		int[] grades = getModuleGrades(name);
		int sum = 0;
		for(int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		return sum / grades.length;
	}
}