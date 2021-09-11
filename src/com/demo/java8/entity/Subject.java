package com.demo.java8.entity;

public class Subject {
	
	public Subject(int subjectid, String subjectName, String subjectType) {
		super();
		this.subjectid = subjectid;
		this.subjectName = subjectName;
		this.subjectType = subjectType;
	}

	@Override
	public String toString() {
		return "Subject [subjectid=" + subjectid + ", subjectName=" + subjectName + ", subjectType=" + subjectType
				+ "]";
	}

	public int getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	private int subjectid;
	
	private String subjectName;
	
	private String subjectType;

}
