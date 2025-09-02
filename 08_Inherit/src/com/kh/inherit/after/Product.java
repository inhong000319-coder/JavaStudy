package com.kh.inherit.after;

public class Product {
	//-----------공통적인 필드 -----------
	private String brand;
	private String code;
	private String name;
	private int price;
	//-------------------
	
	//-------생성자 -----------
	public Product() {}	//기본생성자
	
	public Product(String brand, String code, String name, int price) {
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
	}
	// ----------------------
	
	// -------공통적으로 사용된 메소드 -----
	public String information() {
		return "brand: " + brand + ", code: " + code + ", name: " + name + ", price: " + price;
		
	}
	//----------------
	//-----private 필드에 대한 getter/setter

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
	

}
