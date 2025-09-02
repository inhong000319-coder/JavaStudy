package com.kh.f_poly.model.vo;

public class AniBook extends Book{
	private int accessAge;		//제한 나이
	
	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
	}

	@Override
	public String toString() {
		return "AniBook [" + super.toString() +", accessAge=" + accessAge + "]";
	}
	


			
	
	
	
}
