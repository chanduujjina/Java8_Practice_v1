package com.demo.java8.interfceinfo;

public class BaseServiceImpl implements BaseService{

	@Override
	public void m1() {
		System.out.println("inside m1 impl class");
		
	}
	
	@Override
	public void m2() {
		System.out.println("inside impl m2  method");
	}
	
	public static void m3() {
		System.out.println("inside impl m3 static method");
	} 
	
	public static void main(String[] args) {
		BaseService baseService = new BaseServiceImpl();
		
		baseService.m1();//abstract method
		
		baseService.m2();//default method
		
		BaseService.m3();//static method
		
		BaseServiceImpl.m3();//impl static methods
		
	}

}
