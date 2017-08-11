package uk.ac.wlv.smells;

public abstract class LargeClass {
	
	int studentNumber;
	int mobileNumber;
	String termTimeAddress;
	String homeAddress;
	String postcode;
	String[] forenames;
	String surname;
	
	String[] modules;
	int[] moduleParticipation;
	int[] moduleGrades;
	int[] moduleAttendance;
	
	String emergencyContactName;
	String emergencyContactAddress;
	String emergencyContactNumber;
	
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getTermTimeAddress() {
		return termTimeAddress;
	}
	public void setTermTimeAddress(String termTimeAddress) {
		this.termTimeAddress = termTimeAddress;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String[] getForenames() {
		return forenames;
	}
	public void setForenames(String[] forenames) {
		this.forenames = forenames;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
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
	
	public abstract int getAverageAttendance();
	public abstract int getAverageModuleGrades();
	public abstract int getAverageModuleParticipation();
	
	public abstract boolean isOnModule(String name);
	public abstract int getModuleGrade(String name);
	public abstract int getModuleParticipation(String name);
	public abstract int getModuleAttendance(String name);
	
	public abstract String getFullname();
}
