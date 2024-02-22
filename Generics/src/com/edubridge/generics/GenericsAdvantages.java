package com.edubridge.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsAdvantages {

	public static void main(String[] args) {
		// 1. Type-safety
		List<String> obj = new ArrayList<>();
		// It ensures that to add only String values
		// obj.add(11);					// 3. Compile time checking
		obj.add("11");
		obj.add("Atul");
		
		// 2. Type-casting is not required
		// List obj1 = new ArrayList();
		List<String> obj1 = new ArrayList<String>();
		obj1.add("Atul");
		// Without Generic, type-casting is required
		// String str1 = (String) obj1.get(0);
		String str1 = obj1.get(0);
		System.out.println(str1);
	}
}