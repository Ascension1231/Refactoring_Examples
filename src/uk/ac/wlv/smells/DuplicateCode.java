package uk.ac.wlv.smells;

public abstract class DuplicateCode {
	
	public abstract int[] getModuleGrades(String module);
	
	public void calc() {
		int[] grades1 = getModuleGrades("4CS001");
		int sum4CS001 = 0;
		for(int i = 0; i < grades1.length; i++) {
			sum4CS001 += grades1[i];
		}
		int averageGrade4CS001 = sum4CS001 / grades1.length;
		
		int[] grades2 = getModuleGrades("6CS002");
		int sum6CS002 = 0;
		for(int i = 0; i < grades2.length; i++) {
			sum6CS002 += grades2[i];
		}
		int averageGrade6CS002 = sum6CS002 / grades2.length;
		
		int[] grades3 = getModuleGrades("5CS003");
		int sum5CS003 = 0;
		for(int i = 0; i < grades3.length; i++) {
			sum5CS003 += grades3[i];
		}
		int averageGrade5CS003 = sum5CS003 / grades3.length;
		
		System.out.println("4CS001 Average: " + averageGrade4CS001);
		System.out.println("6CS002 Average: " + averageGrade6CS002);
		System.out.println("5CS003 Average: " + averageGrade5CS003);
	}
}
