package com.demo.java8.funcInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerDemo {
	
	public static void main(String[] args) {
		
		BiConsumer<List<String>,String> biconsumer =  new BiConsumer<List<String>, String>() {
			
			@Override
			public void accept(List<String> nameList, String name) {
				
				nameList.add(name);
				
			}
		};
		List<String> names = new ArrayList<>();
		names.add("sachin");
		names.add("sehwag");
	     biconsumer.accept(names, "kohli");
	     
	     BiConsumer<List<String>,String> biconsumer_v1= (a,b)->names.add("kohli");
	     biconsumer.accept(names, "rohith");
	     
	     System.out.println(names);
		
	}

}
