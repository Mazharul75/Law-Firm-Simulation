

//package com.JMRC;

public class addALawyer extends user {

	private String designation;
	private String lawyerType;
	private String education;
	private String casesHandled;
	private String casesWon;
	private String casesLost;
	private String licenseNumber;
	private String residence;
	private String specialty;
    private String professionalExperience;
    private String famousquotes;
    private String specialization;
	
	

    public addALawyer(String username, String password, String email, String fName, String lName, String designation, String lawyerType, String education, String casesHandled, String casesWon, String casesLost, String licenseNumber, String residence, String specialty, String professionalExperience, String famousquotes, String specialization) {
        super(username, password, email, fName, lName );
        this.designation = designation; 
        this.lawyerType = lawyerType;
        this.education = education;
        this.casesHandled = casesHandled;
        this.casesWon = casesWon;
        this.casesLost = casesLost;
        this.licenseNumber = licenseNumber;
        this.residence = residence;
        this.specialty = specialty;
        this.professionalExperience = professionalExperience;
        this.famousquotes = famousquotes;
        this.specialization = specialization;
    }
	
	public addALawyer(String username, String password) {
        super(username, password);
    }       

    public void setDesignation(String designation) {
        this.designation = designation;
    }   

    public void setLawyerType(String lawyerType) {
        this.lawyerType = lawyerType;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setCasesHandled(String casesHandled) {
        this.casesHandled = casesHandled;
    }

    public void setCasesWon(String casesWon) {
        this.casesWon = casesWon;
    }

    public void setCasesLost(String casesLost) {
        this.casesLost = casesLost;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }   

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setProfessionalExperience(String professionalExperience) {
        this.professionalExperience = professionalExperience;
    }

    public void setFamousquotes(String famousquotes) {
        this.famousquotes = famousquotes;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDesignation() {
        return designation;
    }

    public String getLawyerType() {
        return lawyerType;
    }

    public String getEducation() {
        return education;
    }

    public String getCasesHandled() {
        return casesHandled;
    }

    public String getCasesWon() {
        return casesWon;
    }

    public String getCasesLost() {
        return casesLost;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getResidence() {
        return residence;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getProfessionalExperience() {
        return professionalExperience;
    }

    public String getFamousquotes() {
        return famousquotes;
    }

    public String getSpecialization() {
        return specialization;
    }



    

    



    
}
