package com.edubridge.checkedexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f= new File("C:\\Users\\IT-Admin\\Downloads\\Hello1.txt");
		try {
			FileInputStream f1 = new FileInputStream(f);
			System.out.println("File does exist");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File does not exist" +e);
		}

	}

}