package com.demo.java8.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Student {


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
				+ ", monthlyExpensives=" + monthlyExpensives + ", subjectList=" + subjectList + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMonthlyExpensives() {
		return monthlyExpensives;
	}

	public void setMonthlyExpensives(int monthlyExpensives) {
		this.monthlyExpensives = monthlyExpensives;
	}

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	public Student(int id, String name, LocalDateTime dateOfBirth, String gender, int monthlyExpensives,
			List<Subject> subjectList) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.monthlyExpensives = monthlyExpensives;
		this.subjectList = subjectList;
	}

	private int id;
	
	private String name;
	
	private LocalDateTime dateOfBirth;
	
	private String gender;
	
	private int monthlyExpensives;
	
	private List<Subject> subjectList;

}
