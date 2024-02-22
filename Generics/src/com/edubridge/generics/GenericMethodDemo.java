package com.edubridge.generics;

// Program to demonstrate on Generic Method

public class GenericMethodDemo {
	
	// where E stands for any kind of argument type
	public static <E> void accept(E[]arr) {
		for(E itr : arr) {
			System.out.print(itr + " ");
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] arr1 = {55, 4, 67, 89, 70};
		String[] arr2 = {"Atul", "Abhishek", "Aditya", "Amit", "Ankesh"};
		System.out.println("The first array is: ");
		GenericMethodDemo.accept(arr1);
		System.out.println("The second array is: ");
		GenericMethodDemo.accept(arr2);
	}
}