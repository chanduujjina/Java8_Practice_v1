package com.demo.java8.funcInterface;

import com.demo.java8.interfceinfo.BaseService3;

public class CustomFuncInterface3 {
	
	public static void main(String[] args) {
		
		BaseService3 service1 = new BaseService3() {
			
			@Override
			public int m1(int value1, int value2) {
				// TODO Auto-generated method stub
				return value1+value2;
			}
		};
		
		System.out.println(service1.m1(10, 20));
		
		
		BaseService3 service2 = ( a,  b) -> {return a+b;};
	        
	        System.out.println(service2.m1(30,40));
      
		
		
	}

}
