package com.demo.java8.StreamHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		
		
		List<Integer> valueList = Arrays.asList(9,7,3,2,1,5,6,4,10,8);
		
		int sum =0;
		for(Integer number :valueList) {
			sum = sum+number;
		}
		
		System.out.println(sum);

	}

}
