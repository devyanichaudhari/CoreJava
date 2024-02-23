package com.edubridge.list;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<Integer> obj1 = new LinkedList<>();
		obj1.add(5);
		obj1.add(11);
		obj1.add(9);
		obj1.add(3);
		System.out.println(obj1);
		
		System.out.println(obj1.get(2));
		
		obj1.add(0, 0);
		System.out.println(obj1);
		
		System.out.println(obj1.getClass());
		
		System.out.println(obj1.contains(2));
		
		//for extracting list element
		for(Integer x : obj1)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		Iterator<Integer> i = obj1.listIterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		
		System.out.println();
		
		// sort method will sort according to ascending order-wise
		// reverse method will arrange the elements according to insertion order-wise in reverse order
		
		
		Collections.reverse(obj1);
		for(Integer x : obj1)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		Collections.sort(obj1);
		for(Integer x : obj1)
		{
			System.out.print(x+" ");
		}
		
	}

}