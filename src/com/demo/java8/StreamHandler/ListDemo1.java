package com.demo.java8.StreamHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		
		
		List<String> valueList = Arrays.asList("test1","test2","test3","test4");
		
		//fetch or get the value from list
		String result = null;
		for(String value : valueList) {
			if(value.equals("test3")) {
				result= value;
				break;
			}
		}
		
		System.out.println(result);

	}

}
