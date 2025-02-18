package com.practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lamda {

	public static void main(String[] args) {
		ArrayList <Object>arr = new ArrayList<Object>();
		arr.add("mahesh");
		arr.add("mahesh");
		arr.add("suresh");
		System.out.println(arr);
		
		for (Object object : arr) {
			System.out.println(object);
		}
		
		List<Object> arr1 = Arrays.asList("raja", "vinoth");
		arr1.forEach(name -> System.out.println(name));
		
	}
}
