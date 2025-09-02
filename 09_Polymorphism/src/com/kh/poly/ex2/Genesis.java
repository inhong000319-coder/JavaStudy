package com.kh.poly.ex2;

public class Genesis extends Car {
	
	public Genesis(String color, String fuel, int year) {
		super(color, fuel, year);
	}
	
	public void moveGenesis() {
		System.out.println("move genesis ~");
	}
	
	@Override
	public void drive() {
		System.out.println("genesis drive~~");
	}

}
