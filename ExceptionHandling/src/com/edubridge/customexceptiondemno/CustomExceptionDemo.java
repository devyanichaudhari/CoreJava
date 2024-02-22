package com.edubridge.customexceptiondemno;

import java.util.Scanner;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String email_id= s.next();
		String password=s.next();
		try {
			if(email_id.equals("yukta1707@gmail.com") && password.equals("abc@123"))
				System.out.println("Logged in Successfully");
			else {
				throw new LogginCredential("Invalid");
			}
		}
		catch(LogginCredential e){
			
			System.out.println(e);
		
		}
		
		

	}

}