package com.demo.java8.funcInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		Supplier<List<String>> supplier = new Supplier<List<String>>() {

			@Override
			public List<String> get() {
				// TODO Auto-generated method stub
				return new LinkedList<String>();
			}
		};
		System.out.println(supplier.get());
		
		Supplier<List<String>> supplier_v1= ()->new LinkedList<>();
		System.out.println(supplier_v1.get());
		
		//Method refrence
		Supplier<List<String>> supplier_v2 = LinkedList::new;
		
		System.out.println(supplier_v2.get());
		
	}

}
