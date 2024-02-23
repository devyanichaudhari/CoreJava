package com.edubridge.inheritance;

class Dog{
	String color="black"; 
}
 class Cat extends Dog{
	
	String  color1="white";
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		//Dog d1=new Dog();
		Cat c1=new Cat();
		
		System.out.println("Dog colour is:"+c1.color+" \nCat color is:"+c1.color1);
	}

}
