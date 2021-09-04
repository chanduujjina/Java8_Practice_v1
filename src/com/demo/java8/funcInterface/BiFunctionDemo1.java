package com.demo.java8.funcInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionDemo1 {

	public static void main(String[] args) {
		
		BiFunction<String [],List<String>,Map> bifunc= (nameArray,nameList)->{
			Map<String, Integer> map = new HashMap<>();
			for(String name : nameArray) {
				nameList.add(name);
			}
			for(String name1 : nameList) {
			 if(map.containsKey(name1)) {
				 map.put(name1, map.get(name1)+1);
			 }
			 else {
				 map.put(name1,1); 
			 }
			}
			return map;
		};
		String nameArray[]  ={"vasu","mahesh","raju","chandu"};
		List<String> nameList =new ArrayList<>();
		nameList.add("chandu");
		nameList.add("mahesh");
		nameList.add("raju");
		nameList.add("gouse");
		
		System.out.println(bifunc.apply(nameArray, nameList));

	}

}
