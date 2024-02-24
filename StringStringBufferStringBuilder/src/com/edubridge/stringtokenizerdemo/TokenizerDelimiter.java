package com.edubridge.stringtokenizerdemo;

import java.util.StringTokenizer;

public class TokenizerDelimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("Java:Code:String",":",false);
		System.out.println(st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		

	}

}
