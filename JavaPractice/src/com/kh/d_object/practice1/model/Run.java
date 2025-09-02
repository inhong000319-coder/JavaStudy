package com.kh.d_object.practice1.model;

public class Run {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setName("아이폰16");
		p1.setPrice(10000000);
		p1.setBrand("애플");
		
		p1.information();
		
		
		Product p2 = new Product();
		p2.setName("갤럭시 S25");
		p2.setPrice(13500000);
		p2.setBrand("삼성");
		
		p2.information();

	}

}
