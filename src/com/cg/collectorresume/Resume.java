package com.cg.collectorresume;

import java.sql.Date;

import javax.servlet.RequestDispatcher;

public class Resume {
String firstName;
String lastName;
String gender;
Date dob;
String highestQualification;
long contactNumber;
public Resume(String firstName, String lastName, String gender, Date dob, String highestQualification,
		long contactNumber) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.dob = dob;
	this.highestQualification = highestQualification;
	this.contactNumber = contactNumber;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getHighestQualification() {
	return highestQualification;
}
public void setHighestQualification(String highestQualification) {
	this.highestQualification = highestQualification;
}
public long getContactNumber() {
	return contactNumber;
}
public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
}

RequestDispatcher rd = request.getRequestDispatcher("");
}
