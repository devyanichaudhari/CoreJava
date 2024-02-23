package com.edubridge.interfacedemo;

// Implementable Class
public class Learner implements Deletable {
	
	// It provides run-time information about the objects
	public Boolean delete(Object o) {
		if(o instanceof Deletable)
			return true;
		
		return false;
	}
}
