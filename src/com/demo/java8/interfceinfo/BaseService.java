package com.demo.java8.interfceinfo;

@FunctionalInterface
public interface BaseService {
	
	
	default void m2() {
		System.out.println("inside parent m2 default method");
	}
	
	static void m3() {
		System.out.println("inside parent m3 static method");
	}
	
	//abstact method
	void m1();
	
	
	

}
