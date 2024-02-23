package com.edubridge.polymorphism;

// Overriding (runtime dynamic)
// method have same name with same parameters

class Animal{
	void eat() {
		System.out.println("Animal behavoiur");
	}
}

class Cat{
	void eat() {
		System.out.println("Cat Animal behavoiur");
	}
}
class Dog{
	void eat() {
		System.out.println("Dog Animal behavoiur");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Cat c = new Cat();
		Dog d = new Dog();
		
		a.eat();
		c.eat();
		d.eat();
	}

}
