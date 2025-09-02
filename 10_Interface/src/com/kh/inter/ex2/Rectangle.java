package com.kh.inter.ex2;

public class Rectangle implements Shape{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		// 사각형 넓이 => 가로*세로
		return width*height;
	}

}
