package com.edubridge.map;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {

	public static void main(String[] args) {
		// HashMap keys are arranged in ascending order while Hashtable key are arranges in descending order.
		Map<Integer, String> obj = new Hashtable<>();
		obj.put(3, "Shreyash");
		obj.put(2, "Atul");
		obj.put(5, "Shrey");
		// we cannot use key and value as "null" else we will get NullPointerException
		// obj.put(7, null);
		
		System.out.println(obj);

	}

}