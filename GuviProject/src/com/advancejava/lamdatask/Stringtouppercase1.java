package com.advancejava.lamdatask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stringtouppercase1 {
	

	public static void main(String[] args) {
	List<String> obj = Arrays.asList("aBC","d", "ef");
	
	List<String> upper = obj.stream().map(String::toUpperCase).collect(Collectors.toList());
	
	System.out.println(upper);
	
	}

}
