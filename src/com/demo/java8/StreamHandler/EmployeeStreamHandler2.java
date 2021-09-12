package com.demo.java8.StreamHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.demo.java8.entity.Employee;
import com.demo.java8.service.EmployeeService;
import com.demo.java8.service.EmployeeService1;

public class EmployeeStreamHandler2 {

	public static void main(String[] args) {
	
		 List<Employee> employeeList = EmployeeService.getEmployeeList();
		 
		 //convert employeeList map  key as id and name as value
		 
		Map<Integer,String> map1 = employeeList.stream().collect(Collectors.toMap(emp->emp.getEmpId(), emp->emp.getEmpName()));
		System.out.println(map1);
		
		Map<Integer,String> map1_v1 = employeeList.stream().collect(Collectors.toMap(Employee ::getEmpId,Employee ::getEmpName));
		System.out.println(map1_v1);
		
		
	
		
		
		 Set<Employee> employeeSet = EmployeeService1.getEmployeeSet();
		 
		 Set<Integer> idSet= employeeSet.stream().map(Employee::getEmpId).collect(Collectors.toSet());
		 System.out.println(idSet);
		 
		
		
	}

}

