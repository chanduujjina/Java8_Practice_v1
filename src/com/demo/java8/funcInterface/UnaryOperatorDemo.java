package com.demo.java8.funcInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> unOperator = new UnaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer num) {
				// TODO Auto-generated method stub
				return num+10;
			}
		};
		
		System.out.println(unOperator.apply(10));
		
		UnaryOperator<Integer> unOperator_v1 = (x)->x+10;
		System.out.println(unOperator_v1.apply(20));

	}

}
