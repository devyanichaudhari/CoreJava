package com.edubridge.assessment;
/*Program to print if the given Character is a vowel or constants*/
import java.util.*;
public class CharacterQuestion 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		//String str1 = sc.next();
		char ch = sc.next().charAt(0);
		sc.close();
		if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u')
		{
			System.out.println("Character is a vowel");
		}
		else
		{
			System.out.println("Character is Constant");
		}
	}
}
