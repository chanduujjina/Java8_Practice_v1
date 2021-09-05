package com.demo.java8.StreamHandler;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		
		List<String> valueList = Arrays.asList("test1","test2","test3","test4");
		
		Optional<List<String>> optionalList = Optional.ofNullable(null);
		
		
		List<String> responevalueList = null;
		if(optionalList.isPresent()) {
			 responevalueList = optionalList.get();
		}
		else {
			responevalueList =Collections.EMPTY_LIST;
		}
		
		System.out.println(responevalueList);

	}

}
