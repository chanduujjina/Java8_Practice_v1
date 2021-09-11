package com.demo.java8.StreamHandler;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.demo.java8.entity.Employee;
import com.demo.java8.service.EmployeeService;

public class EmployeeStreamHandler1 {

	public static void main(String[] args) {
	
		 List<Employee> employeeList = EmployeeService.getEmployeeList();
		 
		 //option 1
		 
		List<String> nameList =  employeeList.stream().map(emp->emp.getEmpName()).collect(Collectors.toList());
		System.out.println(nameList);
		
		 //option 2
		
		List<String> nameList_v1 = employeeList.stream().map(Employee :: getEmpName).collect(Collectors.toList());
		System.out.println(nameList);
		
		//distinct namelist
		
		List<String> distinctNameList =employeeList.stream().map(Employee :: getEmpName).distinct().collect(Collectors.toList());
		System.out.println(distinctNameList);
		
		//list of employee ids
		
		List<Integer> employeeIdList_v1 =	employeeList.stream().map(Employee :: getEmpId).collect(Collectors.toList());
		System.out.println(employeeIdList_v1);
		
		//fetch the employeelist of it dept
		
		List<Employee> filteredList= employeeList.stream().filter(emp->emp.getDeptName().equalsIgnoreCase("IT")).collect(Collectors.toList());
		System.out.println(filteredList);
		
		//getting max salary from employee list
		
		double maxSalary = employeeList.stream().mapToDouble(Employee::getSalary).max().getAsDouble();
		System.out.println(maxSalary);
		
	//getting min salary from employee list
		
		double minSalary = employeeList.stream().mapToDouble(Employee::getSalary).min().getAsDouble();
		System.out.println(minSalary);
		
		double averageSalary = employeeList.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
		System.out.println(averageSalary);
		
		double sumOfSalaries = employeeList.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println(sumOfSalaries);
		
		//dept vs count
		//it 3
		//hr 1
		//admin 1
		
		Map<String, Long> deptVSEmpCountMap =	employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
		System.out.println(deptVSEmpCountMap);
		
		//sorting  mechanism
		
		//sort employee list by id asc
		
		List<Employee> sortedEmployeeByidAsc= employeeList.stream().sorted((x,y)->x.getEmpId()-y.getEmpId()).collect(Collectors.toList());
		System.out.println(sortedEmployeeByidAsc);
		
		//sort employee list by id desc
		
		List<Employee> sortedEmployeeByiddesc= employeeList.stream().sorted((x,y)->y.getEmpId()-x.getEmpId()).collect(Collectors.toList());
		System.out.println(sortedEmployeeByiddesc);
		
		//sort employee list by name 
		List<Employee> sortedEmployeeByName = employeeList.stream().sorted((a,b)->a.getEmpName().compareToIgnoreCase(b.getEmpName())).collect(Collectors.toList());
		System.out.println(sortedEmployeeByName);
		
		//sort employee list by salary asc
		
		List<Employee> sortedEmployeeBySalaryAsc =employeeList.stream().sorted(Comparator.comparingDouble(Employee ::getSalary)).collect(Collectors.toList());
		
		System.out.println(sortedEmployeeBySalaryAsc);
		
		//sort employee list by salary desc
		
		List<Employee> sortedEmployeeBySalarydesc =employeeList.stream().sorted(Comparator.comparingDouble(Employee ::getSalary).reversed()).collect(Collectors.toList());
				
		System.out.println(sortedEmployeeBySalarydesc);
		
		//sort employee list salary then name
		
		 Comparator<Employee> compareBySalaryThenName=	Comparator.comparingDouble(Employee ::getSalary).thenComparing((a,b)->a.getEmpName().compareToIgnoreCase(b.getEmpName()));
			
	     List<Employee> sortedEmployeeBySalarythenName =employeeList.stream().sorted(compareBySalaryThenName).collect(Collectors.toList());
		System.out.println(sortedEmployeeBySalarythenName);
		
		//get the name list after natural sorting
		List<String> sortednameList  = employeeList.stream().map(Employee::getEmpName).sorted().collect(Collectors.toList());
		System.out.println(sortednameList);
		
		Employee secondminSalaryEmployee = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).skip(1).findFirst().get();
		System.out.println(secondminSalaryEmployee);
		
		Employee secondMaxSalaryEmployee = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().get();
		System.out.println(secondMaxSalaryEmployee);
	}

}
