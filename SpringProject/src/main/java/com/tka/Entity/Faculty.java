package com.tka.Entity;

import java.util.List;

public class Faculty {
	int FacultyId;
	String FacultyName;
	int FacultyExpYear;
	List<Subject>subjectName;
	
	public Faculty(int facultyId, String facultyName, int facultyExpYear, List<Subject> subjectName) {
		super();
		FacultyId = facultyId;
		FacultyName = facultyName;
		FacultyExpYear = facultyExpYear;
		this.subjectName = subjectName;
	}

	public Faculty(String facultyName, int facultyExpYear, List<Subject> subjectName) {
		super();
		FacultyName = facultyName;
		FacultyExpYear = facultyExpYear;
		this.subjectName = subjectName;
	}

	public Faculty() {
		super();
	}

	public int getFacultyId() {
		return FacultyId;
	}

	public void setFacultyId(int facultyId) {
		FacultyId = facultyId;
	}

	public String getFacultyName() {
		return FacultyName;
	}

	public void setFacultyName(String facultyName) {
		FacultyName = facultyName;
	}

	public int getFacultyExpYear() {
		return FacultyExpYear;
	}

	public void setFacultyExpYear(int facultyExpYear) {
		FacultyExpYear = facultyExpYear;
	}

	public List<Subject> getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(List<Subject> subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "Faculty [FacultyId=" + FacultyId + ", FacultyName=" + FacultyName + ", FacultyExpYear=" + FacultyExpYear
				+ ", subjectName=" + subjectName + "]";
	}
	
	

}
