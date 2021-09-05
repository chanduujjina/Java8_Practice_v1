package com.demo.java8.StreamHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
	
		
		
		List<String> nameList = new ArrayList();
		
		nameList.add("chandu");
		
		nameList.add("siva");
		nameList.add("gouse");
		
		//creating stream from List
		
		Stream<String> nameStream1 = nameList.stream();
		
		nameStream1.forEach(name->System.out.println(name));
		
		//create stream from Set
		
      Set<String> nameSet = new HashSet();
		
      nameSet.add("test1");
		
      nameSet.add("test2");
      nameSet.add("test3");
      
      Stream<String> nameStream2 =  nameSet.stream();
      nameStream2.forEach(name->System.out.println(name));
      
     //static way of creating stream
      
      Stream<String> nameStream3 =  Stream.of("pawan","mahesh","raju","vasu");
      nameStream3.forEach(name->System.out.println(name));
      
     // creating stream using gernerate
      
      Stream<List<String>> nameStream4= Stream.generate(()-> Arrays.asList("test","test1")).limit(1);
      nameStream4.forEach(name->System.out.println(name));
      
      
      
		
		

	}

}
