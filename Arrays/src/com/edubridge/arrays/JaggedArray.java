package com.edubridge.arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		
		//Insert Array based on user Input
		@SuppressWarnings("resource")
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Number of rows you wish to insert:");
		int n=s.nextInt();
		int arr[][]=new int[n][];
		System.out.println("Enter the no of elements for row :");
		int m=s.nextInt();
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<m;j++)
			{
				
				arr[i][j]= s.nextInt();
			}	
			
		}
		for (int i=0;i<n;i++)
		{

			for (int j=0;j<arr[i].length;j++)
			{
				
				System.out.println(arr[i][j]+ " ");
				
			}	
			System.out.println();
			
		}
		
		

	}

}
