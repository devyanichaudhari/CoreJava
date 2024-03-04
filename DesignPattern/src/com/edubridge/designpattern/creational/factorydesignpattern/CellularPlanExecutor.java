package com.edubridge.designpattern.creational.factorydesignpattern;

import java.util.*;

public class CellularPlanExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SelectNetworkPlan s1 = new SelectNetworkPlan();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the network for which you want to generate bill");
		String networkName = sc.next();
		
		System.out.println("Enter the number of Minutes: ");
		int min = sc.nextInt();
		
		CellularPlan c1 = s1.getPlan(networkName);
		System.out.println("Bill amount for "+networkName+"  for minutes "+min);
		c1.getRate();
		c1.processBill(min);
	}

}
