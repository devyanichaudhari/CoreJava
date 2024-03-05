package com.edubridge.designpattern.structural.facadedesignpattern;

public class FranchiseRegistration 
{
	Franchise KFC;
	Franchise McDonalds;
	Franchise Dominos;
	
public FranchiseRegistration() 
{
	KFC = new KFC();
	McDonalds = new McDonalds();
	Dominos = new Dominos();
}


public void BuyKFC()
{
	KFC.option();
	KFC.cost();
}
public void BuyMcDonalds()
{
	McDonalds.option();
	McDonalds.cost();
}
public void BuyDominos()
{
	McDonalds.option();
	McDonalds.cost();
}
}