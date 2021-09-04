package com.demo.java8.funcInterface;

import com.demo.java8.interfceinfo.BaseService1;

public class CustomFuncInterface2 {
	
	public static void main(String[] args) {
		
		BaseService1 service = new BaseService1() {
			
			@Override
			public boolean m1(String value) {
				// TODO Auto-generated method stub
				return value.startsWith("c");
			}
		};
			
		
		System.out.println(service.m1("chandu"));
		
		//lamda function
		
		//()->,(a,b)->
		
      BaseService1 service1 = (x) -> {
    	  return x.startsWith("c");
       };
      
      System.out.println(service1.m1("gouse"));
      
		
		
	}

}
