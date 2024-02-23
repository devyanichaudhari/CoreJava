package com.edubridge.thiskeyword;

// this keyword can be used to return (invoke) the current class instance

public class ThisKeywordDemoThree {
	
	public int x;
	ThisKeywordDemoThree(){
		// this keyword is calling to parameterized constructor
		this(20);
		System.out.println("This is non-paramterized constructor");
	}
	
	ThisKeywordDemoThree(int x){
		this.x = x;
		System.out.println("This is paramterized constructor" + x);
	}

	public static void main(String[] args) {
		ThisKeywordDemoThree obj = new ThisKeywordDemoThree();

	}

}
