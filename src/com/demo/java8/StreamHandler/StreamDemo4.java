package com.demo.java8.StreamHandler;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {

	public static void main(String[] args) {
		
		
		
		Stream<Integer> numberStream1 = Stream.of(9,7,3,2,1,5,6,4,10,8);
		
		int totalValue =numberStream1.reduce(0,(sum,num)->sum+num);
		System.out.println(totalValue);
		
		Stream<Integer> numberStream2 = Stream.of(9,7,3,2,1,5,6,4,10,8);
		
		//convert to Array list
		
	    List<Integer> numberList = numberStream2.collect(Collectors.toList());
	    Stream<Integer> numberStream3 = Stream.of(9,7,3,2,1,5,6,4,10,8);
	    
	    //convert to linkedList
	    
	   LinkedList<Integer> linkedList = numberStream3.collect(Collectors.toCollection(LinkedList :: new));
	   System.out.println(linkedList);
	   
	 //convert to Hash list
	  //convert to Hash list
	   
	   //convert stream to HashMap
	   Stream<Integer> numberStream4 = Stream.of(9,7,3,2,1,5,6,4,10,8);
	   
	   Map<Integer,Integer>  map = numberStream4.collect(Collectors.toMap(Function.identity(), Function.identity()));
		System.out.println(map);
		
		Stream<String> valueStream =Stream.of("test1","test2","test3","test4","test1");
		//value vs count
		
	Map<String, Long> map1 =valueStream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(map1);
	
	}

}
