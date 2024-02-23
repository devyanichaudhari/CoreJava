package com.edubridge.finalkeyword;

// parent class

public class Card {
	private String cardName;
	// final variable must be initialized
	//private final String issuer;
	// we cannot set or change the value of final variable
	private final String issuer = "GOI";
	
	public final String getCardName() {
		return cardName;
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public String getIssuer() {
		return issuer;
	}
	
	@Override
	public String toString() {
		return "Card [cardName=" + cardName + ", issuer=" + issuer + ", toString()=" + super.toString() + "]";
	}
	
	final void accept() {
		System.out.println("Final Method");
	}
	
}
