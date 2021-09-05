package com.demo.java8.StreamHandler;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		//create Stream
		Stream<String> valueStream =Stream.of("test1","test2","test3","test4","test1");
		
		//Predicate<String> predicate = (x)->x.equals("test3");
		
	//	String result = valueStream.filter(predicate).findAny().get();
		
		Optional<String> optionalresult = valueStream.filter((x)->x.equals("test1")).findFirst();
		String result = optionalresult.isPresent() ?optionalresult.get() :null;
		System.out.println(result);
		
		Stream<String> valueStream1 =Stream.of("test1","test2","test3","test4","test1");
		
		//convert above Stream to ArrayList
		
		List<String> valueList = valueStream1.collect(Collectors.toList());
		
		System.out.println(valueList);
		
		Stream<Integer> numberStream =Stream.of(1,2,3,4,5,6,7,8,9);
		
		// response 1,9,25,49,81
		
		List<Integer> oddNumberList = numberStream.filter(x->x%2==1).map(x->x*x).collect(Collectors.toList());
		System.out.println(oddNumberList);
		
		Stream<String> valueStream2 =Stream.of("test1","test2","test3","test4","test1","test2");
		
		//get the unique values from Stream
		
		List<String> distinctValueList = valueStream2.distinct().collect(Collectors.toList());
		System.out.println(distinctValueList);
		
		Stream<Integer> numberStream1 = 	Stream.of(2,5,7,9,8,1,3);
		
		//get max value from stream
		//Comparator<Integer> comparator  = (a,b)->a.compareTo(b);
		//int max = numberStream1.max(comparator).get();
		int max = numberStream1.max((a,b)->a.compareTo(b)).get();
		System.out.println(max);
		
		Stream<Integer> numberStream2 = 	Stream.of(2,5,7,9,8,1,3);
		int min = numberStream2.min((a,b)->a.compareTo(b)).get();
		System.out.println(min);
		
		Stream<Integer> numberStream3 = 	Stream.of(2,5,7,9,8,1,3);
		
		//how to sort the Stream in ascending order
		
		int secondLeast = numberStream3.sorted().skip(1).findFirst().get();
		//1,2,4,5,7,8,9(sort)
		//2,4,5,7,8,9
		System.out.println(secondLeast);
		//sortedStream.forEach(num->System.out.println(num));
		
		
		
	
	}

}
