package com.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lombok.entity.Menu;

@SpringBootApplication
public class LombokDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokDemoApplication.class, args);
		Menu m1 = new Menu(101,"Idli",120,3);
		Menu m2 = new Menu(102,"Dosa",100,4);
		Menu m3 = new Menu(104,"Medu Vada",160,5);
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}
}
