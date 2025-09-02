package com.kh.d_object.practice1.model;

public class Product {
	private String name;
	private int price;
	private String brand;
	
	public Product() {}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void information() {
		System.out.println(name + " / " + price + " / " + brand);
	}

}
