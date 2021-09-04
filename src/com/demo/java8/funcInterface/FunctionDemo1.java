package com.demo.java8.funcInterface;

import java.util.function.Function;

public class FunctionDemo1 {
	
	public static void main(String[] args) {
		
		//requirement 1
		
		String path = "c:/chandu/abc.xml";
		
		Function<String, String> func = (x)->x.substring(x.lastIndexOf("/")+1, x.length());
		
		String fileName =func.apply(path);
		System.out.println(fileName);
		
	}

}
