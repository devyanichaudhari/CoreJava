package com.edubridge.customexceptiondemno;

@SuppressWarnings("serial")
public class LogginCredential extends Exception {
	
	//for error message
	private String str;
	public LogginCredential(String str) {
		super();
		this.str =str;
		
	}
	@Override
	public String toString() {
		return "LogginCredential [str=" + str + "]";
	}
	
	
	

}