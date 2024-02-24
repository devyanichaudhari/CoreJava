package com.edubridge.regularexpressiondemo;
public class StringMethodDemo {

	public static void main(String[] args) {
		String str="Hey, Sakshi, Akshay, Priti";
		String[] res=str.split(",");
		for(String itr:res)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
		String str1="There are 4 members in my family";
		String regex="\\d+";
		String res1=str1.replaceAll(regex, "four");
		System.out.println(res1);
		

	}

}
