package com.mypet.model;

public interface PetType {
	
	//메소드 재정의
	public abstract void eat(Pet pet);
	public abstract void play(Pet pet);
	void clean(Pet pet);		//public abstract 는 생략 가능
	String getType();
		
	}


