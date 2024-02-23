package com.edubridge.abstractandinterface;

abstract class Animal{
	void eat() {
		System.out.println("Animal is eating");
	}
	
	abstract void bark();
}

class Dog extends Animal{
	void bark() {
		System.out.println("Dog is barking");
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		
		d1.eat();
		d1.bark();
	}

}
