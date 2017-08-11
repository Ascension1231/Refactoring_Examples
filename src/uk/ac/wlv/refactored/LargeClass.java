package uk.ac.wlv.refactored;

public abstract class LargeClass {
	
	int studentNumber;
	int mobileNumber;
	String termTimeAddress;
	String homeAddress;
	String postcode;
	String[] forenames;
	String surname;
	
	Course Course = new Course();
	EmergencyContact EmergencyContact = new EmergencyContact();

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
	
	public abstract String getFullname();
}
