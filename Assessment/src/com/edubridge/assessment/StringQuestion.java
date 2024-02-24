package com.edubridge.assessment;

import java.util.Scanner;

public class StringQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str1 = sc.nextLine();
		
		sc.close();
		str1.toLowerCase();
		int vowelcount=0;
		int constantcount=0;
		for(int i=0;i<str1.length();i++)
		{
			char ch =str1.charAt(i);
			if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u')
			{
				vowelcount++;
			}
			else
			{
				constantcount++;
			}
		}
		System.out.println("Vowels present in the String :"+vowelcount);
		System.out.println("Constants present in the String :"+constantcount);
	}

}
