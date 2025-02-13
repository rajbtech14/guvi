package com.exceptionandcollection;
import java.util.HashMap;
import java.util.Map;
public class Hashmap {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Raja",  1);
		map.put("lavish", 3);
		map.put("mahesh", 2);
		map.put("suresh", 4);
		
		System.out.println(map);
		
		//For each loop
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + val);
		}
		
		map.remove("Raja");
		System.out.println(map);
	}

}
