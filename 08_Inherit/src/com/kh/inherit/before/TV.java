package com.kh.inherit.before;
/*
 * 
 * TV 클래스
 * ----------------------
 * -brand:String
 * -code:String
 * -name:String
 * -price:int
 * -inch:int
 * -----------------------
 * +TV(모든 필드를 매개변수로 가짐)
 * +information():String
 * -----------------------
 */
public class TV {
	private String brand;
	private String code;
	private String name;
	private int price;
	private int inch;
	
	public TV(String brand, String code, String name, int price, int inch) {
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
		this.inch = inch;
	}
	
	public String information() {
		return "brand: " + brand + ", code: " + code + ", name: " + name + ", price: " + price + "m inch: " + inch;
		
	}

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

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	

}
