package com.edubridge.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		SortedMap<String, Float> obj = new TreeMap<>();
		obj.put("Atul", 78.5f);
		obj.put("Abhishek", 72.5f);
		obj.put("Amit", 88.5f);
		
		for(Map.Entry<String, Float> itr : obj.entrySet()) {
			System.out.println(itr.getKey() + " " + itr.getValue());
		}
	}
}