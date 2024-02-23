package com.edubridge.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

// Program to demonstrate on LocalDate, LocalTime and LocalDateTime
public class LocalDateTimeDemo {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println("Current date is " + d);
		
		LocalTime t = LocalTime.now();
		System.out.println("Current time is " + t);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Current date and time is " + dt);
	}
}