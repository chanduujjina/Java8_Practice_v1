package com.demo.java8.funcInterface;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		
		Predicate<String> predicate = new Predicate<String>() {
			
			@Override
			public boolean test(String value) {
				
				return value.equalsIgnoreCase("chandu");
			}
		};
		
		System.out.println(predicate.test("chandu"));
		
		Predicate<String> predicate_v1 = (x)->x.equalsIgnoreCase("gouse");
		System.out.println(predicate_v1.test("chandu"));

	}

}
