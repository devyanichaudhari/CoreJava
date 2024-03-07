package com.eb.main;

import java.util.Scanner;

import com.eb.dao.ProductDao;
import com.eb.pojo.Product;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
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
				ProductDao.update();
				System.out.println("Product Updated Successfully");
			break;
			case 3:
				System.out.println("Enter which ID you want to Delete");
				int id = sc.nextInt();
				ProductDao.delete(id);
				System.out.println("Product Deleted Successfully");
			break;
			case 4:
				ProductDao.display();
			break;
			case 5:
				System.out.println("Bye Bye :)");
				break;
			default:
				System.out.println("You have Entered Wrong Choice");
			}
		}
		while(ch!=5);
	}

}
