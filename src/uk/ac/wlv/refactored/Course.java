package uk.ac.wlv.refactored;

public class Course {
	private String[] modules;
	private int[] moduleParticipation;
	private int[] moduleGrades;
	private int[] moduleAttendance;

	public Course() {
	}

	public String[] getModules() {
		return modules;
	}

	public void setModules(String[] modules) {
		this.modules = modules;
	}

	public int[] getModuleParticipation() {
		return moduleParticipation;
	}

	public void setModuleParticipation(int[] moduleParticipation) {
		this.moduleParticipation = moduleParticipation;
	}

	public int[] getModuleGrades() {
		return moduleGrades;
	}

	public void setModuleGrades(int[] moduleGrades) {
		this.moduleGrades = moduleGrades;
	}

	public int[] getModuleAttendance() {
		return moduleAttendance;
	}

	public void setModuleAttendance(int[] moduleAttendance) {
		this.moduleAttendance = moduleAttendance;
	}
	
	public int getAverageAttendance() {
		return 0;
	}
	public int getAverageModuleGrades() {
		return 0;
	}
	public int getAverageModuleParticipation() {
		return 0;
	}
	
	public boolean isOnModule(String name) {
		return false;
	}
	public int getModuleGrade(String name) {
		return 0;
	}
	public int getModuleParticipation(String name) {
		return 0;
	}
	public int getModuleAttendance(String name) {
		return 0;
	}
}