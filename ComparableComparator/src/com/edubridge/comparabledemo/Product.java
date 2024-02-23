package com.edubridge.comparabledemo;
import java.util.ArrayList;
import java.util.Collections;
import com.edubridge.comparatordemo.RatingCompare;

public class Product implements Comparable<Product>{
	private String pname;
	private int price;
	private int rating;

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.price - o.price;
	}

	public Product(String pname, int price, int rating) {
		super();
		this.pname = pname;
		this.price = price;
		this.rating = rating;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	public static void main(String[] args) {
		ArrayList<Product>list = new ArrayList<Product>();
		list.add(new Product("Speaker",5000,4));
		list.add(new Product("Mouse",100,2));
		list.add(new Product("TV",65000,3));
		list.add(new Product("Pendrive",400,1));
		Collections.sort(list);
		for(Product p:list)
		{
			System.out.println("Product Name: "+p.getPname()+"\nProduct Price: "+p.getPrice()+"\nProduct Rating: "+p.getRating());
		}
		System.out.println("Comparing Ratings By Comparator Interface");
		RatingCompare r = new RatingCompare();
		Collections.sort(list,r);
		for(Product p:list)
		{
			System.out.println("Product Name: "+p.getPname()+"\nProduct Price: "+p.getPrice()+"\nProduct Rating: "+p.getRating());
		}
	}
}
