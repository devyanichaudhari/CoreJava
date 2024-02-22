package com.edubridge.interfacedemo.methodreference;
/*Program to demonstrate on Referrence to a static method*/
public class GossipImplementation
{
	//Static Method
	public static void classroomGossip()
	{
		System.out.println("Implementing a Functional Interface");
	}
	public static void main(String[] args) 
	{
		Gossip g = GossipImplementation::classroomGossip;
		g.talk();
	}
}
