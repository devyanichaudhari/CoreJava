package com.edubridge.generics;

// Program to demonstrate on Generic Class by passing single same type
class Citizen<T>{
	// where T defines any kind of type
	T str;
	T str1;
	
	void print(T str, T str1) {
		this.str = str;
		this.str1 = str1;
		System.out.println("The value is " + str + " " + str1);
	}
}

public class GenericClassDemo {

	public static void main(String[] args) {
		Citizen<String> c = new Citizen<>();
		c.print("Nagpur", "Indian");
	}
}