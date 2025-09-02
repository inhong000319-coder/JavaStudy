package com.kh.inter.ex2;

public class Circle implements Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// 넓이 계산 => (원의 넓이) PI*radius*radius
		return Math.PI*radius*radius;
	}
	
	

}
