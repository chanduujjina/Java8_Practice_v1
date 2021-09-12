package com.demo.java8.StreamHandler;

import java.util.List;
import java.util.stream.Collectors;

import com.demo.java8.entity.Student;
import com.demo.java8.entity.Subject;
import com.demo.java8.service.StudentService;

public class StudentStreamHandler {

	public static void main(String[] args) {
		
		 List<Student> studentList = StudentService.getStudentList();
		 
			List<String> nameList = studentList.stream().map(Student::getName).collect(Collectors.toList());
			System.out.println(nameList);
			
			//get the subject list	when one to many relationship occurs
			
			Subject subject= studentList.stream().map(stu->stu.getSubjectList()).flatMap(x->x.stream()).filter(sub->sub.getSubjectName().equals("VLSI")).findAny().get();
			System.out.println(subject);
			

	}

}
