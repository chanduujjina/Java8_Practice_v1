package com.demo.java8.funcInterface;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> bifunc1 = new BiFunction<Integer, Integer, Integer>() {
			
			@Override
			public Integer apply(Integer num1, Integer num2) {
				// TODO Auto-generated method stub
				return num1+num2;
			}
		};
		
		System.out.println(bifunc1.apply(1, 2));
		
		BiFunction<Integer, Integer, Integer> bifunc1_v1 = (a,b)->{return a+b;};
		
		System.out.println(bifunc1_v1.apply(1, 2));

	}

}
