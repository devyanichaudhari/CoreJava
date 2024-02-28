package com.edubridge.arrays;

import java.util.Scanner;

//To demonstrate single dimensional Run time Array
public class RunTimeArray {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Number of records you wish to insert:");
		int n=s.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++)
		{
			arr[i] = s.nextInt();
			
		}
		System.out.println("Array Elements are :");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+ " ");
		}

	}

}
