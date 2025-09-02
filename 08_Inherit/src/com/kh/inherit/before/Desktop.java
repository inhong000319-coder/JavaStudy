package com.kh.inherit.before;

public class Desktop {
	/*
	 * Desktop 클래스
	 * -------------
	 * -brand:String
	 * -code:String
	 * -name:String
	 * -price:int
	 * -allInOne:boolean
	 * ---------------
	 * +Desktop(brand:String, code:String
	 * 				, name:String, price:int, allInOne:boolean)
	 * +information():String
	 * -------------------
	 */
	private String brand;
	private String code;
	private String name;
	private int price;
	private boolean allInOne;
	
	public Desktop(String brand, String code, String name, int price, boolean allInOne) {
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
		this.allInOne = allInOne;
	}
	
	public String information() {
		return "brand: " + brand + ", code: " + code + ", name : " + name + ", price: " + price + ", allInOne: " + allInOne;
		// * String.format(포맷, ...):String
//		String.format("brand: %s, code: %s, name: %s, price: %d, allInOne: %b"< brand, code, name,price, allInOne);)
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

	public boolean isAllInOne() {		//=> getter
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	

}
