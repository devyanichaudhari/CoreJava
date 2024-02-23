package com.edubridge.encapsulation;

class Whatsapp{
	private String personName;
	private String status;
	
	public String getPersonName() {
		return personName;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Whatsapp w = new Whatsapp();
		
		w.setPersonName("John");
		w.setStatus("Life is a race");
		
		System.out.println("Person Name: " + w.getPersonName() + "\tStatus: " + w.getStatus());
	}

}
