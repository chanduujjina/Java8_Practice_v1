package com.demo.java8.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.demo.java8.entity.Address;
import com.demo.java8.entity.Employee;
import com.demo.java8.entity.Student;
import com.demo.java8.entity.Subject;

public class StudentService {
	
	private static  List<Student> list = new ArrayList();
	
	static {
		List<Subject> subjectList = new ArrayList();
		subjectList.add(new Subject(1, "VLSI", "electronics"));
		subjectList.add(new Subject(2, "EMTL", "electric"));
		subjectList.add(new Subject(3, "AL", "Communicatiion"));
		
		list.add(new Student(1, "vasu", LocalDateTime.of(1993, 05, 01, 1, 15), "male", 3000, subjectList));
		list.add(new Student(2, "sudheer", LocalDateTime.of(1998, 05, 01, 1, 15), "male", 4500, subjectList));
		list.add(new Student(3, "sathish", LocalDateTime.of(1995, 05, 01, 1, 15), "male", 5000, subjectList));
	}
	
	public static List<Student> getStudentList(){
		return list;
	}
	

}
