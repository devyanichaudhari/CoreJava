package com.edubridge.stringtokenizerdemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringTokenizer st = new StringTokenizer("Hey there, I am using String Tokens");
		System.out.println(st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextElement());
		System.out.println(st.hasMoreElements());
		System.out.println(st.hasMoreTokens());
		System.out.println(st.hashCode());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
