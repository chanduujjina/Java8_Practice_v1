package com.demo.java8.funcInterface;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		
		BiPredicate<Integer, String> biPredicate = new BiPredicate<Integer, String>() {
			
			@Override
			public boolean test(Integer value1, String value2) {
				
				return Integer.parseInt(value2)==value1;
			}
		};
		System.out.println(biPredicate.test(2, "2"));
		
		BiPredicate<Integer, String> biPredicate_v1 = (x,y)->Integer.parseInt(y)==x;
		System.out.println(biPredicate_v1.test(5, "6"));

	}

}
