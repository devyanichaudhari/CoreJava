package com.edubridge.arrays;

import java.util.Scanner;

public class LargestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Number of rows you wish to insert:");
		int n=s.nextInt();
		int arr[]=new int[n];
		int res= arr[0];
		for (int i=0;i<n;i++)
		{
			arr[i] = s.nextInt();
			
		}
		for (int i=0;i<n;i++)
		{
			
			
			
			if (arr[i] > res)
			{
				res=arr[i];
			}	
			
			
		}
		System.out.println(res+ " is the largest element");
		
		
		

	}

}
