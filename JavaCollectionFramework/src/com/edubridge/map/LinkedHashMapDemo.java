package com.edubridge.map;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> obj = new HashMap<>();
		obj.put(1, "Shreyash");
		obj.put(5, "Atul");
		obj.put(1, "Shrey");
		obj.put(7, null);
		
		System.out.println(obj);
		
		// to extract the elements of the map
		for(Map.Entry<Integer, String> itr : obj.entrySet()) {
			System.out.println(itr.getKey() + " " + itr.getValue());
		}
	}
}