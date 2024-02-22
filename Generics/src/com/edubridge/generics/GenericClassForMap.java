package com.edubridge.generics;

//Program to demonstrate on Generic Class by passing multiple parameters of different type
class Dictionary<K, V>{
	// where K, V defines any kind of type
	K key;
	V value;
	
	void print(K key, V value) {
		this.key = key;
		this.value = value;
		System.out.println(key + ": " + value);
	}
}

public class GenericClassForMap {

	public static void main(String[] args) {
		Dictionary<Character, String> c = new Dictionary<>();
		c.print('a', "Acclerate");
		c.print('b', "Balance");
		c.print('c', "Cyclone");
		c.print('d', "Dynamic");
	}
}