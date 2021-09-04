package com.demo.java8.interfceinfo;

@FunctionalInterface
public interface BaseService3 {
	
	default void m2() {
		System.out.println("inside parent m2 default method");
	}
	
	static void m3() {
		System.out.println("inside parent m3 static method");
	}
	
	
	int m1(int value1,int value2);
	
	

}
