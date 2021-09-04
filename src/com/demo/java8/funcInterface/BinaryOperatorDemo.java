package com.demo.java8.funcInterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer num1, Integer num2) {
				// TODO Auto-generated method stub
				return num1+num2;
			}
		};
		
		System.out.println(binaryOperator.apply(10, 40));
		
		BinaryOperator<Integer> binaryOperator_v1 = (a,b)->a+b;
		
		System.out.println(binaryOperator_v1.apply(30, 70));

	}

}
