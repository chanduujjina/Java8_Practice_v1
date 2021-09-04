package com.demo.java8.funcInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo1 {
	
	public static void main(String[] args) {
		
		Consumer<List<String>> consumer = new Consumer<List<String>>() {

			@Override
			public void accept(List<String> nameList) {
				System.out.println(nameList);
				
			}

		};
		consumer.accept(Arrays.asList("chandu","gouse"));
		Consumer<List<String>> consumer1 = (x)->System.out.println(x);
		consumer1.accept(Arrays.asList("siva","chandu"));
		
		
	}

}
