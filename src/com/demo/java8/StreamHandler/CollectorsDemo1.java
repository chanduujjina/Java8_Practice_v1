package com.demo.java8.StreamHandler;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo1 {

	public static void main(String[] args) {
		
	Stream<String> valueStream=	Stream.of("test1","test2","test3","test4","test5");
	
	//convert Stream to ArrayList
	List<String> valueList = valueStream.collect(Collectors.toList());
	
	System.out.println(valueList);
	
	//convert Stream to LinkedList
	
	Stream<String> valueStream1=	Stream.of("test1","test2","test3","test4","test5");
	
	LinkedList<String> linkedList = valueStream1.collect(Collectors.toCollection(LinkedList ::new));
	System.out.println(linkedList);
	
		
	}

}
