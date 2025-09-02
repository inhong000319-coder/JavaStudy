package com.kh.homework1;

public class Model {
	private String brand;
	private String name;
	private String engine;
	private int hp;
	public Model() {
		super();
	}
	public Model(String brand, String name, String engine, int hp) {
		super();
		this.brand = brand;
		this.name = name;
		this.engine = engine;
		this.hp = hp;
	}
	@Override
	public String toString() {
		return "Model [brand=" + brand + ", name=" + name + ", engine=" + engine + ", hp=" + hp + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

}
