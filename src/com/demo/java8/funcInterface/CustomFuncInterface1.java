package com.demo.java8.funcInterface;

import com.demo.java8.interfceinfo.BaseService;

public class CustomFuncInterface1 {
	
	public static void main(String[] args) {
		
		BaseService service = new BaseService() {
			@Override
			public void m1() {
				System.out.println("inside m1 method");
			}
		};
		
		service.m1();
		
		//lamda function
		
		//()->,(a,b)->
		
      BaseService service1 = () -> System.out.println("inside m1 method");
      
      service1.m1();
      
		
		
	}

}
