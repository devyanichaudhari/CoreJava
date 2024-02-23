package com.edubridge.abstraction;

// Hiding the implementation details and showing only essential information to user

abstract class Orders{
	public void show() {
		System.out.println("This is show method");
	}
}

class Demo extends Orders{
	
}

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo = new Demo();
		
		demo.show();
	}

}
