package com.demo.java8.StreamHandler;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 {

	public static void main(String[] args) {
		
		
		
		Stream<Integer> numberStream1 = Stream.of(2,5,7,9,8,1,3);
		
		//9,8,1,3
		
		List<Integer> skipList =numberStream1.skip(3).collect(Collectors.toList());
		System.out.println(skipList);
		
		//9,8
		
		Stream<Integer> numberStream2 = Stream.of(2,5,7,9,8,1,3);
		
		List<Integer> skipList1 = numberStream2.skip(3).limit(2).collect(Collectors.toList());
		System.out.println(skipList1);
		
		Stream<Integer> salaryStream1 = Stream.of(20000,50000,70000,90000,80000,10000,30000);
		
		//max salary
	
		int maxSlary = salaryStream1.max((a,b)->a.compareTo(b)).get();
		
		Stream<Integer> salaryStream2 = Stream.of(20000,50000,70000,90000,80000,10000,30000);
		
		//min salary
		int minSalary = salaryStream2.min((a,b)->a.compareTo(b)).get();
		
		//sort the stream in descending order
		
		Stream<Integer> salaryStream3 = Stream.of(20000,50000,70000,90000,80000,10000,30000);
		
		Stream<Integer> desendingStream = salaryStream3.sorted((a,b)->b.compareTo(a));
		
		desendingStream.forEach(salry->System.out.println(salry));
		
		//sort the stream in ascending order
		
		Stream<Integer> salaryStream4 = Stream.of(20000,50000,70000,90000,80000,10000,30000);
				
		Stream<Integer> asendingStream = salaryStream4.sorted((a,b)->a.compareTo(b));
				
		asendingStream.forEach(salry->System.out.println(salry));
		
		//second highest salary from list of salaries
		
		Stream<Integer> salaryStream5 = Stream.of(20000,50000,70000,90000,80000,10000,30000);
		
	     int secondHighestSalary=	salaryStream5.sorted((a,b)->b.compareTo(a)).skip(1).findFirst().get();
	     
	     System.out.println("second Highest salry::"+secondHighestSalary);
	     
	     Stream<Integer> salaryStream6 = Stream.of(20000,50000,70000,90000,80000,10000,30000);
		
	
	}

}
