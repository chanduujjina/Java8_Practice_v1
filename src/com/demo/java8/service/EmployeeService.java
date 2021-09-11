package com.demo.java8.service;

import java.util.ArrayList;
import java.util.List;

import com.demo.java8.entity.Address;
import com.demo.java8.entity.Employee;

public class EmployeeService {
	
	private static  List<Employee> list = new ArrayList();
	
	static {
		list.add(new Employee(2, "ramu", 100000, "it", new Address("LIG-235", "str1", "hyd")));
		list.add(new Employee(4, "gouse", 500000, "it", new Address("LIG-234", "str2", "guntur")));
		list.add(new Employee(3, "sai", 400000, "admin", new Address("LIG-231", "str3", "hyd")));
		list.add(new Employee(1, "divya", 400000, "it", new Address("LIG-233", "str1", "hyd")));
		list.add(new Employee(6, "divya", 700000, "HR", new Address("LPG-239", "str1", "hyd")));
		list.add(new Employee(5, "kishore", 800000, "HR", new Address("LIG-233", "str4", "hyd")));
		list.add(new Employee(7, "chandu", 100000, "it", new Address("LIG-235", "str1", "hyd")));
	}
	
	public static List<Employee> getEmployeeList(){
		return list;
	}
	

}
