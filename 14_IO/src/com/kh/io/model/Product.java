package com.kh.io.model;

import java.io.Serializable;

/*
 *  * 직렬화 : 객체를 바이트 단위로 변환하여 저장 및 전송할 수 있도록 만드는 과정
 */

public class Product implements Serializable{
	private String name;
	private int price;
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

}
