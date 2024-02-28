package com.edubridge.arrays;

import java.util.Scanner;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Number of arrays you wish to insert:");
		int m=s.nextInt();
		System.out.println("Enter the Number of Values you wish to insert:");
		int n=s.nextInt();
		System.out.println("Enter the Elements of the Array: ");
		//two d Array declaration
		int arr[][]=new int[m][n];
		//storing the array elements
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=s.nextInt();
			
			}
		}
		
		//Printing the Array
		System.out.println("Arrayt Elements are: ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+ " ");
			
			}
			System.out.println();
		}
	}

}
