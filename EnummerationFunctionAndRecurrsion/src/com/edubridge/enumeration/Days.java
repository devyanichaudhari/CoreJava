package com.edubridge.enumeration;

public enum Days {
	
	SUNDAY(0), MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6);
	private int i;
	
	Days(int index) {
		// TODO Auto-generated constructor stub
		i=index;
	}
	int displayIndex()
	{
		return i;
	}
	
	public static void main(String[] args) {
		System.out.println(Days.SATURDAY);
		System.out.println(Days.THURSDAY.displayIndex());
	}

}