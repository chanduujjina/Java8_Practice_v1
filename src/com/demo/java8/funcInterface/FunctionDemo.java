package com.demo.java8.funcInterface;

import java.util.function.Function;

public class FunctionDemo {
	
	public static void main(String[] args) {
		
		Function<String, Integer> func1 = new Function<String, Integer>() {

			@Override
			public Integer apply(String value) {
				// TODO Auto-generated method stub
				return Integer.parseInt(value);
			}
			
		};
		
		int value1 = func1.apply("123");
		Function<String, Integer> func1_v1 = (x)->Integer.parseInt(x);
		System.out.println(func1_v1.apply("123"));
		
		Function<String, Integer> func2 = new Function<String, Integer>() {

			@Override
			public Integer apply(String value) {
				// TODO Auto-generated method stub
				return value.indexOf("c");
			}
			
		};
		
		Function<String, Integer> func2_v1 = (x)-> x.indexOf("c");
		
		
		Function<String, Integer> func3 = new Function<String, Integer>() {

			@Override
			public Integer apply(String value) {
				// TODO Auto-generated method stub
				return value.length();
			}
			
		};
		
		Function<Integer, String> func4 = new Function<Integer, String>() {

			@Override
			public String apply(Integer value) {
				// TODO Auto-generated method stub
				return String.valueOf(value);
			}
			
		};
		
		
			
		
		
		
	}

}
