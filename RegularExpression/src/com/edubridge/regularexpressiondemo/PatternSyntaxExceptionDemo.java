package com.edubridge.regularexpressiondemo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
//program to demonstrate on PatternSyntaxException
public class PatternSyntaxExceptionDemo {
	
	static String regex ="[";
	static String input="I Love Mumbai";
	static String replace = "cat";
	public static void main(String[] args) {
		try
		{
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(input);
			
			
		}
		catch(PatternSyntaxException e) 
		{
			System.out.println("PatternSyntaxException");
			System.out.println("Description :"+e.getDescription());
			System.out.println("Index :"+e.getIndex());
			System.out.println("Message :"+e.getMessage());
			
		}
		

	}

}
