package model;

public class Candidate {
	private int candidateType;
    private String fullName;
    private String dateOfBirth;
    private String permanentAddress;
    private String hometown;
    private String phoneNumber;
    private String emailAddress;
    private String experienceYears;
    private String professionalSkills;
    private String recentWorkplace;
    private String graduationDate;
    private String graduationRank;
    private String graduationSchool;
    private String currentMajor;
    private String currentSemester;
    private String currentSchool;
    private String expectedGraduationDate;
    
    @Override
    public String toString() {
    	return "Candidate{Loai ung vien = "+ candidateType +
    			", Ngay sinh = " + dateOfBirth +
    			", Noi thuong tru = " + permanentAddress +
    			", Que quan = " + hometown +
    			", So dt = " + phoneNumber +
    			", Email = " + emailAddress +
    			",\n So nam exp = " + experienceYears +
    			", Ky nang chuyen mon = " + professionalSkills +
    			", Noi lam viec gan nhat = " + recentWorkplace +
    			", Thoi diem tn = " + graduationDate +
    			", Xep loai tn = " + graduationRank +
    			", Truong tn = " + graduationSchool +
    			",\n Chuyen nganh dang hoc = " + currentMajor +
    			", Hoc ki dang hoc = " + currentSemester +
    			", Truong dang hoc = " + currentSchool +
    			", Ngay du kien tn = " + expectedGraduationDate + 
    			"}";
    }
    
	public int getCandidateType() {
		return candidateType;
	}
	public void setCandidateType(int candidateType) {
		this.candidateType = candidateType;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getExperienceYears() {
		return experienceYears;
	}
	public void setExperienceYears(String experienceYears) {
		this.experienceYears = experienceYears;
	}
	public String getProfessionalSkills() {
		return professionalSkills;
	}
	public void setProfessionalSkills(String professionalSkills) {
		this.professionalSkills = professionalSkills;
	}
	public String getRecentWorkplace() {
		return recentWorkplace;
	}
	public void setRecentWorkplace(String recentWorkplace) {
		this.recentWorkplace = recentWorkplace;
	}
	public String getGraduationDate() {
		return graduationDate;
	}
	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}
	public String getGraduationRank() {
		return graduationRank;
	}
	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}
	public String getGraduationSchool() {
		return graduationSchool;
	}
	public void setGraduationSchool(String graduationSchool) {
		this.graduationSchool = graduationSchool;
	}
	public String getCurrentMajor() {
		return currentMajor;
	}
	public void setCurrentMajor(String currentMajor) {
		this.currentMajor = currentMajor;
	}
	public String getCurrentSemester() {
		return currentSemester;
	}
	public void setCurrentSemester(String currentSemester) {
		this.currentSemester = currentSemester;
	}
	public String getCurrentSchool() {
		return currentSchool;
	}
	public void setCurrentSchool(String currentSchool) {
		this.currentSchool = currentSchool;
	}
	public String getExpectedGraduationDate() {
		return expectedGraduationDate;
	}
	public void setExpectedGraduationDate(String expectedGraduationDate) {
		this.expectedGraduationDate = expectedGraduationDate;
	}
	
    
}
