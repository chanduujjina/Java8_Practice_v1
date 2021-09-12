package com.demo.java8.StreamHandler;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo5 {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1,1,2,3,4,5,6,3,2,7,9);
		
		//distinct
		
		List<Integer> distinctnumList =numberList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctnumList);
		
		//convert to set
		
		Set<Integer> numberSet =numberList.stream().collect(Collectors.toSet());
		System.out.println(numberSet);
		
		//duplicate numbers
		
		List<Integer> duplicateNumList_v1 = numberList.stream().filter(num->Collections.frequency(numberList, num)>1).distinct().collect(Collectors.toList());
		
		System.out.println(duplicateNumList_v1);
		
		Set<Integer> set1 = new HashSet();
		
		List<Integer> duplicateNumList_v2 = numberList.stream().filter(num->!set1.add(num)).collect(Collectors.toList());
		
		System.out.println(duplicateNumList_v2);
		
		Map<Integer, Long> map = numberList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		List<Integer> duplicateNumList_v3 = map.entrySet().stream().filter(entry->entry.getValue()>1).map(Entry::getKey).collect(Collectors.toList());
		System.out.println(duplicateNumList_v3);
		
		List<Integer> duplicateNumList_v31= numberList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(entry->entry.getValue()>1).map(Entry::getKey).collect(Collectors.toList());
		System.out.println(duplicateNumList_v31);
		
	}
}
