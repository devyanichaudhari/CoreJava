package com.edubridge.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Yukta";
		StringBuffer b1 = new StringBuffer(s.length());
		StringBuffer b = new StringBuffer("Yukta");
		System.out.println(b1.capacity());
		System.out.println(b.capacity());
		//System.out.println(s.capacity()); Capacity is not allowed for the string
		//System.out.println(b.append(" ")); As String is Immutable we cannot append it
		System.out.println(b.append("Yukta Shirodkar "));
		System.out.println(b.charAt(1));
		//System.out.println(b.isEmpty());
		StringBuffer b2 = new StringBuffer("");
		System.out.println(b2.capacity());
		b2 = new StringBuffer(" ");
		System.out.println(b2.capacity());
		b.setCharAt(1, 'i');
		//b.setCharAt(17, 'i'); Exception Range out of Bound
		System.out.println(b);
		System.out.println(b.charAt(1));

	}

}
