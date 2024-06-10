package com.tka.Entity;

public class Subject {
	int SubjectId;
	String SubjectName;

	public Subject(int subjectId, String subjectName) {
		super();
		SubjectId = subjectId;
		SubjectName = subjectName;
	}

	public Subject(String subjectName) {
		super();
		SubjectName = subjectName;
	}

	public Subject() {
		super();
	}

	public int getSubjectId() {
		return SubjectId;
	}

	public void setSubjectId(int subjectId) {
		SubjectId = subjectId;
	}

	public String getSubjectName() {
		return SubjectName;
	}

	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}

	@Override
	public String toString() {
		return "Subject [SubjectId=" + SubjectId + ", SubjectName=" + SubjectName + "]";
	}

}
