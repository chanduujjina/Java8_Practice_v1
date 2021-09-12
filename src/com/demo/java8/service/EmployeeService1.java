package com.demo.java8.service;

import java.util.HashSet;
import java.util.Set;

import com.demo.java8.entity.Address;
import com.demo.java8.entity.Employee;

public class EmployeeService1 {
	
	private static  Set<Employee> set = new HashSet<>();
	
	static {
		set.add(new Employee(2, "ramu", 100000, "it", new Address("LIG-235", "str1", "hyd")));
		set.add(new Employee(4, "gouse", 500000, "it", new Address("LIG-234", "str2", "guntur")));
		set.add(new Employee(3, "sai", 400000, "admin", new Address("LIG-231", "str3", "hyd")));
		set.add(new Employee(1, "divya", 400000, "it", new Address("LIG-233", "str1", "hyd")));
		set.add(new Employee(6, "divya", 700000, "HR", new Address("LPG-239", "str1", "hyd")));
		set.add(new Employee(5, "kishore", 800000, "HR", new Address("LIG-233", "str4", "hyd")));
		set.add(new Employee(7, "chandu", 100000, "it", new Address("LIG-235", "str1", "hyd")));
	}
	
	public static Set<Employee> getEmployeeSet(){
		return set;
	}
	

}
