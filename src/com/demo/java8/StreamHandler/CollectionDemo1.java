package com.demo.java8.StreamHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.demo.java8.entity.Employee;
import com.demo.java8.service.EmployeeService;

public class CollectionDemo1 {

	public static void main(String[] args) {
		
		 List<Employee> employeeList =	EmployeeService.getEmployeeList();
		 //add all the it employees into separate list
		 List<Employee> itemployeeList = new ArrayList();
		 Map<Integer,String> map = new HashMap();
		 for(Employee emp :employeeList) {
			 map.put(emp.getEmpId(), emp.getEmpName());
			 if(emp.getDeptName().equalsIgnoreCase("IT")) {
				 itemployeeList.add(emp); 
				
			 }
			 
		 }
		 System.out.println(itemployeeList);
		 
		 System.out.println(map);
		 
		 List<Integer> numberList = Arrays.asList(1,1,2,3,4,5,6,3,2,7,9);
			Set<Integer> set1 = new HashSet();
			List<Integer> numberList1 = new ArrayList<>();
			for(Integer num :numberList) {
				if(!set1.add(num)) {
					System.out.println(num);
					numberList1.add(num);
				};
			}
			System.out.println(numberList1);
			
			Map<Integer,Integer> map1 = new HashMap();
			
			map1.put(1, 1);
			map1.put(2, 2);
			map1.put(3, 3);
			
			for(Map.Entry<Integer, Integer> mapEntry:map1.entrySet()) {
				System.out.println(mapEntry.getKey());
				System.out.println(mapEntry.getValue());
			}

	}
	
	

}
