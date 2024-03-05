package com.eb.main;

import java.util.Scanner;

import com.eb.dao.ProductDao;
import com.eb.pojo.Product;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = sc.next();
		System.out.println("Welcome to Product Management Portal "+name);
		int ch = 0;
		do
		{
			System.out.println("Press 1 to Add Product Details.");
			System.out.println("Press 2 to Update Product Details.");
			System.out.println("Press 3 to Delete Product Detail.");
			System.out.println("Press 4 to Display Product Details.");
			System.out.println("Press 5 to Exit");
			System.out.println("Please Enter your Choice:");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the Product Name:");
				String pname = sc.next();
				System.out.println("Enter the Product Price:");
				int price = sc.nextInt();
				System.out.println("Enter the Product Quantity:");
				int pquantity = sc.nextInt();
				Product p = new Product(pname,price,pquantity);
				boolean ans = ProductDao.insert(p);
				System.out.println("Data Inserted Successfully");
			break;
			case 2:
				System.out.println("");
				System.out.println("Press 2 to View Employee Details.");
				System.out.println("Press 3 to Update Employee Detail.");
			
			}
		}
		while(ch!=5);
	}

}
