package com.advancejava.lamdatask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Nonemptystring2 {

	public static void main(String[] args) {
		List<String> obj = Arrays.asList("abc","","bc","efg","abcd","","jkl");
		
		List<String> Nonempty = obj.stream().filter(name -> !name.isEmpty()).
								collect(Collectors.toList());
		System.out.println("Non Empty strings are : " + Nonempty);
		
		for (String str : Nonempty) {
			System.out.println("Non Empty string are : " + str);
		}
	}

}
