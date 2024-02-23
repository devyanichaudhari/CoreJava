package com.edubridge.interfacedemo.methodreference;

// Program to demonstrate on Reference to a Static Method
public class GossipImplementation {
	
	// Static Method
	public static void classroomGossip() {
		System.out.println("Implementating a Functional Interface");
	}
	
	public static void main(String[] args) {
		Gossip g = GossipImplementation::classroomGossip;
		g.talk();
	}
}
