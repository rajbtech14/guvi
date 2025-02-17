package com.advancejava.lamdatask;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Student3 {
	public static void main(String[] args) {
		List<String> studentname = Arrays.asList("Aravind", "Raja", "suresh","martin", "Akash", "Ashish");
		
		List<String> filter = studentname.stream().
										filter(name -> name.startsWith("A")).
										collect(Collectors.toList());
	
		for (String str : filter) {
			System.out.println("Special gift goes to student who has name starts with" +" A : " + str);
		}
		
		
	
	}
	

}
