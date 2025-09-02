package com.kh.poly.ex2;

public class Lamborghini extends Car{
	
	
	
	public Lamborghini(String color, String fuel, int year) {
		super(color, fuel, year);
	}

	public void moveLamborghini() {
		System.out.println("move lamborghini");
	}
	
	@Override
	public void drive() {
		System.out.println("Lamborghini drive ~");
	}

}
