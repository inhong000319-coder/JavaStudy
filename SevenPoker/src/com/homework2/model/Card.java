package com.homework2.model;

public class Card {
	private String design;	// 카드 문양
	private int num;		// 카드 숫자
	
	
	public Card() {
		
	}

	public Card(String design, int num) {
		
		this.design = design;
		this.num = num;
	}


	@Override
	public String toString() {
		String n;
		
		switch(num) {
		case 11:
			n = "J";
			break;
		case 12:
			n="Q";
			break;
		case 13:
			n="K";
			break;
		case 14:
			n="A";
			break;
			default: n = String.valueOf(num);
		}
		return design + n;
	}
	

}