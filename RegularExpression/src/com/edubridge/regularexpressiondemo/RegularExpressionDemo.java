package com.edubridge.regularexpressiondemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "TV price is 500 Rs";
		//String regx = "(.*)(\\d+)(.*)";
		String regx = ".*s";
		
		Pattern p = Pattern.compile(regx);
		Matcher m = p.matcher(input);
		//Boolean b = m.matches();
		System.out.println(m.matches());
		

	}

}
